package org.orangeHRM.Pages.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.orangeHRM.Base.BasePage;
import org.orangeHRM.Drivers.DriverManager;
import org.orangeHRM.Drivers.DriverManagerTL;
import org.orangeHRM.Utils.PropertyReader;

public class LoginPage extends BasePage {

    public LoginPage(){
        super();
    }

    By username = By.xpath("//input[@name=\"username\"]");
    By password = By.xpath("//input[@name=\"password\"]");
    By submit = By.tagName("button");

    public void openURL(String url){
        DriverManagerTL.getDriver().get(url);
        DriverManagerTL.getDriver().manage().window().maximize();
    }

    public void LogIn() throws Exception {
        LoginPage page = new LoginPage();
        page.presenceOfElement(username);
        enterInput(username, PropertyReader.readKey("username"));
        enterInput(password, PropertyReader.readKey("password"));
        clickElement(submit);
    }

}
