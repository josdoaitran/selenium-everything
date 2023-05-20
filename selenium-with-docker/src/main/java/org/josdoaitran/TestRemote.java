package org.josdoaitran;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class TestRemote {
    @Test
    public void TestRemoteExample() throws MalformedURLException {
        System.setProperty("webdriver.http.factory", "jdk-http-client");
        ChromeOptions chromeOptions = new ChromeOptions();
//        chromeOptions.addArguments("--headless=new");
        chromeOptions.addArguments("--no-sandbox");
        WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4441"), chromeOptions);
        driver.get("https://google.com");
        System.out.println(driver.getTitle());
//        driver.quit();
    }

    @Test
    public void TestWebDriver(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");
        System.out.println(driver.getTitle());
    }
}