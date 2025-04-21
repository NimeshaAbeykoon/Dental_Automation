import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import Pages.Login_f;

public class App {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Dental\\TreatmentDrawings\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://candela.monoroc.com/");

        Login_f loginPage = new Login_f(driver);
        loginPage.loginWithDefaultCredentials(); 

        driver.quit();
    }
}