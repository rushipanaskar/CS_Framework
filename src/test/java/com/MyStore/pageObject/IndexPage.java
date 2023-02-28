package com.MyStore.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IndexPage 
{  
	
	// 1 create object of Webdriver
	 WebDriver ldriver;
	 
	 public IndexPage(WebDriver rdriver)
	 {
		 ldriver = rdriver;
		  // Identify WebElement 
		 PageFactory.initElements(rdriver, this);
	 }
	
     
	 
	   @FindBy(linkText="Sign in")
	        WebElement signIn;
	   
	   // identify action on WebElement 
	   
	   public void clickOnSignIn()
        {
		  signIn.click();
		   
        }	   
}





















