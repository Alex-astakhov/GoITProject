package mobilePageObject;

import com.thoughtworks.selenium.webdriven.commands.WaitForCondition;
import core.MethodsFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import ru.yandex.qatools.allure.annotations.Step;

/**
 * Created by Alex Astakhov on 25.07.2016.
 */
public class ProfilePage  extends MethodsFactory {
    private By addPhotoBtn = By.className("add_photo");
    private By photoInput = By.id("upload_file_input");
    private By bullets = By.xpath(".//ul[@class='bullets']/*");
    private String url = "https://m.kismia.com/profile";

    @Step
    public void getPage(){
        driver().get(url);
    }

    @Step
    public int getPhotoCount(){
        return driver().findElements(bullets).size();
    }

    @Step
    public void clickAddPhoto(){
        click(addPhotoBtn);
    }

    @Step
    public void uploadPhoto(String photoPath){
        driver().findElement(photoInput).sendKeys(photoPath);
    }

}
