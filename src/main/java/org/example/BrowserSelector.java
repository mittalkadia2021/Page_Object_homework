package org.example;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class BrowserSelector extends BasePage {

    LoadProperty loadProperty = new LoadProperty();

    String browserName = loadProperty.getProperty("browser");

    public void open_Browser() {
        if (browserName.equalsIgnoreCase("chrome")) {
            //setting up chromedriver path from your system
            System.setProperty("webdriver.chrome.driver", "src/test/resources/BrowserDriver/chromedriver.exe");
            //creating object for driver
            driver = new ChromeDriver();
        }
        else if (browserName.equalsIgnoreCase("edge")) {
            //setting up EdgeDriver path from your system
            System.setProperty("webdriver.edge.driver", "src/test/resources/BrowserDriver/msedgedriver.exe");
            //creating object for driver
            driver = new EdgeDriver();
        }
        else if (browserName.equalsIgnoreCase("Firefox")){
            //setting up FirefoxDriver path from your system
            System.setProperty("webdriver.gecko.driver","src/test/resources/BrowserDriver/geckodriver.exe");
            //creating object for driver
            driver =new FirefoxDriver();
        }

        else {
            System.out.println("In correct browser name or empty" + browserName);
        }
        //maximize the browser window
        driver.manage().window().maximize();
        //Apply implicitlyWait to driver object
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

}
