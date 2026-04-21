package GuruDemoSite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_GuruDemoSite {

    public static void main(String[] args) {
  
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://demo.guru99.com/test/newtours/register.php");

        // Locate dropdown
        WebElement drop = driver.findElement(By.name("country"));

        // Create Select object
        Select dropdown = new Select(drop);

        // Select by visible text
        dropdown.selectByVisibleText("INDIA");

        // Close browser
        //driver.quit();
    }
}
