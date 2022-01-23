package com.nexttechITC.PageobjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class dellactionPOM {
      
	
	WebDriver driver;
	
	 public dellactionPOM (WebDriver driver) {
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
		 }
	
	@FindBy(xpath="//*[@id=\"unified-masthead-navigation\"]/nav/ul/li[2]/a/span")
	  WebElement act_Solutions;
	  public WebElement Solutions() { 
	   return act_Solutions;
	   }
	 
	  //@FindBy(xpath="/html/body/main/header/div[3]/nav/ul/li[2]/ul/li[1]/a")
	  
	    @FindBy(xpath="//*[@id=\"unified-masthead-navigation\"]/nav/ul/li[2]/ul/li[3]/a")
	  WebElement click_AllSolutions;
	    public WebElement AllSolutions() { 
	    return click_AllSolutions;
	    }
	    @FindBy(xpath="//*[@id=\"tt-content\"]/div[2]/div/ul/li/div/div/div/ul/li[2]/div/div[1]/a/div/div")
		
		WebElement click_Securitysollution;
		 public WebElement Securitysollutions() {
			 return click_Securitysollution;
		 }
	
}