package PageObjects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class DashboardPage{

    //create a webdriver
    private WebDriver driver;

    //create a constructor
    public DashboardPage(WebDriver driver)
    {
        this.driver=driver;
    }

    //locate the element
    private By Household = By.xpath("//*[@id=\"nav-menu-item-3339\"]/a");
    public HouseholdPage clickOnHousehold() {
        driver.findElement(Household).click();
        return new HouseholdPage(driver);
    }

}