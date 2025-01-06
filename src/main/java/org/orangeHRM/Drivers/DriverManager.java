package org.orangeHRM.Drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverManager {

    static WebDriver driver;

    static void init(){
        if(driver==null){
            driver = new ChromeDriver();
        }
    }

    static void down(){
        if (driver!=null){
            driver.quit();
            driver=null;
        }
    }
}
