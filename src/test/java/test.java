import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {
    public static void main(String[] args) {


        WebDriver driver=new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/client/");
        System.out.println(driver.getTitle());
    }
}
