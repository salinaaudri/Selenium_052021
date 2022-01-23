package com.nexttechITC.PageobjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class targetdealsPOM {
	
	
	WebDriver driver;
	
	 public  targetdealsPOM(WebDriver driver) {
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
		 }

	 @FindBy(xpath="//*[@id=\"secondary\"]")
	 WebElement click_deals;
	 public WebElement deals() {
		  return click_deals;
	 }
	 
	 @FindBy(xpath="//*[@id=\"deals-clearance\"]/a/div")
	   WebElement click_dealsclearance;
	   public WebElement dealsclearance() {
		   return click_dealsclearance;
	   }
	 
	 
}
