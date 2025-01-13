package org.orangeHRM.Pages.POM;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.orangeHRM.Base.BasePage;

public class AddNewEmployee extends BasePage {

    static Faker faker = new Faker();
    static String FakefirstName = faker.name().firstName();
    static String FakelastName = faker.name().lastName();

    By addBtn = By.xpath("//i[@class=\"oxd-icon bi-plus oxd-button-icon\"]");
    By firstName = By.cssSelector("input[name=firstName]");
    By lastName = By.cssSelector("input[name=lastName]");
    By submit = By.xpath("//button[normalize-space()=\"Save\"]");
    By empName = By.xpath("//div[@class=\"orangehrm-edit-employee-name\"]");
    By PIM_Page = By.xpath("//span[text()='PIM']");


    public void addNew(){
        presenceOfElement(addBtn).click();
        visibilityOfElement(firstName).sendKeys(FakefirstName);
        enterInput(lastName,FakelastName);
        clickElement(submit);
        visibilityOfElement(empName);
        System.out.println("New user added successfully: " + getElement(empName).getText());
        clickElement(PIM_Page);
    }
}
