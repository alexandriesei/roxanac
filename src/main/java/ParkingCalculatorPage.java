import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ParkingCalculatorPage {

    By calculateLocator = By.name("Submit");
    By chooseALotLocator = By.name("Lot");
    By entryTimeLocator = By.id("EntryTime");
    By entryDateLocator = By.id("EntryDate");
    By leavingTimeLocator = By.id("ExitTime");
    By leavingDateLocator = By.id("ExitDate");
    By costLocator = By.cssSelector("body > form > table > tbody > tr:nth-child(4) > td:nth-child(2) > span");
    WebDriver  driver;

    public ParkingCalculatorPage(WebDriver driver){
        this.driver = driver;
    }

    public void clickCalculateButton(){
        WebElement element = driver.findElement(calculateLocator);
        element.click();

    }

    public void chooseALot(String lot){
        Select chooseALotValue = new Select(driver.findElement(chooseALotLocator));

        chooseALotValue.selectByValue(lot);
    }

    public void InsertEntryTime(String time){

        WebElement element = driver.findElement(entryTimeLocator);
        element.clear();
        element.sendKeys(time);
    }

    public void InsertLeavingTime(String time){
        WebElement element = driver.findElement(leavingTimeLocator);
        element.clear();
        element.sendKeys(time);
    }

    public void InsertEntryDate(String date){
        WebElement element = driver.findElement(entryDateLocator);
        element.clear();
        element.sendKeys(date);
    }

    public void InsertLeavingDate(String date){
        WebElement element = driver.findElement(leavingDateLocator);
        element.clear();
        element.sendKeys(date);
    }
    public String displayCost(){
        WebElement element = driver.findElement(costLocator);
        String cost;
        cost = element.getText();
        String[] parts = cost.split(" ");
        cost = parts[1];
        return cost;
    }
}

