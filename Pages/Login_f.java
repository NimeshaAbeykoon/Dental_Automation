package Pages;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.Alert;
import java.time.Duration;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_f{
    WebDriver driver;

    // Constructor
    public Login_f(WebDriver driver) {
        this.driver = driver;
    }

    // Locators
    By continueToLoginBtn = By.xpath("/html/body/div[1]/div[6]/div[1]/input");
    By companyCodeInput = By.xpath("//*[@id='comp_code']");
    By usernameInput = By.xpath("//*[@id='user_name']");
    By continue_btn = By.xpath("//*[@id=\"Continue\"]");
    By passwordInput = By.xpath("//*[@id=\"user_pw\"]");
    By finalContinueBtn = By.xpath("//*[@id='Login']");

    String companyCode = "ss";
    String username = "Ait_ss";
    String password = "Ait@1234";

    // Methods
    public void loginWithDefaultCredentials() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    
        wait.until(ExpectedConditions.elementToBeClickable(continueToLoginBtn)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(companyCodeInput)).sendKeys(companyCode);
        wait.until(ExpectedConditions.visibilityOfElementLocated(usernameInput)).sendKeys(username);
        wait.until(ExpectedConditions.elementToBeClickable(continue_btn)).click();
        wait.until(ExpectedConditions.elementToBeClickable(passwordInput)).sendKeys(password);
        wait.until(ExpectedConditions.elementToBeClickable(finalContinueBtn)).click();
    }
}