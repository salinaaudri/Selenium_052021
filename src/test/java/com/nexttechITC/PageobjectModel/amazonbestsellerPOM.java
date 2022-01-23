package com.nexttechITC.PageobjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class amazonbestsellerPOM {

	WebDriver driver;
	
	
	 public  amazonbestsellerPOM (WebDriver driver) {
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
		 }
	
	 @FindBy(xpath="//a[@href=\"/gp/bestsellers/?ref_=nav_cs_bestsellers_8a080d3d7b55497ea1bdd97b7cff8b7b\"]")
	  WebElement click_bestseller;
	  public WebElement bestseller(){
            return click_bestseller;
       
		
		}
	
	
}
