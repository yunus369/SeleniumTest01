import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

public class FluentWaitExample {
    public static void main(String[] args) {
        // Set up WebDriver (make sure to have the appropriate driver for your browser)
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        WebDriver driver = new ChromeDriver();

        // Navigate to a web page
        driver.get("https://example.com");

        // Implement FluentWait
        FluentWait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(30))       // Maximum wait time
                .pollingEvery(Duration.ofSeconds(5))       // Check every 5 seconds
                .ignoring(NoSuchElementException.class);   // Ignore this exception during the wait

        // Define the condition to wait for
        WebElement element = wait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                WebElement ele = driver.findElement(By.id("elementId"));  // Locate element by ID
                if (ele.isDisplayed()) {
                    return ele;
                } else {
                    return null;
                }
            }
        });

        // Perform actions on the element
        element.click();

        // Close the browser
        driver.quit();
    }
}
