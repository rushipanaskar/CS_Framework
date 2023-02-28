package com.MyStore.TestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.MyStore.pageObject.AccountCreation;
import com.MyStore.pageObject.IndexPage;
import com.MyStore.pageObject.MyAccount;

public class TC_MyAccountPageTest  extends BaseClass

{
	@Test(enabled=false)
	
	public void verifyRegistrationAndLogin()
	{
	   
	   //  logger.info("url opened");
	     
	    IndexPage pg = new IndexPage(driver);
	    pg.clickOnSignIn();
	    
	    MyAccount myAcpg = new MyAccount(driver);
	    myAcpg.enterCreateEmailAddress("rushi6@gmail.com");
	    myAcpg.clickSubmitCreate();
	    
	    AccountCreation accCreation = new AccountCreation(driver);
	    
	    accCreation.selectTitlemr();
	    accCreation.enterFirstName("Rushi");
	    accCreation.enterLastName("Panaskar");
	    accCreation.enterPassword("cs1235");
	    accCreation.enterDays("17");
	    accCreation.enterMonth("April");
	    accCreation.enterYear("2002");
	    accCreation.ClickOnregister();
	    
	    RegisteredUsersAccount regUser = new RegisteredUsersAccount(driver);
	    
	    String userName = regUser.getUserName();
	    Assert.assertEquals("Rushi Panaskar", userName);
	    
	    
}
	      @Test
	      public void verifyLogin() throws IOException
	      { 
	    	  
	    	  IndexPage pg = new IndexPage(driver);
	  	    pg.clickOnSignIn();
	  	    
	  	    MyAccount myAcpg = new MyAccount(driver);
	  	    
	  	    myAcpg.enterEmailAddress("rushi6@gmail.com");
	  	    myAcpg.enterPassword("cs1235");
           	 myAcpg.clickSubmit();
           	 
           	 
           	 
           	RegisteredUsersAccount regUser = new RegisteredUsersAccount(driver);
    	    
    	    String userName = regUser.getUserName();
    	    if(userName.equals("Rshi Panaskar"))
    	    {
    	    	System.out.println("verify Login : passed");
    	    	Assert.assertTrue(true);
    	    }
    	    else
    	    {
    	    	System.out.println("verify Login : failed");
    	    	CaptureScreenShot(driver, "verifyLogin");
    	    	Assert.assertFalse(false);
    	    }
	      }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
