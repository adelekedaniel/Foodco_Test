package Setup;


import PageObjects.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

public class Setup {

    private WebDriver driver;

    protected HomePage homePage;

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
        homePage = new HomePage(driver);
        driver.findElement(Lagos).click();

    }

    //@AfterTest
    //public void closeBrowser() {
        //quit the browser
        //driver.quit();
    //}

}

