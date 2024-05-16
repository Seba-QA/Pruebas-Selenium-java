package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utils.pageUtils;

public class BasicAuth extends pageUtils{
    public BasicAuth(WebDriver driver){
        super(driver);
    }

    /*--Variables a utilizar--*/
    String authUser = "admin";
    String authPass = "admin";
    String validate = "Congratulations! You must have the proper credentials.";
    /*--Fin variables--*/

    /*--Elementos a utilizar*/
    @FindBy(xpath = "//p[contains(text(), 'Congratulations! You must have the proper credentials.')]") WebElement text;
    /*--Fin elementos--*/

    public void redirectBasicAuth(){
        driver.get("https://" + authUser + ":" + authPass + "@" + "the-internet.herokuapp.com/basic_auth");
    }

    public void validateAuth(){
        waitFor(2);
        String valText = text.getText();
        boolean val = valText.contains(validate);
        if(!val){
            logWarn("Hubo un problema al iniciar la sesion");

        }else{
            log("La sesion se inicio con exito");
        }
    }
}
