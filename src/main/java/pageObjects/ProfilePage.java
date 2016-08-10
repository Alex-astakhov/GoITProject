package pageObjects;

import core.MethodsFactory;
import org.openqa.selenium.By;
import ru.yandex.qatools.allure.annotations.Step;

/**
 * Created by Alex Astakhov on 25.07.2016.
 */
public class ProfilePage extends MethodsFactory {
    private By smallPhoto1 = By.xpath(".//*[@class='photo-col__elem'][1]");
    private By deletePhoto = By.xpath(".//*[@class='left delete']");
    private String url = "https://kismia.com/profile";


    @Step
    public void getPage(){
        driver().get(url);
    }

    @Step
    public void clickOnPhoto1(){
        click(smallPhoto1);
    }

    @Step
    public void deletePhoto1(){
        click(deletePhoto);
    }

}
