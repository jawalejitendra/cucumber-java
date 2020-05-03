package configuration;

import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Injector;
import cucumber.api.guice.CucumberModules;
import cucumber.runtime.java.guice.InjectorSource;


public class DependencyInjection extends AbstractModule implements InjectorSource {
    public Injector getInjector() {
        return Guice.createInjector(this, CucumberModules.SCENARIO);
    }
}
