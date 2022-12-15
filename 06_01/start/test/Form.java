import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Form {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:/Users/Towp/Downloads/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://web.archive.org/web/20200218172614/http://formy-project.herokuapp.com/form");

        driver.findElement(By.id("first-name")).sendKeys("Firstname");

        driver.findElement(By.id("last-name")).sendKeys("Surname");

        driver.findElement(By.id("job-title")).sendKeys("QA Trainee");

        driver.findElement(By.id("radio-button-2")).click();

        driver.findElement(By.id("checkbox-1")).click();

        driver.findElement(By.cssSelector("option[value='1']")).click();

        driver.findElement(By.id("datepicker")).sendKeys("12/15/2022");

        //driver.findElement(By.id("datepicker")).sendKeys(Keys.RETURN);

        driver.findElement(By.cssSelector(".btn.btn-lg.btn-primary")).click();
        //don't forget to annotate each class by DOT - btn btn-lg btn-primary
        driver.quit();
    }
}
