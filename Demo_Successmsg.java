package GuruDemoSite;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_Successmsg {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        driver.get("https://demo.guru99.com/test/upload/");

        // Upload file (NO quotes)
        WebElement upload = driver.findElement(By.id("uploadfile_0"));
        upload.sendKeys("C:\\Users\\icity\\OneDrive\\Documents\\Roses.jpg");

        // Accept terms
        driver.findElement(By.id("terms")).click();

        // Submit
        driver.findElement(By.id("submitbutton")).click();

        // Capture success message
        WebElement successMsg =
                driver.findElement(By.xpath("//*[contains(text(),'successfully uploaded')]"));

        String actualText = successMsg.getText();
        System.out.println(actualText);

        String expectedText = "1 file has been successfully uploaded.";

        if (actualText.equals(expectedText)) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }

        // driver.quit();
    }
}
