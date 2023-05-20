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