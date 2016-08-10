package core;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import ru.yandex.qatools.allure.annotations.Attachment;
import ru.yandex.qatools.allure.annotations.Step;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Created by Alex Astakhov on 21.05.2016.
 */
public class MethodsFactory {

    public static ThreadLocal<WebDriver> DRIVER = new ThreadLocal<>();
    public WebDriver driver;

    @Step("Type to {1} field {0}")
    public void type(By locator, String s){
        driver().findElement(locator).clear();
        driver().findElement(locator).sendKeys(s);
    }

    @Step("Type to {1} field {0}")
    public void type(WebElement w, String s){
        w.clear();
        w.sendKeys(s);
    }

    public void click(By by){
        driver().findElement(by).click();
    }

    public static WebDriver driver(){
        return DRIVER.get();
    }

    public void get(String url){
        driver().get(url);
    }



    /*public static void waitForElementIsClicable(By element){
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public boolean waitForUrlContains(String text, int sec){
        for(int i = 0; i<=sec*10; i++){
            if(driver.getCurrentUrl().contains(text)) {
                return true;
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return false;
    }
    public static void waitForURL(String text, int sec){
        WebDriverWait wait = new WebDriverWait(driver, sec);
        wait.until(ExpectedConditions.urlContains(text));
    }

    public String getFieldsAttribute(By element, String attributName){
        try {
            return driver.findElement(element).getAttribute(attributName);
        }catch (NoSuchElementException e){return " ";}
    }

    protected static void waitUntilElementIsVisible(By by, int sec){
        WebDriverWait wait = new WebDriverWait(driver, sec);
            try {
                wait.until(ExpectedConditions.visibilityOfElementLocated(by));
            }catch (TimeoutException e){}
    }

    public boolean attributeIsPresent(By by, String attr){
        String s = driver.findElement(by).getAttribute(attr);
        if (s.equals(null))
            return false;
        else
            return true;
    }

    @Step("Choose {1} from drop down list {0}")
    public void chooseFromDropList(By list, String value){
        *//*driver.findElement(list).click();
        waitUntilElementIsVisible(value, 3);
        driver.findElement(value).click();*//*
        Select select = new Select(driver.findElement(list));
        select.selectByValue(value);
    }

    public static void refresh(){
        driver.findElement(By.xpath("//body")).sendKeys(Keys.F5);
    }

    @Attachment(value = "{0}", type = "image/png")
    public static byte[] pngAttachment(String fileName){
        File scrFile = ((TakesScreenshot) BrowserFactory.driver).getScreenshotAs(OutputType.FILE);
        // Now you can do whatever you need to do with it, for example copy somewhere
        try {
            // FileUtils.copyFile(scrFile, new File(System.getProperty("user.dir") + "\\" + fileName));
            return Files.readAllBytes(Paths.get(scrFile.getPath()));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new byte[0];
    }*/
}
