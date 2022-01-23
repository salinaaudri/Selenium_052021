package com.nexttechITC.PageobjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class fbloginPOM {
	
	
	WebDriver driver;
	
	
	  public  fbloginPOM (WebDriver driver) {
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
	  }
	
	  
	  
	  
	  @FindBy(id="email")
	  
	  WebElement edit_emailid;
	  public WebElement emailid() {
		  return edit_emailid;
	  }
	  
	  @FindBy(name="pass")
	  WebElement edit_password;
	  public WebElement password () {
		return edit_password;
	  }
	  
	  @FindBy(name="login")
	  WebElement click_loginbutton;
	  public WebElement loginbutton() {
		  return click_loginbutton;
	  }
	  
	  
	  
	  
	  
	  
	  
}	 
	  