import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

    protected static WebDriver driver;


    @BeforeClass
    public static void before(){
        System.setProperty("webdriver.chrome.driver", "C:/Users/testinium/Desktop/selenium/driver/chromedriver.exe");
        driver=new ChromeDriver();
    }
    @AfterClass
    public static void after() throws InterruptedException{
        Thread.sleep(3000);
        driver.close();
    }

    public WebDriver getDriver(){
        return driver;
    }
}
