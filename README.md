# selenium-tutorial-everything
We collect all information about Selenium here.
### DevTools In Selenium 4
- https://www.selenium.dev/documentation/webdriver/bidirectional/chrome_devtools/
- https://applitools.com/blog/selenium-4-chrome-devtools/

### - Selenium 3 and older vs Selenium 4
Here is the documents to collect steps to compare Selenium 3 and Selenium 4: 
- SeleniumHQ: [Link](https://www.selenium.dev/documentation/webdriver/getting_started/upgrade_to_selenium_4/)
- Saucelabs Documents: [Here](https://saucelabs.com/resources/blog/how-to-upgrade-to-selenium-4)

### - Selenium 4 with Java 11 version

On Selenium HQ version 4.6: https://www.selenium.dev/blog/2022/introducing-selenium-manager/ We will have Selenium Driver Manager in Selenium Dependcies.

Using Java 11+ HTTP Client in Selenium 4.5.0 and beyond: [Link](https://www.selenium.dev/blog/2022/using-java11-httpclient/)


- Implicitly Wait From older to Selenium 4:
```
# Older:
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
# Selenium 4
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
```
- Explicit Wait From older to Selenium 4:
```
# Older:
WebDriverWait wait = new WebDriverWait(driver,10);
wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".classlocator")));
# Selenium 4
WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".classlocator")));
```

### - Topic: Upload files in Selenium: 
Refer to: [here](https://github.com/josdoaitran/upload-webDriver-tutorial)

### - Topic: Handle permission Popup Appium:
Refer to: https://www.browserstack.com/docs/app-automate/appium/advanced-features/handle-permission-pop-ups

### - Topic: Selenium with Docker
- Solution 1: We the selenium with Selenium Node / Selenium Grid
Refer to: [here](selenium-with-docker/readme.md)
- Solution 2: We run our Selenium browser with Headless browser:
Refer to https://www.selenium.dev/blog/2023/headless-is-going-away/
+ Headless in newest chrome version - version 109 and older
+ Headless in older version:   `chromeOptions.addArguments("--headless");`

### - Topic Selenium with Appium and AWS Device Farm Example
Example: [Here](./java-selenium-appium-device-farm/Readme.md)

# Note: 
- Headless Browser: https://www.selenium.dev/blog/2023/headless-is-going-away/
- Reference: https://github.com/EricRicketts/UdemySeleniumWebDriverInJavaBasicsToAdvanced
- AWS Device Farm: https://docs.aws.amazon.com/devicefarm/latest/developerguide/welcome.html
