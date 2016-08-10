package mobilePageObject;

import core.MethodsFactory;
import org.openqa.selenium.By;
import ru.yandex.qatools.allure.annotations.Step;

/**
 * Created by Alex Astakhov on 25.07.2016.
 */
public class MainPage extends MethodsFactory {
    private By loginFld = By.name("email");
    private By passwordFld = By.name("password");
    private By submit = By.xpath(".//*[@type='submit']");

    @Step
    public void typeEmail(String email){
        type(loginFld, email);
    }

    @Step
    public void typePassword(String passwd){
        type(passwordFld, passwd);
    }

    @Step
    public void clickSubmit(){
        click(submit);
    }

    @Step
    public void getPage(){
        get("http://m.kismia.com/");
    }

    @Step
    public void login(String email, String passwd){
        typeEmail(email);
        typePassword(passwd);
        clickSubmit();
    }
}
