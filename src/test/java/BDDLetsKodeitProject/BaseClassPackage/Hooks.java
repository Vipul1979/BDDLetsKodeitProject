package BDDLetsKodeitProject.BaseClassPackage;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
    DriverFactory driverFactory = new DriverFactory();

    @Before
    public void setup(){
        driverFactory.openBrowser();
    }//setup method end
    @After
    public void teardown(){
        driverFactory.closeBrowser();
    }//teardown method end
}
