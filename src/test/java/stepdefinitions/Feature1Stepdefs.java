package stepdefinitions;

import com.google.inject.Inject;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import shareddata.DataContext;

public class Feature1Stepdefs {

int num1, num2, result;

    @Given("I have two numbers {int} and {int}")
    public void iHaveTwoNumbersAnd(int arg0, int arg1) {
       num1 = arg0;
       num2 = arg1;
    }

    @When("I add these two numbers")
    public void iAddTheseTwoNumbers() {
       result =num1 +num2;
    }

    @Then("result should be {int}")
    public void resultShouldBe(int arg0) {
        Assert.assertEquals(arg0,result);
    }
}
