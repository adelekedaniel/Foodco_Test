package Testings;

import PageObjects.HomeDecoPage;
import PageObjects.HouseholdPage;
import Setup.Setup;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HouseholdPageTest extends Setup {

    protected HouseholdPage householdPage;

    //create a webdriver
    private WebDriver driver;

    private Object HomeDecoPage;

    //get the elements
    @Test(priority = 4)
    public void HomeDecoTest() throws InterruptedException {
        HomeDecoPage = householdPage.clickOnHomeDeco();
        Thread.sleep(3000);
        String expectedURL = "https://foodco.ng/product-category/household/home-deco/";
        String actualURL = driver.getCurrentUrl();
        Assert.assertEquals(actualURL, expectedURL);

    }

}
