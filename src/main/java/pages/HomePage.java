package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
    private WebDriver driver;
    private WebDriverWait wait;

    private By cookieWindow = By.cssSelector("#cookie-window");
    private By logoSlidebar = By.cssSelector(".logos");
    private By watchDemoBtn = By.cssSelector(".btn.btn-red-outline.gated");

    //Demo Form
    private By watchDemoFormContainer = By.id("gform_fields_16");
    private By firstNameField = By.cssSelector("[name=\"input_3\"]");
    private By lastNameField = By.cssSelector("[name=\"input_9\"]");
    private By emailField = By.cssSelector("[name=\"input_2\"]");
    private By phoneField = By.cssSelector("[name=\"input_7\"]");
    private By submitBtn = By.cssSelector("#gform_submit_button_16");
    private By clsBtn = By.cssSelector(".close-btn");

    public HomePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 15);
    }

    public void clickWatchDemo() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(watchDemoBtn));
        driver.findElement(watchDemoBtn).click();
    }

    public void submitWatchDemoForm(String firstName, String lastName, String email, String phone) {
        inputFirstName(firstName);
        inputLastName(lastName);
        inputEmail(email);
        inputPhoneNumber(phone);
        driver.findElement(submitBtn).submit();
    }

    private void inputFirstName(String firstName){
        wait.until(ExpectedConditions.visibilityOfElementLocated(watchDemoFormContainer));
        driver.findElement(firstNameField).sendKeys(firstName);
    }

    private void inputLastName(String lastName){
        wait.until(ExpectedConditions.visibilityOfElementLocated(watchDemoFormContainer));
        driver.findElement(lastNameField).sendKeys(lastName);
    }

    private void inputEmail(String email){
        wait.until(ExpectedConditions.visibilityOfElementLocated(watchDemoFormContainer));
        driver.findElement(emailField).sendKeys(email);
    }

    private void inputPhoneNumber(String phone) {
        driver.findElement(phoneField).sendKeys(phone);
    }

    public boolean videoPlayerDisplayed(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(clsBtn));
        return driver.findElement(clsBtn).isDisplayed();
    }
}
