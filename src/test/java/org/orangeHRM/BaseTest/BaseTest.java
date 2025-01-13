package org.orangeHRM.BaseTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.orangeHRM.Drivers.DriverManager;
import org.orangeHRM.Drivers.DriverManagerTL;
import org.testng.annotations.*;

public class BaseTest extends DriverManagerTL{
    @BeforeMethod
    protected void setUp(){
        DriverManagerTL.init();
    }

    @AfterMethod
    protected void tearDown(){
       DriverManagerTL.down();
    }
}
