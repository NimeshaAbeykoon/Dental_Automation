package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class Home {
    WebDriver driver;
    WebDriverWait wait;

    // Replace these with your actual XPaths
    By menuIcon = By.xpath("//*[@id=\"sideiconmenu\"]/li[3]/a");
    By searchField = By.xpath("//*[@id=\"mCSB_2_container\"]/input");
    By multipleAppointmentsOption = By.xpath("//*[@id=\"mCSB_2_container\"]/div[1]/ul/li[2]/ul/li[1]");

    public Home(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void openMultipleAppointments() {
        // 1. Click menu icon
        wait.until(ExpectedConditions.elementToBeClickable(menuIcon)).click();

        // 2. Type in search
        wait.until(ExpectedConditions.visibilityOfElementLocated(searchField)).sendKeys("multiple appointments");

        // 3. Click on "Multiple Appointments" option
        wait.until(ExpectedConditions.elementToBeClickable(multipleAppointmentsOption)).click();

        System.out.println("✅ Navigated to Multiple Appointments section.");
    }
}
