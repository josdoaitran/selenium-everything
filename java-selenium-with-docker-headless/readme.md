## All notes related to how we can run Web Automation test - Selenium with Docker
Using Java 11.
# Selenium version >4.5
- Dependencies

```agsl
<dependency>
    <groupId>org.seleniumhq.selenium</groupId>
    <artifactId>selenium-java</artifactId>
    <version>4.9.0</version>
</dependency>
<dependency>
    <groupId>org.seleniumhq.selenium</groupId>
    <artifactId>selenium-http-jdk-client</artifactId>
    <version>4.9.0</version>
</dependency>
```

# Selenium version <4.5:
TBD soon :)

# Selenium version <4 (Selenium 3):
We should consider selenium 3 with
```agsl
<dependency>
    <groupId>io.github.bonigarcia</groupId>
    <artifactId>webdrivermanager</artifactId>
    <version>${webdrivermanager.version}</version>
</dependency>
```

# Selenium Docker image and start container:
- Run local with selenium standardlone
```agsl
//Selenium image and run container in stardalone
// Chrome
docker run --rm -it -p 4444:4444 -p 7900:7900 --shm-size 2g selenium/standalone-chromium:latest
// Firefox
docker run --rm -it -p 4444:4444 -p 7900:7900 --shm-size 2g selenium/standalone-firefox:latest
```
- or Build in Docker compose file (Docker Selenium standalone)
```agsl
version: "3.8"

services:
  chrome:
    image: selenium/standalone-chrome:latest
    container_name: chrome
    volumes:
      - '/dev/shm:/dev/shm'
    shm_size: '2gb'
    ports:
      - "4444:4444"
      - "7901:7900"

#  firefox:
#    image: selenium/standalone-firefox:latest
#    container_name: firefox
#    volumes:
#      - '/dev/shm:/dev/shm'
#    shm_size: '2gb'
#    ports:
#      - "4442:4444"
#      - "7902:7900"
  test:
    build: .
    container_name: test-docker-local
    depends_on:
      - chrome
```
- Password to access VNC: `secret` access via this port: 7901
- Docker run with selenium-hub:
Refer to this link to get docker container: [Link](https://hub.docker.com/u/selenium)

# Docker Selenium Hub and Node:
- Refer to this link from SeleniumHQ: [Link](https://github.com/SeleniumHQ/docker-selenium)
- Refer to this file: `docker-compose-hub.yml`
- To execute this docker-compose yml file use `docker-compose -f docker-compose-hub.yml up`
- We will set the URL of remote server to this port: `4444`: URL='https://localhost:444'

# Note:
- https://medium.com/@ahamedabdulrahman/dockerize-selenium-java-project-and-run-selenium-scripts-within-docker-container-c2603d1bac3f
