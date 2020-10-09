package Testings;


import PageObjects.DashboardPage;
import Setup.Setup;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DashboardPageTest extends Setup {
    DashboardPage dashboardPage;

    //create a webdriver
    private WebDriver driver;


    //get the elements
    @Test(priority = 2)
    public void HouseholdTest() throws InterruptedException {
        dashboardPage.clickOnHousehold();
        Thread.sleep(3000);
        String expectedURL ="https://foodco.ng/product-category/household/";
        String actualURL=driver.getCurrentUrl();
        Assert.assertEquals(actualURL, expectedURL);
    }
}
