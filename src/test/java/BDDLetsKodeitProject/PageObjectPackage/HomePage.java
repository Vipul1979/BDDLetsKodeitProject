package BDDLetsKodeitProject.PageObjectPackage;

import BDDLetsKodeitProject.BaseClassPackage.DriverFactory;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends DriverFactory {

    @FindBy(xpath = "//a[@class='fedora-navbar-link navbar-link']")
    WebElement practiceElement;

    @FindBy(xpath = "//h1[contains(text(),'Practice Page')]")
    WebElement practicepageText;

    public void clickOnPractice() {
        practiceElement.click();
    }

   public void homePageURL() throws InterruptedException {
       String actualHomePageURL = driver.getCurrentUrl();
       Thread.sleep(3000);
       Assert.assertThat(actualHomePageURL,Matchers.containsString("https://learn.letskodeit.com/"));
       // Assert.assertThat(actualHomePageURL,Matchers.containsString(".com"));
    }

    public void practicePageTextassert() throws InterruptedException {
        String actualPracticePage = practicepageText.getText();
       Thread.sleep(3000);
        Assert.assertThat(actualPracticePage, Matchers.containsString("Practice Page"));

    }
}//Class end
