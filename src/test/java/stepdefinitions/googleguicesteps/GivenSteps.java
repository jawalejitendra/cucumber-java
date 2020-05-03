package stepdefinitions.googleguicesteps;

import com.google.inject.Inject;
import io.cucumber.java.en.Given;
import shareddata.DataContext;

public class GivenSteps {

    @Inject
    DataContext dataContext;

    @Given("I have two number {int} and {int} to multiply")
    public void iHaveTwoNumberAndToMultiply(int arg0, int arg1) {
        dataContext.num1 = arg0;
        dataContext.num2 = arg1;
    }
}
