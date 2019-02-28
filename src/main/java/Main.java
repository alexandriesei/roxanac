import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C://parking_calculator//chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("http://adam.goucher.ca/parkcalc/index.php");

        ParkingCalculatorPage obj = new ParkingCalculatorPage(webDriver);
        obj.chooseALot("LTS");
        obj.InsertEntryTime("13:00");
        obj.InsertEntryDate("02/26/2019");
        obj.InsertLeavingTime("14:00");
        obj.InsertLeavingDate("02/26/2019");
        obj.clickCalculateButton();
        obj.displayCost();
      // webDriver.close();

    }
}
