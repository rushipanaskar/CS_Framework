package com.MyStore.TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisteredUsersAccount
{
	
	// 1 create object of Webdriver
		 WebDriver ldriver;
		 
		 public RegisteredUsersAccount(WebDriver rdriver)
		 {
			 ldriver = rdriver;
			  // Identify WebElement 
			 PageFactory.initElements(rdriver, this);
		 }
		
	     
		 
		   @FindBy(xpath = "//a[@title='View my customer account']")
		        WebElement userName;
		   
		   public String getUserName() 
		   {
			   String text = userName.getText();
			return text;
		   }
		   
		   
		 

}
