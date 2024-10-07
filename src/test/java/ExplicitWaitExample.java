import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitExample {
    public static void main(String[] args) {
        // Set up WebDriver (make sure to have the appropriate driver for your browser)
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        WebDriver driver = new ChromeDriver();

        // Navigate to a web page
        driver.get("https://example.com");

        // Create an instance of WebDriverWait
      //  WebDriverWait wait = new WebDriverWait(driver,20);  // Timeout of 20 seconds

        // Wait until the element is visible
        //WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("elementId")));

        // Perform actions on the element
       // element.click();

        // Close the browser
        driver.quit();
    }
}
