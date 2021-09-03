package signup;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.SignUpPage;

public class SignUpTests extends BaseTests {
    @Test
    public void testEnterValidContactInfo(){
        SignUpPage signUpPage = homePage.clickBuyNow();
        signUpPage.enterContactInfo("test@testerson", "Just", "Testing", "435749001", "54601");
        Assert.assertTrue(signUpPage.isClickable());
    }

    @Test
    public void testEmailFieldErrorMessageDisplays(){
        String emailErr = "Please, enter a valid email.";

        SignUpPage signUpPage = homePage.clickBuyNow();
        signUpPage.inputEmail("test");
        Assert.assertEquals(emailErr, signUpPage.getError());
    }

    @Test
    public void testPhoneFieldErrorMessageDisplays(){
        String phoneErr = "Please, enter a valid phone.";

        SignUpPage signUpPage = homePage.clickBuyNow();
        signUpPage.inputPhone("test");
        Assert.assertEquals(phoneErr, signUpPage.getError());
    }

    @Test
    public void testPostalCodeFieldErrorMessageDisplays(){
        String postalCodeErr = "Please, enter a valid postal code.";

        SignUpPage signUpPage = homePage.clickBuyNow();
        signUpPage.inputEmail("test");
        Assert.assertEquals(postalCodeErr, signUpPage.getError());
    }
}
