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
    String auth = "admin";
    /*--Fin variables--*/

    /*--Elementos a utilizar*/
    @FindBy(xpath = "//a[@href='/basic_auth']") WebElement btnBasicAuth;
    /*--Fin elementos--*/

    public void redirectBasicAuth(){
        waitFor(2);
        btnBasicAuth.click();
    }

    public void auth(){

    }
}
