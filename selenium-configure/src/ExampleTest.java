import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExampleTest {
    WebDriver driver;

    @BeforeAll
    static void setupAll() {
    }

    @BeforeEach
    void setup() {
        driver = new ChromeDriver();
        driver.get("http://automationtesting.in/");
    }

    @AfterEach
    void teardown() {
        driver.quit();
    }

    @Test
    void test() {

    }
}