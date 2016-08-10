package switchToOtherWindow;

import core.BrowserFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.util.Set;

/**
 * Created by Alex Astakhov on 28.07.2016.
 */
public class TestSwitch extends BrowserFactory {

    public void waitForWindowsToBe(int number, int seconds){   // ожидание количества окон, сделанное вручную
        for (int i = 0; i < seconds; i++) {
           if(driver().getWindowHandles().size() == number)
            return;
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){}
        }
    }

    @Test
    public void first() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver(), 5);
        get("https://kismia.com");
        String mainWindow = driver().getWindowHandle();

        click(By.cssSelector(".mailru.in_popup"));
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));
        Set<String> windowHandles = driver().getWindowHandles();
        for (String window: windowHandles){
            if (!window.equals(mainWindow))
                driver().switchTo().window(window);
        }
        type(By.id("login"), "lalala");
        driver().switchTo().window(mainWindow);
        Thread.sleep(5000);

    }
}
