package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ConfirmLogoutPage {

    //create a webdriver
    private WebDriver driver;

    //locate the element
    private By ConfirmLogout = By.xpath("//*[@id=\"content\"]/article/div/div/div[1]/a");

    //create a constructor
    public ConfirmLogoutPage(WebDriver driver){
        this.driver=driver;
    }

    //click on element
    public LoginPage clickOnConfirmLogout(){
        driver.findElement(ConfirmLogout).click();
        return new LoginPage(driver);
    }

}
