package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SuccessStoriesPage {
    private WebDriver driver;
    private WebDriverWait wait;

    private By agent47Link = By.cssSelector("[href=\"https://www.theredx.com/blog/case-study/new-agent-lists-47-homes-in-one-year-from-using-mail-merge/\"]");
    private By h2 = By.tagName("h2");

    public SuccessStoriesPage(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, 15);
    }

    public void clickSuccessStory() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(agent47Link));
        driver.findElement(agent47Link).click();
    }

    public String getBlogTitle(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(h2));
        return driver.findElement(h2).getText();
    }
}
