package GuruDemoSite;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

    	public class Window_handling {

    		public static void main(String[] args) throws InterruptedException {
    			// TODO Auto-generated method stub
    			
    			  WebDriver driver = new ChromeDriver();
    		        driver.manage().window().maximize();

    		        driver.get("https://demo.guru99.com/test/newtours/register.php"); 

    			
    			driver.get("https://demo.guru99.com/popup.php");

    			Thread.sleep(3000);
    			String MainWindow=driver.getWindowHandle();
    			System.out.println(MainWindow);

    			driver.findElement(By.xpath("//*[contains(text(),'Click Here')]")).click();
    			Thread.sleep(800);

    			Set<String> s1=driver.getWindowHandles();
    			java.util.Iterator<String> i1=s1.iterator();
    			while(i1.hasNext())

    			{

    			String ChildWindow=i1.next();
    			if(!MainWindow.equalsIgnoreCase(ChildWindow))

    			{

    			driver.switchTo().window(ChildWindow);
    			Thread.sleep(2000);
    			driver.close();

    			}
    			}

    			driver.switchTo().window(MainWindow);

    		}

    	}