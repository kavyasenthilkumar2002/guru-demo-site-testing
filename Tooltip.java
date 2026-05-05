package GuruDemoSite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tooltip {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/social-icon.html");

        // Locate Gmail icon using proper XPath
        WebElement mail = driver.findElement(By.xpath("//a[@title='Mail']"));

        // Get tooltip text
        String actualTooltip = mail.getAttribute("title");

        // Expected value
        String expectedTooltip = "Mail";

        // Validation
        if (actualTooltip.equals(expectedTooltip)) {
            System.out.println("PASS: Tooltip matched");
        } else {
            System.out.println("FAIL: Tooltip not matched");
        }

       
    }
}