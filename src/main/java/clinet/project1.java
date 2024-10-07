package clinet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.SQLOutput;
import java.time.Duration;
import java.util.List;
import java.util.stream.Stream;

public class project1 {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();

        driver.get("https://rahulshettyacademy.com/client/");
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        driver.findElement(By.id("userEmail")).sendKeys("yunus@mailinator.com");
        driver.findElement(By.id("userPassword")).sendKeys("Yunus@111");
        driver.findElement(By.id("userPassword")).getText();
        driver.findElement(By.id("userPassword")).clear();
        driver.findElement(By.id("userPassword")).click();
        driver.findElement(By.id("userPassword")).submit();
        driver.findElement(By.id("userPassword")).isDisplayed();
        driver.findElement(By.id("userPassword")).isEnabled();
        driver.findElement(By.id("userPassword")).isSelected();
        driver.findElement(By.id("search")).sendKeys("mobile");
        driver.findElement(By.id("search")).submit();

        driver.findElement(By.id("login")).click();
        List<WebElement> prods=driver.findElements(By.cssSelector("div.mb-3"));
        WebElement product=prods.stream().filter(prod->prod.findElement(By.cssSelector("b")).getText().equals(("ZARA COAT 3"))).findAny().orElse(null);
    }
}
