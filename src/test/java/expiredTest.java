import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class expiredTest {
    public static void main(String[] args) {

        ChromeOptions options1 = new ChromeOptions();
        options1.setAcceptInsecureCerts(true);
        WebDriver driver=new ChromeDriver(options1);
        driver.get("https://expired.badssl.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));


        System.out.println( driver.getTitle());

    }
}
