package stepdefinitions.googleguicesteps;


import io.cucumber.java.en.Given;
import shareddata.DataContext;

public class GivenSteps extends DataContext {


    private DataContext dataContext;

    public GivenSteps(DataContext dataContext) {
        this.dataContext = dataContext;
    }

    @Given("^I have two number (\\d+) and (\\d+) to multiply$")
    public void iHaveTwoNumberAndToMultiply(int arg0, int arg1) {
        dataContext.num1 = arg0;
        dataContext.num2 = arg1;
    }
}
