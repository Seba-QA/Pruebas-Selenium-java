package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import utils.pageUtils;

public class dragAndDrop extends pageUtils{
    public dragAndDrop(WebDriver driver){
        super(driver);
    }

    Actions actions = new Actions(driver);

    /*--Variables a utilizar--*/
    String textoDiv;
    /*--Fin Variables--*/
    /*--Elementos a utilizar--*/
    @FindBy(xpath = "//a[@href='/drag_and_drop']") WebElement btnDragAndDrop;
    @FindBy(xpath = "//div[@class='column' and @id='column-a']") WebElement A;
    @FindBy(xpath = "//div[@class='column' and @id='column-b']") WebElement B;
    /*--Fin Elementos--*/

    public void redirectDragAndDrop(){
        waitFor(2);
        btnDragAndDrop.click();
    }

    public void boxAMovement(){
        try {
            waitFor(2);
            actions.dragAndDrop(A, B).perform();
            waitFor(3);
            textoDiv = A.getText();
            if (textoDiv.equals("A")){
                throw new AssertionError("El elemento A no se movio de posicion");
            }else{
                waitFor(2);
                actions.dragAndDrop(A, B).perform();
                waitFor(3);
                textoDiv = A.getText();
                if (!textoDiv.equals("A")){
                    throw new AssertionError("El elemento A no volvio a su posicion original");
                }
            }
        } catch (Exception e) {
            throw new AssertionError("Error: " + e);
        }
    }

    public void boxBMovement(){
        try {
            waitFor(2);
            actions.dragAndDrop(A, B).perform();
            waitFor(3);
            textoDiv = B.getText();
            if (textoDiv.equals("B")){
                throw new AssertionError("El elemento B no se movio de posicion");
            }else{
                waitFor(2);
                actions.dragAndDrop(A, B).perform();
                waitFor(3);
                textoDiv = B.getText();
                if (!textoDiv.equals("B")){
                    throw new AssertionError("El elemento B no volvio a su posicion original");
                }
            }
        } catch (Exception e) {
            throw new AssertionError("Error: " + e);
        }
    }

    public void validateMovement(){
        try {
            textoDiv = A.getText();
            if (textoDiv.equals("B")){
                throw new AssertionError("El movimiento del elemento B no se realizo con exito");
            }else{
                log("Ambos elementos se movieron correctamente");
            }
        } catch (Exception e) {
            throw new AssertionError("Error: " + e);
        }
    }
}
