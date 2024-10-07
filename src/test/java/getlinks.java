import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

public class getlinks {
    public static void main(String[] args) throws IOException, InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize();
        System.out.println(driver.findElements(By.tagName("a")).size());
      WebElement src=driver.findElement(By.id("gf-BIG"));
        System.out.println("Footer section:-"+src.findElements(By.tagName("a")).size());

       WebElement src1= driver.findElement(By.xpath("//table/tbody/tr/td/ul"));
        System.out.println("From first sction:-"+src1.findElements(By.tagName("a")).size());

        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");

        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
         wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("gf-BIG")));

         WebElement footer=driver.findElement(By.id("gf-BIG"));
         File footerSection=footer.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(footerSection,new File("C:\\Users\\myunu\\IdeaProjects\\Project_01\\reports\\footerSection.png"));



        for(int i=1; i<src1.findElements(By.tagName("a")).size();i++){
            String clickOnTab=Keys.chord(Keys.CONTROL,Keys.ENTER);
            src1.findElements(By.tagName("a")).get(i).sendKeys(clickOnTab);
            Set<String> windows=driver.getWindowHandles();
            Iterator<String> it =windows.iterator();
            String parent=it.next();
            String chid=it.next();
            driver.switchTo().window(chid);
            Thread.sleep(3000);
            System.out.println(driver.getTitle());
            driver.close();
            driver.switchTo().window(parent);
        }


    }
}
