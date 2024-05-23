package stepsTest;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.Checkboxes;

public class CheckboxesStep {
    private WebDriver driver = Hooks.getDriver();

    Checkboxes cbx = new Checkboxes(driver);

    @Given ("Ingreso a Checkboxes")
    public void redirectCheckboxes(){
        cbx.redirectCheckboxes();
    }

    @Then ("Valido las acciones de los checkbox")
    public void validateCheckboxes(){
        cbx.validateCheckboxes();
    }
}
