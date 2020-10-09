package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    //Create a webdriver
    private WebDriver driver;


    //Using By as a locator for elements
    private By Username = By.id("username");


    //create a constructor
    public LoginPage(WebDriver driver)
    {
        this.driver=driver;
    }



    public void enterUsername(String uName)
    {
        //Find the username element and enter the username
        driver.findElement(Username).sendKeys(uName);
    }

    private By Password = By.id("password");
    public void enterPassword(String pwd)
    {
        //Find the password element and enter the password
        driver.findElement(Password).sendKeys(pwd);
    }
    private By LoginBtn = By.xpath("//button[@class='woocommerce-Button button']");
    public DashboardPage clickLoginBtn()
    {
        driver.findElement(LoginBtn).click();
        return new DashboardPage(driver);
    }

}
