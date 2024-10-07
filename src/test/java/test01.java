import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class test01 {
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
       driver.get("https://www.amazon.in/");
        //driver.navigate().to("https://www.amazon.in/");
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        driver.findElement(By.xpath("//a[contains(text(),'Sell')]")).click();
        System.out.println(driver.getTitle());
        //soft assertion
        System.out.println(driver.getCurrentUrl());
        String actul=driver.findElement(By.cssSelector(".color-white")).getText();
        String expet="Become an Amazon.in seller";
        driver.navigate().back();
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        //assertion
        System.out.println("the value :-"+actul);
        System.out.println("the valu we need:-"+expet);
        Assert.assertEquals(actul,expet);
        //hard
//        Assert.assertTrue();
//        Assert.assertFalse();
//        Assert.assertEquals();
//        SoftAssert soft=new SoftAssert();
//        soft.assertFalse();
//        soft.assertTrue();
//        soft.assertEquals();
//        soft.assertAll();



    }
}
