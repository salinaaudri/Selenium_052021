package com.nexttechITC.PageobjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class delldealsPOM {

	WebDriver driver;
	
	
	
	public  delldealsPOM (WebDriver driver) {
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
		 }

	@FindBy(xpath="//*[@id=\"unified-masthead-navigation\"]/nav/ul/li[5]/a/span")
	   WebElement act_deals;
	public WebElement deals (){
		return act_deals;
	
	}
	
	@FindBy(xpath="//*[@id=\"unified-masthead-navigation\"]/nav/ul/li[5]/ul/li[3]/a")
	   WebElement act_laptop;
	public WebElement laptop () {
		return act_laptop;
	}
	@FindBy(xpath="//*[@id=\"unified-masthead-navigation\"]/nav/ul/li[5]/ul/li[3]/ul/li[3]/a")
	WebElement click_home;
	public WebElement home() {
		return click_home;
	}
	
	@FindBy(xpath="/html/body/main/div[1]/section[2]/div[1]/div[2]/div[2]/select")
	public WebElement click_Relevance;
		
	
	
	//@FindBy(xpath="/html/body/main/div[1]/section[2]/div[1]/div[2]/div[2]/select")
	  //    WebElement click_Lowestprice;
	
}




