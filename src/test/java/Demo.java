import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Demo {
    ExtentReports extent;

    @BeforeMethod
    public void report(){
        String path=System.getProperty("user.dir")+"\\reports\\index.html";
        ExtentSparkReporter reporter=new ExtentSparkReporter(path);
        reporter.config().setReportName("Web Automation test");
        reporter.config().setDocumentTitle("Test Results");

        extent=new ExtentReports();
        extent.attachReporter(reporter);
        extent.setSystemInfo("Tester","M Yunus");
    }


    @Test
    public void initDriver(){
      ExtentTest test=  extent.createTest("first Demo");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.youtube.com/");
        driver.manage().window().maximize();
        test.pass("test do not match");

        driver.close();

        extent.flush();


    }
}
