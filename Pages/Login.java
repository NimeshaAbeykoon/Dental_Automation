/*package Pages;

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


public class Login {
    private WebDriver driver;

   
    public Login() {
        System.setProperty("webdriver.chrome.driver", "C:\\Dental\\TreatmentDrawings\\chromedriver.exe");
        this.driver = new ChromeDriver();
    }

    public void runAllTestCases() throws Exception{
        driver.get("https://candela.monoroc.com//");
        loginToSite();

    }
    public void loginToSite(String url, String companyCode, String userName, String password) {
        driver.get("https://candela.monoroc.com//");

        enterCompanyCode("SS");
        enterUserName("Ait_ss");
        clickContinue();
        enterPassword("Ait@1234");
        clickLogin();

    }

    public void clickContinuetoLogin() {
        driver.findElement(By.xpath("/html/body/div[1]/div[6]/div[1]/input")).click();
    }

    // Methods to perform login
    public void enterCompanyCode(String companyCode) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement companycodeField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='comp_code']")));
        
        companycodeField.sendKeys(companyCode);

    }

    public void enterUserName(String userName) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement usernameField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='user_name']")));
        
        usernameField.sendKeys(userName);
    }

    public void clickContinue() {
        driver.findElement(By.xpath("//*[@id='Continue']")).click();
    }

    public void enterPassword(String password) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement passwordField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='user_pw']")));

        passwordField.sendKeys(password);
    }

    public void clickLogin() {
        driver.findElement(By.xpath("//*[@id='Login']")).click();
    }


}*/