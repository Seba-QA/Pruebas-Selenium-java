package stepsTest;

import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import pages.BasicAuth;

public class BasicAuthStep {
    private WebDriver driver = Hooks.getDriver();
    BasicAuth ba = new BasicAuth(driver);

    @Given ("Ingreso a Basic Auth e ingreso credenciales")
    public void redirectBasicAuth(){
        ba.redirectBasicAuth();
    }

    @Then ("Valido el correcto login")
    public void validateAuth(){
        ba.validateAuth();
    }
}
