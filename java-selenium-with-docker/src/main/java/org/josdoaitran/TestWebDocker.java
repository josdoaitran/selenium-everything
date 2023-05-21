package org.josdoaitran;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class TestWebDocker {
    @Test
    public void TestRemoteExample() throws MalformedURLException {
//        https://www.selenium.dev/blog/2022/using-java11-httpclient/
        System.setProperty("webdriver.http.factory", "jdk-http-client");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--no-sandbox");
        WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444"), chromeOptions);
        driver.get("https://google.com");
        System.out.println(driver.getTitle());
        driver.close();
        driver.quit();
    }
}