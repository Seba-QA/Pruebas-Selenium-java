package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;


import utils.pageUtils;

public class contextMenu extends pageUtils{
    public contextMenu(WebDriver driver){
        super(driver);
    }

    Actions actions = new Actions(driver);


    /*--Elementos a utilizar--*/
    @FindBy(xpath = "//a[@href='/context_menu']") WebElement contextMenu;
    @FindBy(xpath = "//div[@id='hot-spot' and @oncontextmenu='displayMessage()']") WebElement box;
    /*--Fin elementos--*/

    public void redirectContextMenu(){
        waitFor(1);
        contextMenu.click();
    }

    public void interactBox(){
        waitFor(1);
        actions.contextClick(box).perform();
    }

    public void valiadateAlert(){
        waitFor(3);
        Alert alert = driver.switchTo().alert();
        String validateText = "context";
        String alertText = alert.getText();
        if (!alertText.contains(validateText)){
            throw new AssertionError("La alerta no se desplego al dar click derecho");
        }else{
            alert.accept();
            log("La alerta se desplego correctamente y se puede dar click a aceptar");
        }
    }
}
