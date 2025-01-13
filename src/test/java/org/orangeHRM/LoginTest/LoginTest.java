package org.orangeHRM.LoginTest;

import org.assertj.core.api.Assertions;
import org.orangeHRM.BaseTest.BaseTest;
import org.orangeHRM.Pages.POM.DashboardPage;
import org.orangeHRM.Pages.POM.LoginPage;
import org.orangeHRM.Utils.PropertyReader;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void testLogIn() throws Exception {
        LoginPage loginPage = new LoginPage();
        loginPage.openURL(PropertyReader.readKey("url"));
        loginPage.LogIn();

        DashboardPage dashboardPage = new DashboardPage();
        String expectedUser = dashboardPage.logedInUser();
        Assertions.assertThat(expectedUser).contains(PropertyReader.readKey("user"));
        dashboardPage.logOut();
    }


    public void testLogOut(){
        DashboardPage dashboard = new DashboardPage();
        dashboard.logOut();
    }

}
