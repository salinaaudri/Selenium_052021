package com.nexttechITC.Stepdefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.nexttechITC.PageobjectModel.fbsignupPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class fbsignup {

	WebDriver driver;
	
	@Given("^user visiting facebook url$")
	public void user_visiting_facebook_url() throws Throwable {
	   
	
	
	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe"); 
	
	             driver = new ChromeDriver();
	             driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			driver.get("https://www.facebook.com/signup");
			driver.manage().window().maximize();
	}
	
	@When("^user enter \"([^\"]*)\" and\"([^\"]*)\" and valid \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enter_and_and_valid_and(String arg1, String arg2, String arg3, String arg4) throws Throwable {
		fbsignupPOM sel= new fbsignupPOM(driver);
		sel.firstname().sendKeys(arg1);
		sel.lastname().sendKeys(arg2);
		sel.email().sendKeys(arg3);
		sel.password().sendKeys(arg4);
		
	    
	}

	@Then("^user select dropdown Month and dropdown Day and dropdown Year$")
	public void user_select_dropdown_Month_and_dropdown_Day_and_dropdown_Year() throws Throwable {
		fbsignupPOM fb = new fbsignupPOM(driver);
		Select dropdown =new Select (fb.click_month);
		
		dropdown.selectByIndex(5);
		
		Select dropdown1 =new Select (fb.click_day);
		dropdown1.selectByValue("6");
		
		
		Select dropdown2= new Select (fb.click_year);
		dropdown2.selectByVisibleText("1999");
	    
		
		
	}


	
}
