package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import utils.pageUtils;

public class dropdown extends pageUtils{

    public dropdown(WebDriver driver){
        super(driver);
    }

    Actions actions = new Actions(driver);

    /*--Elementos a utilizar--*/
    @FindBy(xpath = "//a[@href='/dropdown']") WebElement btnDropdown;
    @FindBy(xpath = "//select[@id='dropdown']") WebElement dropdown;
    /*--Fin elementos--*/

    public void redirectDropdown(){
        waitFor(1);
        btnDropdown.click();
    }

    public void list(){
        try {
            waitFor(1);
            boolean validate = isVisible(dropdown, 2);
            if (!validate){
                throw new AssertionError("El elemento dropdown no esta visible");
            }else{
                waitFor(1);
                dropdown.click();
                waitFor(1);
                dropdown.click();
            }
        } catch (Exception e) {
            throw new AssertionError("Error: " + e);
        }
    }

    public void validateOptions(){
        waitFor(1);
        Select dropdownSelect = new Select(dropdown);
        waitFor(3);
        dropdownSelect.selectByVisibleText("Option 1");
        waitFor(1);
        WebElement option = dropdownSelect.getFirstSelectedOption();
        if (!option.getText().equals("Option 1")) {
            throw new AssertionError("La opcion 1 no se selecciono correctamente");
        }else{
            waitFor(3);
            dropdownSelect.selectByVisibleText("Option 2");
            if (!option.getText().equals("Option 2")){
                throw new AssertionError("La opcion 2 no se selecciono correctamente");
            }else{
                waitFor(1);
                log("Se pueden seleccionar las 2 opciones correctamente");
            }
        }
    }
}
