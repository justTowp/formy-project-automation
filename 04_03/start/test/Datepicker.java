import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Datepicker {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:/Users/Towp/Downloads/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://web.archive.org/web/20200218172614/http://formy-project.herokuapp.com/datepicker");

        WebElement dateField = driver.findElement(By.id("datepicker"));
        dateField.sendKeys("05/02/2002");
        dateField.sendKeys(Keys.RETURN); //imports Keys package automatically to send keyboard keys

        driver.quit();
    }
}