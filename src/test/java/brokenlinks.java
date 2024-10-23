import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class brokenlinks {
    public static void main(String[] args) throws IOException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/#");
        driver.manage().window().maximize();
        WebElement link=driver.findElement(By.xpath("//a[contains(text(),'Broken Link')]"));
        String url=link.getAttribute("href");
        HttpURLConnection con=(HttpURLConnection)new URL(url).openConnection();
        con.setRequestMethod("HEAD");
        con.connect();
        System.out.println(con.getResponseCode());
    }
}
