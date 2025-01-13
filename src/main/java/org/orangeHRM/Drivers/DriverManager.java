package org.orangeHRM.Drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverManager {

    static WebDriver driver;

    public static WebDriver getDriver(){
        return driver;
    }

    public static void init(){
        if(driver==null){
            driver = new ChromeDriver();
        }
    }

    public static void down(){
        if (driver!=null){
            driver.quit();
            driver=null;
        }
    }
}
