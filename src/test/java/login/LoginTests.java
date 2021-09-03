package login;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTests extends BaseTests {
    @Test
    public void testCorrectErrorDisplaysForUsernameField(){
        String errorMessage = "Missing username";

        LoginPage loginPage = homePage.goToLogin();
        loginPage.inputPassword("faker315!");
        loginPage.clickLogin();
        String msg = loginPage.getToastMessage();
        Assert.assertEquals(errorMessage,msg, msg + " did not match " + errorMessage);
    }

    @Test
    public void testCorrectErrorDisplaysForPasswordField(){
        String errorMessage = "Missing password";

        LoginPage loginPage = homePage.goToLogin();
        loginPage.inputUsername("faker315");
        loginPage.clickLogin();
        String msg = loginPage.getToastMessage();
        Assert.assertEquals(errorMessage,msg, msg + " did not match " + errorMessage);
    }
}
