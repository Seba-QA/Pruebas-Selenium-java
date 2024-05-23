package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utils.pageUtils;

public class Checkboxes extends pageUtils{
    public Checkboxes(WebDriver driver){
        super(driver);
    }
    /*--Variables a utilizar--*/
    Boolean vCbx1 = false;
    Boolean vCbx2 = false;
    /*--Fin variables--*/

    /*--Elementos a utilizar--*/
    @FindBy(xpath = "//a[@href='/checkboxes']") WebElement btnCheckboxes;

    @FindBy(xpath = "//form[@id='checkboxes']/input[1]") WebElement cbx1;
    @FindBy(xpath = "//form[@id='checkboxes']/input[2]") WebElement cbx2;
    /*--Fin elementos--*/

    public void redirectCheckboxes(){
        waitFor(2);
        btnCheckboxes.click();
    }

    public void validateCheckboxes(){
        //Manejo y validacion checkbox 1
        waitFor(2);
        cbx1.click();
        if (cbx1.getAttribute("checked") != null){
            log("Checkbox 1 marcado correctamente");
            waitFor(1);
            cbx1.click();
            if (cbx1.getAttribute("checked") != null){
                throw new AssertionError("El Checkbox 1 no se desmarco correctamenente");
            }else{
                log("Checkbox 1 desmarcado correctamente");
                vCbx1 = true;
            }
        }else{
            throw new AssertionError("El Checkbox 1 no se marco correctamenente");
        }
        //Manejo y validacion checkbox 2
        //Se invierte la validacion del checkbox 1
        //Cheecbox 2 inicia marcado
        waitFor(2);
        cbx2.click();
        if (cbx2.getAttribute("checked") != null){
            throw new AssertionError("El Checkbox 2 no se desmarco correctamenente");
        }else{
            log("Checkbox 2 desmarcado correctamente");
            waitFor(1);
            cbx2.click();
            if (cbx2.getAttribute("checked") != null){
                log("Checkbox 2 marcado correctamente");
                vCbx2 = true;
            }else{
                throw new AssertionError("El Checkbox 2 no se marco correctamenente");
            }
        }
    }
}
