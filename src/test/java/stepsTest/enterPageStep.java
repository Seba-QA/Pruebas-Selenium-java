package stepsTest;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.enterPage;

public class enterPageStep {
    private WebDriver driver = Hooks.getDriver();
    enterPage nav = new enterPage(driver);

    @Given ("Ingreso a la url de The-internet")
    public void navigateTo(){
        nav.navigateTo();
    }

    @Then ("Valido el ingreso correcto")
    public void validateUrl(){
        nav.validateUrl();
    }
}
