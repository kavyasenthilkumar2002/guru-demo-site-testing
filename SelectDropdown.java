package GuruDemoSite;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropdown {

    public static void main(String[] args) {

        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://demo.guru99.com/test/newtours/register.php");

        WebElement countryDropdown =
                driver.findElement(By.name("country"));

        Select dropdown = new Select(countryDropdown);

        List<WebElement> allValues = dropdown.getOptions();

        String expected = "INDIA";
        boolean found = false;

        for (WebElement option : allValues) {
            String actual = option.getText();

            if (actual.equals(expected)) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println(expected + " is available in the dropdown");
        } else {
            System.out.println(expected + " is NOT available in the dropdown");
        }

       // driver.quit();
    }
}
