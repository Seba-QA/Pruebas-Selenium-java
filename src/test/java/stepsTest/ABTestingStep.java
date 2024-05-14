package stepsTest;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.ABTesting;
import pages.enterPage;

public class ABTestingStep {
    private WebDriver driver = Hooks.getDriver();
    enterPage nav = new enterPage(driver);
    ABTesting ab = new ABTesting(driver);

    @Given ("Ingreso a AB Testing")
    public void redirect(){
        nav.navigateTo();
        ab.redirect();
    }
    
    @Then ("Valido que se redirige correctamente")
    public void validateRedirect(){
        ab.validateRedirect();
    }
    
}
