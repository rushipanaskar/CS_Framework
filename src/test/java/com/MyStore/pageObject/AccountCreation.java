package com.MyStore.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountCreation 
{
	// 1 create object of Webdriver
		 WebDriver ldriver;
		 
		 public AccountCreation (WebDriver rdriver)
		 {
			 ldriver = rdriver;
			  // Identify WebElement 
			 PageFactory.initElements(rdriver, this);
		 }
		
	     
		 
		   @FindBy(id="uniform-id_gender1") // Title-mr
		        WebElement titleMr;
		  
		   
		   @FindBy(id="customer_firstname") // firstname
	        WebElement firstName;
		   
		   @FindBy(id="customer_lastname") // lastname
	        WebElement lastName;
		   
            @FindBy(id="passwd") // passwd 
	        WebElement passwdID;

		   @FindBy(id="days") // days 
	        WebElement dayS;

		   @FindBy(id="months") // months 
	        WebElement monthS;

		   @FindBy(id="years") // years 
	        WebElement yearS;

		   @FindBy(id="submitAccount") // submitAccount
	        WebElement register;
		   
		   
		   // identify action to be perfromed on web elements
		   
		   public void selectTitlemr()
		   {
			   titleMr.click();
		   }
		   
		   public void enterFirstName(String fname)
		   {
			   firstName.sendKeys(fname);
			   
		   }
		   
		   public void enterLastName(String lname)
		   {
			   lastName.sendKeys(lname);
			   
		   }
		  

		   public void enterPassword(String pwd)
		   {
			   passwdID.sendKeys(pwd);
			   
		   }
		   
		   public void enterDays(String dy)
		   {
			   dayS.sendKeys(dy);
			   
		   }
		   
		   public void enterMonth(String mnt)
		   {
			   monthS.sendKeys(mnt);
			   
		   }
		   
		   public void enterYear(String yr)
		   {
			   yearS.sendKeys(yr);
			   
		   }
		   
		   public void ClickOnregister()
		   {
			   register.click();
		    }
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
}
