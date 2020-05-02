package stepdefinitions.googleguicesteps;

import com.google.inject.Inject;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import shareddata.DataContext;

public class ThenSteps {
    @Inject
    DataContext dataContext;

    @Then("the result should be {int}")
    public void theResultShouldBe(int arg0) {
        Assert.assertEquals(arg0, dataContext.result);
    }
}
