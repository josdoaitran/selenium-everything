import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.HashMap;
import java.util.Map;

public class ExampleTest {
    WebDriver driver;

    @BeforeAll
    static void setupAll() {
    }

    @BeforeEach
    void setup() {
        // Create ChromeOptions instance
        ChromeOptions options = new ChromeOptions();
        // Set desired Chrome options
        options.addArguments("--disable-infobars"); // Disable the 'Chrome is being controlled by automated test software' notification
        options.addArguments("--incognito"); // Open the browser in incognito mode

        // Specify the download folder path
        String downloadFolderPath = "/path/to/download/folder";

        // Set the download directory
        options.addArguments("download.default_directory=" + downloadFolderPath);

        // To set disable checking web security, ssl, and certificate error on Non-Prod environment
        options.addArguments("--disable-web-security");
        options.addArguments("--ignore-ssl-errors=yes");
        options.addArguments("--ignore-certificate-errors");

        // 2 ways to block 3rd party cookies
        // Option 1
        options.addArguments("--block-third-party-cookies");
        // Option 2

/*        Map<String, Object> prefs = new HashMap<>();
        prefs.put("profile.block_third_party_cookies", true);
        options.setExperimentalOption("prefs", prefs);*/

        driver = new ChromeDriver(options);
        driver.get("http://automationtesting.in/");
    }

    @AfterEach
    void teardown() {
//        driver.quit();
    }

    @Test
    void test() {

    }
}