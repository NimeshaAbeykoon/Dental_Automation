// src/App.java
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import Pages.Login;

public class App {
    public static void main(String[] args) {
        Login loginPage = new Login();
        
        try {
            // Perform login without passing parameters
            loginPage.loginToSite();
            
        } finally {
            loginPage.closeBrowser();
        }
    }
}