package stepsTest;

import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;

import pages.dragAndDrop;
import pages.enterPage;

public class dragAndDropStep {
    private WebDriver driver = Hooks.getDriver();
    enterPage ep = new enterPage(driver);
    dragAndDrop dd = new dragAndDrop(driver);

    @Given ("Ingreso a Drag and drop")
    public void redirectDragAndDrop(){
        ep.navigateTo();
        dd.redirectDragAndDrop();
    }

    @When ("Muevo recuadro A al lugar del recuedro B y a su posicion original")
    public void boxAMovement(){
        dd.boxAMovement();
    }

    @And ("Muevo recuadro B al lugar del recuedro A y a su posicion original")
    public void boxBMovement(){
        dd.boxBMovement();
    }

    @Then ("Valido que todos los movimientos se hagan correctamente")
    public void validateMovement(){
        dd.validateMovement();
    }
}
