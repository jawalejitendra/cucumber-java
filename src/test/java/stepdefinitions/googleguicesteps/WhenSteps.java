package stepdefinitions.googleguicesteps;

import com.google.inject.Inject;
import io.cucumber.java.en.And;
import shareddata.DataContext;

public class WhenSteps {

    @Inject
    DataContext dataContext;

    @And("I multiply the numbers")
    public void iMultiplyTheNumbers() {
        dataContext.result = dataContext.num1 * dataContext.num2;
    }

}
