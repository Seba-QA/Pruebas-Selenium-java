package stepsTest;

import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import pages.brokenImage;

public class brokenImageStep {
    private WebDriver driver = Hooks.getDriver();
    brokenImage bi = new brokenImage(driver);

    @When ("Ingreso a Broken Images")
    public void redirectBrokenImage(){
        bi.redirectBrokenImage();
    }

    @Then ("Valido la imagenes")
    public void validateImage(){
        bi.validateImage();
    }
}
