package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HouseholdPage {

    //create a webdriver
    private WebDriver driver;


    //locate the element
    private By HomeDeco = By.xpath("//*[@id=\"content\"]/div[3]/ul/li[3]/a");

    //create a constructor
   public HouseholdPage(WebDriver driver)
   {
       this.driver=driver;
   }


   //find the element
    public HomeDecoPage clickOnHomeDeco(){
        driver.findElement(HomeDeco).click();
        return new HomeDecoPage(driver);
    }

}
