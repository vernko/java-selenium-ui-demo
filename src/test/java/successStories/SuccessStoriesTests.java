package successStories;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.SuccessStoriesPage;

public class SuccessStoriesTests extends BaseTests {
    @Test
    public void testCanViewSuccessStory(){
        String agent47 = "New Agent Lists 47 Homes in One Year From Using Mail Merge";

        SuccessStoriesPage successStoriesPage = homePage.gotoSuccessStories();
        successStoriesPage.clickSuccessStory();
        Assert.assertEquals(agent47, successStoriesPage.getBlogTitle());
    }
}
