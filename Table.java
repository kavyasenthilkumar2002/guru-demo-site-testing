package GuruDemoSite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table {

    public static void main(String[] args) {

      
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://demo.guru99.com/test/write-xpath-table.html");

    
        WebElement tableValue =
                driver.findElement(By.xpath("(//table/tbody/tr[2]/td[2])"));

        String actualValue = tableValue.getText();
        String expectedText = "second cell";

        if (actualValue.equals(expectedText)) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }

        //driver.quit();
    }
}
