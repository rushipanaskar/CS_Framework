package com.MyStore.Utilities;

import java.io.File;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;


public class ExtentListenerClass implements ITestListener
{
	   ExtentSparkReporter htmlReporter;
	   ExtentReports reports;
	   ExtentTest test;
	   
	   public void configureReport()
	   {
		   htmlReporter = new ExtentSparkReporter("ExtentListenerReportDemo.html");
		    reports = new  ExtentReports();
		    reports.attachReporter(htmlReporter);
		    
		    // add System information /enviroment info to reports
		    reports.setSystemInfo("Machine", "testpc1");
		    reports.setSystemInfo("OS", "windows 11");
		    reports.setSystemInfo("browser", "chrome");
		    reports.setSystemInfo("user name", "Rushi");
		    
		    
		    // configuration to change look and feel of report
		    htmlReporter.config().setDocumentTitle("ExtentListenerReportDemo");
		    htmlReporter.config().setReportName("This is my First Report");
		    htmlReporter.config().setTheme(Theme.DARK);
		   
		    
	   }
	     
	   // on Start method is called when any test starts
	   
	   public void onStart(ITestContext Result)
	   {
		   configureReport();
		   System.out.println("On Start Method Invoked......");
	   }
	   
	   // onFinsh  method is called after all test are execute.
	   public void onFinish(ITestContext Result)
	   {
		   System.out.println("On Finshed method invoked....");
		   reports.flush();// it is mandatory to call flush method to ensure information is written to the started reporter.
	   }
	
	   
	   
	   // when test case failed this method is called
	   
	       public void onFailure(ITestResult Result)
	       {
	    	   System.out.println("Name of test method faild : " + Result.getName());
	    	   test = reports.createTest(Result.getName());// create entry in html report 
	    	   test.log(Status.FAIL, MarkupHelper.createLabel("Name of The faild test case is :" + Result.getName(), ExtentColor.RED));
	       String screenShotPath = System.getProperty("user.dir") + "\\ScreenShorts\\" + Result.getName()+ ".png";
	        File screenShotFile = new File(screenShotPath);
	        
	       if(screenShotFile.exists())
	       {
	    	   test.fail("Capture ScreenShot is below: " + test.addScreenCaptureFromPath(screenShotPath));
	       }
	       
	       
	    	//   test.addScreenCaptureFromPath(null)
	       }
	       
	      
	       public void onTestSkipped(ITestResult Result)
	       {
	    	   System.out.println("Name of test method skipped : " + Result.getName());
	    	   test = reports.createTest(Result.getName());
	    	   test.log(Status.SKIP, MarkupHelper.createLabel("Name of The SKIP test case is :" + Result.getName(), ExtentColor.YELLOW));
	 	      
	       }
	       
        
	       //when test case get Started , this method is called 
	       
	        public void onTestStart(ITestResult Result)
	        {
	              System.out.println("Name of test Method Started : " + Result.getName()); 	
	        }
	  
	         // when test case get passed , this method is called 
	        
	        public void onTestSuccess(ITestResult Result)
	        {
	        	System.out.println("Name of test method sucessfully executed : " + Result.getName());
	                  test = reports.createTest(Result.getName());
	         test.log(Status.SKIP, MarkupHelper.createLabel("Name of The SKIP test case is :" + Result.getName(), ExtentColor.BLUE));
	         
	          	 	
	        }
	 
	        public void onTestFailedButWithinSuccessPercentage(ITestResult Result)
	        {
	        	
	        }
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	

	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
}
