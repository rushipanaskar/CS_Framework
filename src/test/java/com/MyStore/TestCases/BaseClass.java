package com.MyStore.TestCases;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.MyStore.Utilities.ReadConfig;

import io.github.bonigarcia.wdm.WebDriverManager;
public class BaseClass
{     
	
	ReadConfig readConfig = new ReadConfig();
	
	String url = readConfig.getBaseUrl();
	String browser = readConfig.getBrowser();
	
	public static WebDriver driver;
//	public static Logger logger;
	
	@BeforeClass
	public void setup()
	
	{
          switch(browser.toLowerCase())
          {
          case "chrome":
               WebDriverManager.chromedriver().setup();
               driver = new ChromeDriver();
               break;
               
          case"msedge":
        	  WebDriverManager.edgedriver().setup();
        	  driver = new EdgeDriver();
        	  break;
        	  
        	  default: 
        	  driver = null;
        	  break;
               
          }
          
          driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
          
          // for logging
       //  logger = LogManager.getLogger("AutomationDemoProject");
          driver.get(url);	
          
	}
	@AfterClass
   public void tearDown()
   {
	  // driver.close();
	   //driver.quit();
   }
	
	public void CaptureScreenShot(WebDriver driver , String testName) throws IOException 
	{
		// step1 convert webdriver object to TakeScreenShot interface
		TakesScreenshot screenShot = ((TakesScreenshot)driver);
		
		// step 2  call getScreenshots method to create image file 
		
		File src = screenShot.getScreenshotAs(OutputType.FILE);
		File dest = new File(System.getProperty("user.dir" ) + "//ScreenShorts//" + testName + ".png");
		
		// step 3 copy image file to destination 
		FileUtils.copyFile(src, dest);
	}
	
	
	
	
	
	
	
	
	
	
}













