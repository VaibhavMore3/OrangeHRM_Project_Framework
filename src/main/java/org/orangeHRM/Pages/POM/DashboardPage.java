package org.orangeHRM.Pages.POM;

import org.openqa.selenium.By;
import org.orangeHRM.Base.BasePage;

public class DashboardPage extends BasePage {
    public DashboardPage(){

    }

    By user = By.xpath("//p[text()=\"Site Owner\"]");
    By logOutBtn = By.xpath("//a[text()=\"Logout\"]");

    public String logedInUser(){
        presenceOfElement(user);
        return presenceOfElement(user).getText();
    }

    public void logOut(){
        presenceOfElement(user).click();
        presenceOfElement(logOutBtn).click();
    }
}
