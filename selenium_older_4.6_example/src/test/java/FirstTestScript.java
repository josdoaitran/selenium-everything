import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTestScript {
    public static void main(String[] args) {
        String os = System.getProperty("os.name");
        if (os.contains("windows")) {
            System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
        }else {
            System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver");
        }
        WebDriver driver = new ChromeDriver();
        driver.get("http://automationtesting.in/");
    }
}
