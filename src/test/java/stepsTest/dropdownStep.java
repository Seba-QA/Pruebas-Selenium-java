package stepsTest;

import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

import pages.enterPage;
import pages.dropdown;

public class dropdownStep {
    private WebDriver driver = Hooks.getDriver();
    enterPage ep = new enterPage(driver);
    dropdown dp = new dropdown(driver);

    @Given ("Ingreso a Dropdown")
    public void redirectDropdown(){
        ep.navigateTo();
        dp.redirectDropdown();
    }

    @When ("Despliego la lista")
    public void list(){
        dp.list();
    }

    @Then ("Seleciono la opcion 1, 2 y valido que se seleccionen")
    public void validateOptions(){
        dp.validateOptions();
    }
}
