package mobile;

import core.BrowserFactory;
import mobilePageObject.MainPage;
import mobilePageObject.ProfilePage;
import org.testng.Assert;

import org.testng.annotations.Test;

/**
 * Created by Alex Astakhov on 25.07.2016.
 */
public class UploadPhoto extends BrowserFactory {
    MainPage mainPage = new MainPage();
    ProfilePage profilePage = new ProfilePage();


    @Test
    public void uploadNextPhoto() throws InterruptedException {
        mainPage.getPage();
        mainPage.login("bevov@divismail.ru", "ahtung");
        int beforeCount = profilePage.getPhotoCount();
        profilePage.clickAddPhoto();
        profilePage.uploadPhoto("E:\\leo.jpg");
        Thread.sleep(6000);
        Assert.assertEquals(profilePage.getPhotoCount(), beforeCount + 1);
    }

    @Test(dependsOnMethods = {"uploadNextPhoto"})
    public void deletePhoto(){
        int beforeCount = profilePage.getPhotoCount();
        pageObjects.ProfilePage profilePage = new pageObjects.ProfilePage();
        profilePage.getPage();
        profilePage.clickOnPhoto1();
        profilePage.deletePhoto1();
        this.profilePage.getPage();
        Assert.assertEquals(this.profilePage.getPhotoCount(), beforeCount - 1);

    }

}
