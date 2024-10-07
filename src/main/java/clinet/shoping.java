package clinet;

import dev.failsafe.internal.util.Durations;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class shoping {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/client/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
        driver.findElement(By.id("userEmail")).sendKeys("yunus@mailinator.com");
        driver.findElement(By.id("userPassword")).sendKeys("Yunus@111");
        driver.findElement(By.id("login")).click();
        List<WebElement> products=driver.findElements(By.cssSelector(".mb-3"));
      WebElement prod=  products.stream().filter(product->
                product.findElement(By.cssSelector("b")).getText().equals("ADIDAS ORIGINAL")).findFirst().orElse(null);
                 prod.findElement(By.cssSelector(".card-body button:last-of-type")).click();

        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("toast-container"))));
       // wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//button[@routerlink='/dashboard/cart']"))));
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[@routerlink='/dashboard/cart']")).click();
    }
}
