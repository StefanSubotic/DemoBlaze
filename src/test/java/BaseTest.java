import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BaseTest {
    ChromeDriver driver;
    public ChromeDriver openBrowser()
    {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.navigate().to("https://www.demoblaze/");
        return driver;
    }
}
