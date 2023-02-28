package com.MyStore.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccount 
{
	// 1 create object of Webdriver
	 WebDriver ldriver;
	 
	// constructor 
	 public MyAccount(WebDriver rdriver)
	 {
		 ldriver = rdriver;
		 
		 PageFactory.initElements(rdriver, this);
	 }
	
     // Identify WebElement 
	 
	   @FindBy(id="email_create")
	        WebElement createEmailId;
	   
	   
	   @FindBy(id="SubmitCreate")
	   WebElement submitCreate;
	   
	   // Already  Registed USer
	   @FindBy(id="email")
       WebElement RegisterdUserEmail;
	   
	   @FindBy(id="passwd")
	   WebElement RegisterdUserPwd;
  
	   @FindBy(id="SubmitLogin")
	   WebElement SubmitLogin;
	   
	   // Actions Method for Alredy RegistedUser 
	   
	   public void enterEmailAddress(String emailAdd)
       {
		   RegisterdUserEmail.sendKeys(emailAdd);
	   }
	   
	   public void enterPassword(String pwd)
       {
		   RegisterdUserPwd.sendKeys(pwd);
	   }
	   
	   public void clickSubmit()
       {
		   SubmitLogin.click();
	   }

	   
	   // identify action on WebElement 
	   
	   public void enterCreateEmailAddress(String emailAdd)
       {
		   createEmailId.sendKeys(emailAdd);
	   }
	   
	   public void clickSubmitCreate()
       {
		   submitCreate.click();
	   }

}
