## All notes related to how we can run Web Automation test - Selenium with Dockjer
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
- Run local:
```agsl
//Selenium image and run container in stardalone
docker run --rm -it -p 4441:4444 -p 7901:7900 --shm-size 2g seleniarm/standalone-chromium:latest
docker run --rm -it -p 4442:4444 -p 7902:7900 --shm-size 2g seleniarm/standalone-firefox:latest
```
- or Build in Docker compose file: 
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
      - "4441:4444"
      - "7901:7900"

  firefox:
    image: selenium/standalone-firefox:latest
    container_name: firefox
    volumes:
      - '/dev/shm:/dev/shm'
    shm_size: '2gb'
    ports:
      - "4442:4444"
      - "7902:7900"
```
- Password to access VNC: `secret` access via this port: 7901

Note: 
- https://medium.com/@ahamedabdulrahman/dockerize-selenium-java-project-and-run-selenium-scripts-within-docker-container-c2603d1bac3f
