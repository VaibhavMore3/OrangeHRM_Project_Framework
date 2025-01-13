package org.orangeHRM.Base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.orangeHRM.Drivers.DriverManager;
import org.orangeHRM.Drivers.DriverManagerTL;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class BasePage {
    public BasePage(){

    }

    public void implicitWait(){
        DriverManagerTL.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public void clickElement(By by){
        DriverManagerTL.getDriver().findElement(by).click();
    }

    public void enterInput(By by, String key){
        DriverManagerTL.getDriver().findElement(by).sendKeys(key);
    }
    public WebElement getElement(By key){
        return DriverManagerTL.getDriver().findElement(key);
    }
    public WebElement presenceOfElement(final By elementLocation){
        return new WebDriverWait(DriverManagerTL.getDriver(), Duration.ofSeconds(20)).until(ExpectedConditions.presenceOfElementLocated(elementLocation));
    }
    public WebElement visibilityOfElement(final By elementLocation){
        return new WebDriverWait(DriverManagerTL.getDriver(), Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOfElementLocated(elementLocation));
    }

}
