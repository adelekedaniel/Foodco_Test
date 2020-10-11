package Setup;


import PageObjects.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

public class Setup {

    //create a webdriver
    private WebDriver driver;

    //create page object
    protected HomePage homePage;
    protected HouseholdPage householdPage;
    protected DashboardPage dashboardPage;
    protected ConfirmLogoutPage confirmLogoutPage;
    protected HomeDecoPage homeDecoPage;
    protected LoginPage loginPage;

    private By Lagos = By.xpath("//label[@class='wh_flybox_button Lagos']");

    @BeforeTest
    public void setUp() {
        //Browser setup or Chrome
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        //Instantiate webdriver object
        WebDriver driver = new ChromeDriver();
        //Maximize the window
        driver.manage().window().maximize();
        //Get the site URL
        driver.get("https://foodco.ng/");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        //Instantiate homepage
        homePage = new HomePage(driver);
        //Click on lagos
        driver.findElement(Lagos).click();
        System.out.println("Location and Lagos assertion passed");

    }

    //@AfterTest
    //public void closeBrowser()
    //{
        //driver.quit();
    //}

}

