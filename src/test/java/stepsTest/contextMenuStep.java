package stepsTest;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

import pages.contextMenu;
import pages.enterPage;

public class contextMenuStep {
    private WebDriver driver = Hooks.getDriver();
    enterPage ep = new enterPage(driver);
    contextMenu cm = new contextMenu(driver);

    @Given ("Ingreso a Context menu")
    public void redirectContextMenu(){
        ep.navigateTo();
        cm.redirectContextMenu();
    }

    @When ("Interactuo con recuadro")
    public void interactBox(){
        cm.interactBox();
    }

    @Then ("Valido el despliegue del menu")
    public void valiadateAlert(){
        cm.valiadateAlert();
    }
}
