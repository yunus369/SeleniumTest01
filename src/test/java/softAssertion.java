import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

public class softAssertion {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
        SoftAssert sc=new SoftAssert();
        driver.findElement(By.xpath("//a[contains(text(),'Best Sellers')]")).click();
        String act=driver.findElement(By.cssSelector(".a-carousel-heading")).getText();
        String exp="Bestsellers in Clothing & Accessories";
        sc.assertEquals(act,exp);
        driver.navigate().back();
        sc.assertAll();

    }
}
