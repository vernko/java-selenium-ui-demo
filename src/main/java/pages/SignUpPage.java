package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignUpPage {
    private WebDriver driver;
    private WebDriverWait wait;

    private By emailField = By.cssSelector("[name=\"email\"]");
    private By fnameField = By.cssSelector("[name=\"firstName\"]");
    private By lnameField = By.cssSelector("[name=\"lastName\"]");
    private By phoneField = By.cssSelector("[name=\"phoneNumber\"]");
    private By postalCodeField = By.cssSelector("[name=\"postalCode\"]");
    private By nextBtn = By.cssSelector("[name=\"next\"]");
    private By errorMsg = By.cssSelector(".error-msg");

    public SignUpPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 15);
    }

    public void enterContactInfo(String email, String first, String last, String phone, String postalCode){
        inputEmail(email);
        inputFirstName(first);
        inputLastName(last);
        inputPhone(phone);
        inputPostalCode(postalCode);
    }

    public String getError(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(errorMsg));
        return driver.findElement(errorMsg).getText();
    }


    public void inputEmail(String email){
        wait.until(ExpectedConditions.visibilityOfElementLocated(emailField));
        driver.findElement(emailField).sendKeys(email);
    }

    public void inputFirstName(String first){
        wait.until(ExpectedConditions.visibilityOfElementLocated(fnameField));
        driver.findElement(fnameField).sendKeys(first);
    }

    public void inputLastName(String last){
        wait.until(ExpectedConditions.visibilityOfElementLocated(lnameField));
        driver.findElement(lnameField).sendKeys(last);
    }

    public void inputPhone(String phone){
        wait.until(ExpectedConditions.visibilityOfElementLocated(phoneField));
        driver.findElement(phoneField).sendKeys(phone);
    }

    public void inputPostalCode(String postalCode){
        wait.until(ExpectedConditions.visibilityOfElementLocated(postalCodeField));
        driver.findElement(postalCodeField).sendKeys(postalCode);
    }

    public boolean isClickable(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(nextBtn));
        return driver.findElement(nextBtn).isEnabled();
    }
}
