package com.nexttechITC.PageobjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class amazonsearchbarPOM {

	
	 WebDriver driver;
	 
	 public  amazonsearchbarPOM(WebDriver driver) {
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
		 }

	 @FindBy(name="field-keywords")
	 
	  WebElement edit_searchbar;
	  public WebElement searchbar(){
            return edit_searchbar;
	    
	 
	 }
	  
	  @FindBy(id="nav-search-submit-button")
		 
	  WebElement click_searchnutton;
	  public WebElement searchbutton(){
            return click_searchnutton;
	    
	  
}


}
