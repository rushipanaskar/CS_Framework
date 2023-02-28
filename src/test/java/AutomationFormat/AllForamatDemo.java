package AutomationFormat;

public class AllForamatDemo {

	public static void main(String[] args) 
	{
		
       /*
          1) Maven Project Create
          1) src/main/java 
          2) src/test/java
              - com.MyStore.pageObject(pkg)
                 = IndexPage.java
                 = loginPage.java
                 = OrderAddressPage.java
                 = OrderConfirmationPage.java
                 = OrderPaymentPage.java
                 = OrderShippingPage.java
              - com.MyStore.TestCases (pkg)
                   =BaseClass.java(Parent Class) -> Extends = TestClasses(Child classes)
                                                                Tc_LogingPageTest.java
                                                                Tc_ProductPageTest.java
                                             Implementation Phase    
             
              - com.MyStore.Utilities(pkg)
                   = ExtentListenerClass.java
                   = ReadConfig.java
                   = ReadXlS.java
           3)Folder create
              - Configuration
                  =Config.properties
              - Logs
              - ScreenShorts
              - Drivers
           4) pom.xml create Dependency
               - webdrivermanager
               - selenium-java
               - testng
               - com.aventstack(extentreports)
               - org.apache.poi(poi)
               - org.apache.poi(poi-ooxml)
               - org.apache.logging.log4j/log4j-core
               - org.apache.logging.log4j/log4j-api
            5) src/main/resources
                 = Log4j2.properties file
               
               
     // Maven searches  the local repository to check if all the dependency present
         or not, if not the libraries will be downloade from online .
               
                
                
                
                
                
                
                
                
                
                
                
                progrmming step 
                
            1) src/test/java
                 -IndexPage.java
                      > 1 create object of Webdriver
                      > 2 create Constructor
                      > 3  Identify WebElement 
                      > 4  Identify action on WebElement 
                    - MyAccount.java
                      > 1 create object of Webdriver
                      > 2 create Constructor
                      > 3 Identify WebElement
                      > 4  Identify action on WebElement
                      > 5
           2) Configuration
                - config.properties
                
           3)com.MyStore.Utilities  
               - ReadConfig.java 
               
                   
           4) com.MyStore.TestCases
                  - BaseClass.java  
                  - Extends TC_MyAccountPageTest.java
                   -RegisteredUsersAccount.java
                
                
      Session 1
          -create Page Object classes 
          - create basic test case (base & test case )
          - add logs to test case
          - read common values from properties file
          
       Session 3  
        - add extent report 
        - capture screenshot to extent report
        - add screenshot to extent report
        - add new test case(verify login)
        
       Session 4
        - Running testcase on multiple browser
        - DataDriven Testing - using Testng data Provider with excel 
            Apache poi jars ( for Handling excel file)
            create excel file to store test data  - MyStoretext Data.xlsx
            readExcelfile (utlity to read test data file )
             
             Add remaining test case (Search product , buy product , log out)
              execution phase - test execution within eclipse ( testNg.xml & using pom.xml)
              test execution outside eclipse
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
            */  
	}

}
