package stepsTest;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.HttpURLConnection;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Hooks {
    static WebDriver driver;
    private static boolean isReportFolderCleaned = false;
    private static String browser = "chrome";

    @Before
    public void setUp(Scenario scenario){
        if(!isReportFolderCleaned){
            //cleanReportFolder();
            isReportFolderCleaned = true;
        }
        configureWebDriver();
    }

    public void configureWebDriver(){
        browser = "chrome";
        //browser = "edge";
        if(browser.equals("chrome")){
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--disable-gpu");
            options.addArguments("--disable-software-rasterizer");
            options.addArguments("--disable-site-isolation-trials", "--no-sandbox", "--incognito");
            options.addArguments("--start-maximized");
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver(options);
        }else if (browser.equals("edge")){
            EdgeOptions options = new EdgeOptions();
            options.addArguments("--disable-gpu");
            options.addArguments("--disable-software-rasterizer");
            options.addArguments("--disable-site-isolation-trials", "--no-sandbox", "--incognito");
            options.addArguments("--start-maximized");
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver(options);
        }
    }
   
    @After
    public void tearDown(Scenario scenario){
        if(scenario.isFailed()){
            takeScreenshot();
        }
        quitWebDriver();
    }

    public void takeScreenshot() {
        // Obtener la fecha y hora actual
        String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd_HH-mm-ss"));

        // Tomar el screenshot
        TakesScreenshot ts = (TakesScreenshot) driver;
        File source = ts.getScreenshotAs(OutputType.FILE);

        // Guardar el screenshot en una carpeta
        try {
            FileUtils.copyFile(source, new File("./Screenshots/screenshot_" + timestamp + ".png"));
            System.out.println("Screenshot guardado exitosamente.");
        } catch (IOException e) {
            System.out.println("Error al guardar el screenshot: " + e.getMessage());
        }
    }

    public void quitWebDriver(){
        if(driver != null){
            driver.quit();
        }
    }

    public static WebDriver getDriver(){
        return driver;
    }


}

