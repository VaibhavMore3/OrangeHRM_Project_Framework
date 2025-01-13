package org.orangeHRM.LoginTest;

import org.assertj.core.api.Assertions;
import org.orangeHRM.BaseTest.BaseTest;
import org.orangeHRM.Pages.POM.AddNewEmployee;
import org.orangeHRM.Pages.POM.DashboardPage;
import org.orangeHRM.Pages.POM.LoginPage;
import org.orangeHRM.Utils.PropertyReader;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    //testLogIn - It will log in as admin and add new employee then log out

    @Test
    public void testLogIn() throws Exception {
        LoginPage loginPage = new LoginPage();
        loginPage.openURL(PropertyReader.readKey("url"));
        loginPage.LogIn();

        DashboardPage dashboardPage = new DashboardPage();
        String expectedUser = dashboardPage.logedInUser();
        Assertions.assertThat(expectedUser).contains(PropertyReader.readKey("user"));

        AddNewEmployee addEmp = new AddNewEmployee();
        addEmp.addNew();

        dashboardPage.logOut();
    }


    public void testLogOut(){
        DashboardPage dashboard = new DashboardPage();
        dashboard.logOut();
    }

}
