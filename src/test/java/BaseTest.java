import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BaseTest {
    ChromeDriver driver;
    public ChromeDriver openBrowser()
    {
        ChromeDriver driver = new ChromeDriver();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.navigate().to("https://www.demoblaze.com");
        return driver;
    }
}
