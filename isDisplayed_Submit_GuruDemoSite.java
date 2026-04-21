package GuruDemoSite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isDisplayed_Submit_GuruDemoSite {

    public static void main(String[] args) {

        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://demo.guru99.com/test/newtours/register.php");

        WebElement submit = driver.findElement(By.xpath("//input[@type='submit']"));

        boolean flag = submit.isDisplayed();

        if (flag) {
            System.out.println("Submit button is displayed");
        } else {
            System.out.println("Submit button is NOT displayed");
        }

        driver.quit();
    }
}
