package stepdefinitions.googleguicesteps;

import io.cucumber.java.en.And;
import shareddata.DataContext;

public class WhenSteps extends DataContext {

    private DataContext dataContext;

    public WhenSteps(DataContext dataContext) {
        this.dataContext = dataContext;
    }

    @And("^I multiply the numbers$")
    public void iMultiplyTheNumbers() {
        dataContext.result = dataContext.num1 * dataContext.num2;
    }

}
