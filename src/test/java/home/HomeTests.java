package home;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomeTests extends BaseTests {
    @Test
    public void testCanViewDemo() {
        homePage.clickWatchDemo();
        homePage.submitWatchDemoForm("Joe","Fake","joe@fake.com", "5555555555");
        Assert.assertTrue(homePage.videoPlayerDisplayed(),"Video player was not displayed");
    }

    @Test
    public void testErrorMessageDisplays() {
        String errorMessage = "There was a problem with your submission. Please review the fields below.";

        homePage.clickWatchDemo();
        homePage.clickSubmit();
        Assert.assertEquals(errorMessage, homePage.getErrorMessage());
    }
}
