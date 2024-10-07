import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class screenShot {
    public static void main(String[] args) throws IOException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize();
//        File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//        FileUtils.copyFile(src,new File("C:\\Users\\myunu\\IdeaProjects\\Project_01\\reports\\screenshot01.png"));


//        WebElement inpout=driver.findElement(By.cssSelector(".tableFixHead"));
//        File output=inpout.getScreenshotAs(OutputType.FILE);
//        FileUtils.copyFile(output,new File("C:\\Users\\myunu\\IdeaProjects\\Project_01\\reports\\screenshot02.png"));

        WebElement inpout=driver.findElement(By.id("name"));
        File output=inpout.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(output,new File("C:\\Users\\myunu\\IdeaProjects\\Project_01\\reports\\screenshot02.png"));



//       TakesScreenshot shot=(TakesScreenshot)driver;
//       File screen=shot.getScreenshotAs(OutputType.FILE);
//        FileUtils.copyFile(screen,new File("C:\\Users\\myunu\\IdeaProjects\\Project_01\\reports\\screenshot02.png"));


        TakesScreenshot src=(TakesScreenshot)driver;
        File screen=src.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screen,new File(""));



        driver.close();

    }
}
