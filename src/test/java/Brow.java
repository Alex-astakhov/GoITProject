import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

/**
 * Created by Alex Astakhov on 25.07.2016.
 */
public class Brow {

    @Test
    public void test(){
        WebDriver driver = new ChromeDriver();
        driver.get("http://google.com");
        driver.quit();
    }
}
