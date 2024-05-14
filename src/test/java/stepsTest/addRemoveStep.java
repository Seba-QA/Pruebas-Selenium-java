package stepsTest;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import pages.addRemove;
import pages.enterPage;

public class addRemoveStep {
    private WebDriver driver = Hooks.getDriver();
    enterPage nav = new enterPage(driver);
    addRemove ar = new addRemove(driver);

    @Given ("Ingreso a AddRemove Element")
    public void redirectAddRemove(){
        nav.navigateTo();
        ar.redirect();
    }

    @When ("Selecciono boton Add Element")
    public void addElement(){
        ar.addElement();
    }

    @And ("Valido que se agregue el boton Delete")
    public void validateAdd(){
        ar.validateAdd();
    }

    @When ("Selecciono el boton Delete")
    public void deleteElement(){
        ar.deleteElement();
    }

    @And ("Valido que se elimine el boton Delete")
    public void validateDelete(){
        ar.validateDelete();
    }

    @Then ("Valido que ambos botones funcionen correctamamente")
    public void validateActions(){
        ar.validateActions();
    }
}
