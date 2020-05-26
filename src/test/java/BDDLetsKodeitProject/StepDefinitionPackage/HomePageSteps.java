package BDDLetsKodeitProject.StepDefinitionPackage;

import BDDLetsKodeitProject.PageObjectPackage.HomePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomePageSteps {
    HomePage homePage = new HomePage();

    @Given("^user is on Letskodeit website homepage$")
    public void user_is_on_Letskodeit_website_homepage() throws Throwable {
       // homePage.homePageURL();
    }

    @When("^user click on practice button$")
    public void user_click_on_practice_button() throws Throwable {
        homePage.clickOnPractice();
    }

    @Then("^user is on practice page$")
    public void user_is_on_practice_page() throws Throwable {
        homePage.practicePageTextassert();
    }

}
