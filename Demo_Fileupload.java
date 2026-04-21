package GuruDemoSite;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_Fileupload {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        driver.get("https://demo.guru99.com/test/upload/");

        // Upload file
        WebElement upload = driver.findElement(By.id("uploadfile_0"));
        upload.sendKeys("C:\\Users\\icity\\OneDrive\\Documents\\Roses.jpg");

        // ACCEPT TERMS (mandatory)
        driver.findElement(By.id("terms")).click();

        // Submit
        driver.findElement(By.id("submitbutton")).click();

        // Get success message
        WebElement msg = driver.findElement(
                By.xpath("//*[contains(text(),'successfully uploaded')]"));

        System.out.println(msg.getText());

        // driver.quit(); // optional
    }
}
