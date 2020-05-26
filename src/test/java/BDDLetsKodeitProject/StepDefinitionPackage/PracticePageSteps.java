package BDDLetsKodeitProject.StepDefinitionPackage;

import BDDLetsKodeitProject.PageObjectPackage.PracticePage;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PracticePageSteps {
    PracticePage practicePage = new PracticePage();

    @Given("^user is on practice page at the moment$")
    public void userIsOnPracticePageAtTheMoment() {

    }

    @When("^user click on multiple element$")
    public void userClickOnMultipleElement() throws InterruptedException {
        practicePage.selectMultipleElement();
    }

    @Then("^user can see all element selected$")
    public void user_can_see_all_element_selected() throws Throwable {
    //practicePage.multipleselectAssert();
    }



}
