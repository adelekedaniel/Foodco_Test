package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    //Create webdriver
    private WebDriver driver;


    //locate the element using find By
    private By Lagos = By.name("wh_flybox_button Lagos");
    
    public void clickLagos()
    {
        driver.findElement(Lagos).click();
    }
    //Create a constructor
    public HomePage(WebDriver driver)
    {
        this.driver=driver;
    }

    //locate the elements
    private By MyAccount = By.xpath("//*[@id=\"nav-menu-item-20267\"]/a");
   public LoginPage clickMyAccount()
   {
       driver.findElement(MyAccount).click();
       return new LoginPage(driver);
   }


}
