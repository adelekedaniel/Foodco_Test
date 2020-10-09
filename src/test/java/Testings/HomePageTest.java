package Testings;

import PageObjects.HomePage;
import Setup.Setup;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends Setup {

    HomePage homePage;
    //create a webdriver
    private WebDriver driver;

    @Test(priority = 3)
    public void LagosTest(){
        homePage.clickLagos();
    }
    //get the elements
    public void MyAccountTest(){
        homePage.clickMyAccount();
        String expectedURL = "https://foodco.ng/user-account/";
        String actualURL = driver.getCurrentUrl();
        Assert.assertEquals(actualURL, expectedURL);
    }
}
