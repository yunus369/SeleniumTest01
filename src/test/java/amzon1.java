import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.io.File;
import java.io.IOException;

public class amzon1 {
    public static void main(String[] args) throws IOException {

        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
//        WebDriverWait wait =new WebDriverWait(driver,5);
       /// driver.manage().timeouts().implicitlyWait(30);



       // wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//a[contains(text(),'Best Sellers')]"))));
        WebElement links=driver.findElement(By.xpath("//a[contains(text(),'Best Sellers')]"));

        driver.switchTo();
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("document.querySelector('.tableFixHead').scrollTop=500");
        File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src,new File("C:\\Users\\myunu\\IdeaProjects\\Project_01\\reports\\screenshot1"));




       // wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//a[contains(text(),'Best Sellers')]"))));
    driver.findElement(By.xpath("//a[contains(text(),'Best Sellers')]")).click();
        String act=driver.findElement(By.cssSelector(".a-carousel-heading")).getText();
        String exp="Bestsellers in Amazon Launchpad";
        Assert.assertEquals(act,exp);
        driver.navigate().back();
        Assert.assertFalse(driver.findElement(By.xpath("//a[contains(text(),'Amazon Pay')]")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.xpath("//a[contains(text(),'Best Sellers')]")).isDisplayed());
      //  driver.manage().timeouts().implicitlyWait(30);
        driver.close();
    }
}
