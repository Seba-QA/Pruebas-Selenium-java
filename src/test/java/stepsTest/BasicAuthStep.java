package stepsTest;

import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

import pages.enterPage;
import pages.BasicAuth;

public class BasicAuthStep {
    private WebDriver driver = Hooks.getDriver();
    enterPage nav = new enterPage(driver);
    BasicAuth ba = new BasicAuth(driver);

    @Given ("Ingreso a Basic Auth")
    public void redirectBasicAuth(){
        nav.navigateTo();
        ba.redirectBasicAuth();
    }

    @When ("Ingreso el usuario y contraseña")
    public void auth(){
        ba.auth();
    }
}
