package BDDLetsKodeitProject.PageObjectPackage;

import BDDLetsKodeitProject.BaseClassPackage.DriverFactory;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class PracticePage extends DriverFactory {

    @FindBy(id = "multiple-select-example")
    WebElement multipleElement;

    public void selectMultipleElement() throws InterruptedException {
        Select sel = new Select(multipleElement);
        Thread.sleep(3000);
        sel.selectByValue("apple");
        sel.selectByIndex(1);
        sel.selectByVisibleText("Peach");

    }
       public void multipleselectAssert(){
        boolean actualselectElement = multipleElement.isSelected();


    }

}
