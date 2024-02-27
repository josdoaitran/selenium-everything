# GuideLine
Hi all, Testing4everyone gives this note to share to you the step by step to build-up and initialize a test framework:
+ java
+ selenium
+ maven
+ cucumber
+ TestNG

# Steps
Here is the highlight steps, you can follow and refer to recorded video on Youtube channel
## Create a new Java Maven project
## Add the dependiencies as below
https://mvnrepository.com/
- TestNG
```agsl
<!-- https://mvnrepository.com/artifact/org.testng/testng -->
<dependency>
    <groupId>org.testng</groupId>
    <artifactId>testng</artifactId>
    <version>7.9.0</version>
    <scope>test</scope>
</dependency>
```
- Cucumber
```agsl
<!-- https://mvnrepository.com/artifact/io.cucumber/cucumber-java -->
<dependency>
    <groupId>io.cucumber</groupId>
    <artifactId>cucumber-java</artifactId>
    <version>7.15.0</version>
</dependency>

```
- Selenium
```agsl
<!-- https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java -->
<dependency>
    <groupId>org.seleniumhq.selenium</groupId>
    <artifactId>selenium-java</artifactId>
    <version>4.17.0</version>
</dependency>

```
