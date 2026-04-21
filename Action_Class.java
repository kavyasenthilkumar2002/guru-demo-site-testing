package GuruDemoSite;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_Class {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        driver.get("https://demo.guru99.com/test/newtours/register.php");

        WebElement firstName = driver.findElement(By.name("firstName"));

        Actions act = new Actions(driver);

        act.moveToElement(firstName)
           .click()
           .sendKeys("welcome")
           .doubleClick(firstName)
           .keyDown(Keys.SHIFT)
           .sendKeys("hello")
           .keyUp(Keys.SHIFT)
           .build()
           .perform();

        // driver.quit(); // optional
    }
}
