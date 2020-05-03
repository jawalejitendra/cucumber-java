package stepdefinitions.googleguicesteps;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import shareddata.DataContext;

public class ThenSteps {

    DataContext dataContext;

    @Then("^the result should be (\\d+)$")
    public void theResultShouldBe(int arg0) {
        Assert.assertEquals(arg0, dataContext.result);
    }
}
