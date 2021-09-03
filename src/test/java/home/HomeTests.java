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
}
