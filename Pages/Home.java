package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class Home {
    WebDriver driver;
    WebDriverWait wait;

    // Replace these with your actual XPaths
    By menuIcon = By.xpath("/html/body/div[2]/div[4]/div[2]/ul/li[3]/a/img");
    By searchField = By.xpath("//*[@id=\"mCSB_2_container\"]/input");
    By multipleAppointmentsOption = By.xpath("//*[@id=\"mCSB_2_container\"]/div[1]/ul/li[2]/ul/li[1]");

    public Home(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    }

    public void openMultipleAppointments() {
        // 1. Click menu icon
         WebElement element1 = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//li[@data-target='#CHANNELLING_1']/a")
        ));

        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element1);



        // 2. Type in search
        WebElement searchInput = wait.until(ExpectedConditions.visibilityOfElementLocated(
            By.xpath("//*[@id='mCSB_2_container']/input")
        ));

        searchInput.clear();

        searchInput.sendKeys("multiple appointment");
        
        // 3. Click on "Multiple Appointments" option
        wait.until(ExpectedConditions.elementToBeClickable(multipleAppointmentsOption)).click();

        System.out.println("✅ Navigated to Multiple Appointments section.");
    }
}
