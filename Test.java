package pkge3;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import atu.testng.reports.ATUReports;
import atu.testng.reports.listeners.ATUReportsListener;
import atu.testng.reports.listeners.ConfigurationListener;
import atu.testng.reports.listeners.MethodListener;
import atu.testng.reports.logging.LogAs;
import atu.testng.selenium.reports.CaptureScreen;
import atu.testng.selenium.reports.CaptureScreen.ScreenshotOf;
import atu.testrecorder.ATUTestRecorder;
import atu.testrecorder.exceptions.ATUTestRecorderException;
@Listeners({ ATUReportsListener.class, ConfigurationListener.class,
MethodListener.class })


public class Test {
public static WebDriver driver;
public static ATUTestRecorder recorder;
 /*{
        System.setProperty("atu.reporter.config", "C:/Users/Balaji/workspace/AutomationInfoshare1/ATU Report/atu.properties");

      }*/
 
 @BeforeClass
 public void before() throws ATUTestRecorderException{
 recorder = new ATUTestRecorder("C:/Users/Balaji/workspace/AutomationInfoshare1/ATU Reports","run",false);
 recorder.start(); 
 driver = new FirefoxDriver();
 ATUReports.setWebDriver(driver);
 }
 
 
 public void test() throws ATUTestRecorderException, IOException, InterruptedException{ 
	 
	 
	 driver.get("https://hubstaging.securevetsource.com/#!login");
	 driver.manage().window().maximize();
	 Thread.sleep(3000);
	 //Login
	 driver.findElement(By.id("gwt-uid-3")).sendKeys("302280"); 
	 driver.findElement(By.id("gwt-uid-5")).sendKeys("bob");
	 driver.findElement(By.xpath("//span[text()='Login']")).click();
	 /*
	 //driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/table/tbody/tr/td/div/li[3]/div/div/span/span")).click();
	 //Login Completed 
	 Thread.sleep(3000); 
	 //Clicking ScriptRight
	 driver.findElement(By.xpath("//h2[contains(text(),ScriptRight)]")).click();
	 Thread.sleep(2000);
	 //Filling auto suggest textbox
	 driver.findElement(By.xpath("//input[contains(@autocomplete,'nope')]")).sendKeys("A  - Fido");
	 Thread.sleep(2000);
	 
	 WebElement webElement = driver.findElement(By.xpath("//input[contains(@autocomplete,'nope')]"));
	 webElement.sendKeys(Keys.ENTER);
	 Thread.sleep(2000);
	 
	 driver.findElement(By.xpath("//input[contains(@autocomplete,'nope')]")).sendKeys("ABD Sterile Pad");
	 Thread.sleep(2000);
	 
	 WebElement webElement1 = driver.findElement(By.xpath("//input[contains(@autocomplete,'nope')]"));
	 webElement1.sendKeys(Keys.ENTER);
	 Thread.sleep(2000);
	 
	 driver.findElement(By.xpath("//span[contains(.,'Next')]")).click(); 
	 Thread.sleep(2000); 
	 driver.findElement(By.xpath("//textarea[@maxlength='120']")).sendKeys("Testing");
	 driver.findElement(By.xpath("//textarea[@maxlength='1000']")).sendKeys("Testing123");
	 //List<WebElement> elements = driver.findElements(By.name("select"));
	 //WebElement element = elements.get(0);
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//option[contains(.,'Dr. Alan Miller')]")).click(); 
	 driver.findElement(By.xpath("//input[@type='password']")).sendKeys("1234");
	 driver.findElement(By.xpath("//option[contains(.,'Erica Kirkendall')]")).click();
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//span[text()='Add to Cart']")).click();
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//span[text()='Checkout']")).click();
	 Thread.sleep(4000); 
	 driver.findElement(By.xpath("//input[@type='text' and @tabindex='5']")).sendKeys("Test");
	 driver.findElement(By.xpath("//input[@type='text' and @tabindex='6']")).sendKeys("4111111111111111");
	 driver.findElement(By.xpath("//option[contains(.,'02')]")).click();
	 driver.findElement(By.xpath("//option[contains(.,'2022')]")).click();
	 driver.findElement(By.xpath("//input[@type='text' and @tabindex='9']")).sendKeys("123");
	 driver.findElement(By.xpath("//span[text()='Complete & Print']")).click();
	 
	 
	
	  
  
  
  */
  
  
  
  
  
	 }

 

}