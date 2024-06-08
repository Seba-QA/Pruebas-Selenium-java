package stepsTest;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.FileDownloader;

public class FileDownloaderStep {
    private WebDriver driver = Hooks.getDriver();
    FileDownloader fd = new FileDownloader(driver);

    @Given ("Ingreso a File downloader")
    public void redirectFileDownloader(){
        fd.redirectFileDownloader();
    }

    @When ("Descargo los archivos en la pagina")
    public void download(){
        fd.download();
    }

    @Then ("valido la descarga de los archivos")
    public void validateDownload(){
        fd.validateDownload();
    }
}
