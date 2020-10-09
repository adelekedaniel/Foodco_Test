package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomeDecoPage {

    //create a webdriver
    private WebDriver driver;
    //locate the element
    private By Vase = By.xpath("//*[@id=\"content\"]/div[3]/ul/li[3]/div/div[2]/a/h3");
    private By Table = By.xpath("//*[@id=\"content\"]/div[3]/ul/li[4]/div/div[2]/a/h3");
    private By Ribbon = By.xpath("//*[@id=\"content\"]/div[3]/ul/li[6]/div/div[2]/a/h3");
    private By Logout = By.xpath("//*[@id=\"nav-menu-item-6558\"]/a");

    //create a constructor
    public HomeDecoPage(WebDriver driver) {
        this.driver = driver;
    }


    //find the elements
    public String getVaseTest() {
        return driver.findElement(Vase).getText();
    }

    public String getTableTest() {
        return driver.findElement(Table).getText();
    }

    public String getRibbonTest() {
        return driver.findElement(Ribbon).getText();
    }


    public ConfirmLogoutPage clickOnLogout() {
        driver.findElement(Logout).click();
        return new ConfirmLogoutPage(driver);
    }
}
