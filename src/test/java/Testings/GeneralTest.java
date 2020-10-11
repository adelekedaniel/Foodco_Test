package Testings;

import PageObjects.*;
import Setup.Setup;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class GeneralTest extends Setup {

    //TestNG annotation
    @Test
    //This class extends to the SetupTests as a SetupTests class contains all the setup requirements to run our test
    public void testLogin() throws InterruptedException
    {
        //login into the dashboard page
        LoginPage loginPage = homePage.clickMyAccount();
        loginPage.enterUsername("adelekedanieldaymond@gmail.com");
        loginPage.enterPassword("Adeleke123");

        //Handler for pages
        DashboardPage dashboardPage = loginPage.clickLoginBtn();
        HouseholdPage householdPage = dashboardPage.clickOnHousehold();
        HomeDecoPage homeDecoPage = householdPage.clickOnHomeDeco();
        //Assert 3 items into the subcategory
        assertEquals(homeDecoPage.getVaseTest(), "Flower Vase Ceramic 32 Inches", "This product text was not found");
        assertEquals(homeDecoPage.getTableTest(), "Foldable Small Rectangle Table Value Di", "This product text was not found");
        assertEquals(homeDecoPage.getRibbonTest(), "Ribbon Assorted", "This product text was not found");
        System.out.println("Item assertion passed");
        //click on logout
        ConfirmLogoutPage confirmLogoutPage = homeDecoPage.clickOnLogout();
        //confirm logout
        LoginPage loginPage1 = confirmLogoutPage.clickOnConfirmLogout();
        System.out.println("Account logged out");
    }


}
