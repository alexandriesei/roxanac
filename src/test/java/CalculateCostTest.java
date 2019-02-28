import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class CalculateCostTest {

    WebDriver driver;
    ParkingCalculatorPage obj;

    @BeforeSuite
    public void init() {
        System.setProperty("webdriver.chrome.driver", "C://parking_calculator//chromedriver.exe");
       driver = new ChromeDriver();


    }
    @BeforeTest
    public void init2(){
       driver.get("http://adam.goucher.ca/parkcalc/index.php");
       obj = new ParkingCalculatorPage(driver);
    }

    @Test
    public void verifyThatAnHourForLongTermSurfaceParkingCost2$(){
        obj.chooseALot("LTS");
        obj.InsertEntryTime("13:00");
        obj.InsertEntryDate("02/26/2019");
        obj.InsertLeavingTime("14:00");
        obj.InsertLeavingDate("02/26/2019");
        obj.clickCalculateButton();
        obj.displayCost();
        Assert.assertEquals(obj.displayCost(), "2.00");

    }

    @AfterSuite
    public  void closeWebDriver(){
        driver.close();
    }



}
