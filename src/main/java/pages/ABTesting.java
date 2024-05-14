package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utils.pageUtils;

public class ABTesting extends pageUtils{
    public ABTesting(WebDriver driver){
        super(driver);
    }

    /*--Variables a utilizar*/
    String urlRedirect = "https://the-internet.herokuapp.com/abtest";
    /*--Fin variables--*/
    /*--Elementos a utilizar--*/
    @FindBy(xpath = "//a[@href='/abtest']") WebElement btnAB;
    /*--Fin elementos--*/

    public void redirect(){
        waitFor(2);
        btnAB.click();
    }

    public void validateRedirect(){
        waitFor(4);
        String currentUrl = driver.getCurrentUrl();
        if (currentUrl.equals(urlRedirect)) {
            log("Se redirigio correctamente a url " + urlRedirect);
        }else{
            logWarn("La url deberia ser '" + urlRedirect + "', pero en su lugar redirecciono a '" + currentUrl + "'");
        }
    }
}
