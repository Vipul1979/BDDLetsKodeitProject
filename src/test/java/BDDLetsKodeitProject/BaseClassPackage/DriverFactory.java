package BDDLetsKodeitProject.BaseClassPackage;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class DriverFactory {
    public static WebDriver driver;

    public DriverFactory() {
        PageFactory.initElements(driver, this);
        //.initElements is initialise all @FindBy elements so we can use it
    }

    public void openBrowser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://learn.letskodeit.com/p/practice");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }//openBrowser method end

    public void closeBrowser() {
        //driver.quit();
    }//closeBrowser method end

}//Class end
