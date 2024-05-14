package pages;

import org.openqa.selenium.WebDriver;
import utils.pageUtils;

public class enterPage extends pageUtils{
    public enterPage(WebDriver driver){
        super(driver);
    }
    
    /*--Variables a utilizar--*/
    String url = "https://the-internet.herokuapp.com/";
    /*--Fin variables--*/
    
    public void navigateTo(){
        driver.get(url);
    }

    public void validateUrl(){
        waitFor(5);
        String validateUrl = driver.getCurrentUrl();
        waitFor(1);
        if(validateUrl.equals(url)){
            log("Se ha ingreso a la URL correcta");
        }else{
            logWarn("No es la URL correcta");
        }
    }
}
