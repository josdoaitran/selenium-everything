package org.josdoaitran;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestRemote {
    @Test
    public void TestRemoteExample(){
        WebDriver driver = new ChromeDriver();
    }

    @Test
    public void TestWebDriver(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");
        System.out.println(driver.getTitle());
    }
}