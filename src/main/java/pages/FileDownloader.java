package pages;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import utils.pageUtils;

public class FileDownloader extends pageUtils{
    public FileDownloader(WebDriver driver){
        super(driver);
    }
    Actions actions = new Actions(driver);
    /*--Variables a autilizar*/
    boolean validate = false;
    int i = 0;
    /*--Fin variables--*/
    /*--Elementos a utilizar--*/
    @FindBy(xpath = "//a[@href='/download']") WebElement btnFileDownloader;
    @FindBy(xpath = "//div[@class='example']") WebElement div;
    /*--Fin elementos--*/

    public void redirectFileDownloader(){
        try {
            waitFor(1);
            btnFileDownloader.click();
        } catch (Exception e) {
            logWarn("Error: " + e);
        }           
    }

    public void download(){
        waitFor(1);
        List<WebElement> links = div.findElements(By.tagName("a"));
        for(WebElement link : links){
            String url = link.getAttribute("href");
            try {
                HttpURLConnection httpConnection = (HttpURLConnection)(new URL(url).openConnection());
                httpConnection.setRequestMethod("HEAD");
                httpConnection.connect();
    
                String contentType = httpConnection.getContentType();
                int contentLength = httpConnection.getContentLength();
                log(contentType + " / " + contentLength);
                boolean vContentType = (contentType == null || contentType.isEmpty());
                boolean vContentLength = (contentLength == -1 || contentLength  == 0);
                log(vContentLength + " / " + vContentType);
                if (!vContentType && !vContentLength){
                    validate = true;
                }else{
                    validate = false;
                    break;
                }


            } catch (Exception e) {
                logWarn("Error: " + e);
            }
        }

    }

    public void validateDownload(){
        waitFor(1);
        if (validate){
            log("Los archivos se pueden descargar correctamente");
        }else{
            logWarn("Uno o mas arhivos no se puede descargar correctamente");
        }
    }
}
