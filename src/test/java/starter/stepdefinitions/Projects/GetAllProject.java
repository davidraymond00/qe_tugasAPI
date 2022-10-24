package starter.stepdefinitions.Projects;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Projects.GetAllProjects;

public class GetAllProject {

    @Steps
    GetAllProjects getAllProjects;

    @Given("I set url and invalid token to get all project")
    public void iSetUrlAndInvalidTokenToGetAllProject() {
        getAllProjects.setUrlAndInvalidToken();
    }

    @When("I request get all project")
    public void iRequestGetAllProject() {
        getAllProjects.requestGetAllProject();
    }

    @Then("I will get 401")
    public void iWillGet401() {
        getAllProjects.validateStatusCode();
    }

    @And("get Forbidden message")
    public void getForbiddenMessage() {
        getAllProjects.validateForbiddenMessage();
    }


}
