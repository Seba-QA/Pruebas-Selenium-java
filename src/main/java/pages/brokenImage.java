package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utils.pageUtils;

public class brokenImage extends pageUtils{

    public brokenImage(WebDriver driver){
        super(driver);
    }

    /*--Variables a utilizar--*/
    String img;
    String src;
    /*--Fin variables--*/

    /*--Elementos a utilizar--*/
    @FindBy(xpath = "//a[@href=\"/broken_images\"]") WebElement brokenImage;
    /*--Fin Elementos--*/

    public void redirectBrokenImage(){
        waitFor(2);
        brokenImage.click();
    }

    public void validateImage(){
        waitFor(2);
        WebElement example = driver.findElement(By.xpath("//div[@class='example']"));
        List<WebElement> images = example.findElements(By.tagName("img"));
        for (WebElement image : images){
            src = image.getAttribute("src");
            //valida que el atributo src no este en null o vacio
            if (src != null && !src.isEmpty()){
                if (!image.getAttribute("naturalWidth").equals("0")){
                    log("La imagen " + src + " cargo correctamente");
                }else{
                    log("La imagen " + src + " no cargo correctamente");
                }
            }
        }
        /*--Esta opcion toma todas las imagenes en la pagina--
         *--Se hara de una forma distinta para validar ->
         -> solamente las que esten en el div correspondiente
        */
        /*for (WebElement image : driver.findElements(By.cssSelector("img"))){
            img = image.getAttribute("src");
            if(image.getAttribute("naturalWidth").equals("0")){
                log("La imagen " + img + " no cargo correctamente");
            }else{
                log("La imagen " + img + " cargo correctamente");
            }
        }*/
    }
}
