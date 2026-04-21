package GuruDemoSite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GuruDemoSite {

    public static void main(String[] args) {


        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        try {
            driver.get("https://demo.guru99.com/test/newtours/register.php");

            driver.findElement(By.name("firstName")).sendKeys("Kavya");
            driver.findElement(By.name("lastName")).sendKeys("Senthilkumar");
            driver.findElement(By.name("phone")).sendKeys("7871400560");
            driver.findElement(By.name("userName")).sendKeys("skavyasenthil2002@gmail.com");
            driver.findElement(By.name("address1")).sendKeys("Saibaba Colony");
            driver.findElement(By.name("city")).sendKeys("Coimbatore");
            driver.findElement(By.name("state")).sendKeys("TamilNadu");
            driver.findElement(By.name("postalCode")).sendKeys("641043");

            WebElement countryDrop = driver.findElement(By.name("country"));
            Select dropdown = new Select(countryDrop);
            dropdown.selectByVisibleText("INDIA");

            driver.findElement(By.name("email")).sendKeys("Kavs");
            driver.findElement(By.name("password")).sendKeys("Varso");
            driver.findElement(By.name("confirmPassword")).sendKeys("Varso");

            //driver.findElement(By.name("submit")).click();

        } finally {
           // driver.quit();
        }
    }
}
