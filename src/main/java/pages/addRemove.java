package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utils.pageUtils;

public class addRemove extends pageUtils{
    public addRemove(WebDriver driver){
        super(driver);
    }
    /*--Variables a utilizar--*/
    String xpathBtnDelete = "//button[@onclick='deleteElement()']";
    /*Fin variables*/
    /*--Elementos a utilizar--*/
    @FindBy(xpath = "//a[@href='/add_remove_elements/']") WebElement btnAddRemove;
    @FindBy(xpath = "//h3[text()='Add/Remove Elements']") WebElement title;

    @FindBy(xpath = "//button[@onclick='addElement()']") WebElement btnAdd;

    @FindBy(xpath = "//button[@onclick='deleteElement()']") WebElement btnDelete;
    /*--Fin elementos--*/

    /*--Funciones--*/

    /*--Fin funciones--*/

    public void redirect(){
        waitFor(2);
        btnAddRemove.click();
        boolean validate = isVisible(title, 5);
        if(!validate){
            throw new AssertionError("Hubo un error al cargar la pagina");
        }
    }

    public void addElement(){
        waitFor(2);
        btnAdd.click();
    }

    public void validateAdd(){
        boolean validateBtnDelete = isVisible(btnDelete, 2);
        if(!validateBtnDelete){
            throw new AssertionError("El boton delete no es visible");
        }else{
            log("Boton Delete aparecio correctamente");
        }
    }

    public void deleteElement(){
        waitFor(2);
        boolean validateBtnDelete = driver.findElements(By.xpath(xpathBtnDelete)).size() != 0;
        if(!validateBtnDelete){
            throw new AssertionError("El boton delete no es visible");
        }else{
            waitFor(2);
            btnDelete.click();
        }

    }

    public void validateDelete(){
        waitFor(2);
        boolean validateBtnDelete = isVisible(btnDelete, 2);
        if(!validateBtnDelete){
            log("Boton Delete desaparecio correctamente");
        }else{
            throw new AssertionError("El boton delete sigue visible");
        }
    }

    public void validateActions(){
        //Se debe construir la validacion
        //Esta validacion se hara para la siguiente version de la prueba
        log("Funcion aun no disponible");
    }

}
