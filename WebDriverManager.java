import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverManager {
    
    public WebDriver getDriver() {
        // Set the path to the WebDriver executable
        System.setProperty("webdriver.chrome.driver", "./chromedriver");
        
        // Instantiate the WebDriver and return it
        return new ChromeDriver();
    }
}