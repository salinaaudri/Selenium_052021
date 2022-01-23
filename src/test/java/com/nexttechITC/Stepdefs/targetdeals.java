package com.nexttechITC.Stepdefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.nexttechITC.PageobjectModel.targetdealsPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class targetdeals {

	
	WebDriver driver;
	        
	
	@Given("^user visits to Target Homepage$")
	public void user_visits_to_Target_Homepage() throws Throwable {
 System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe"); 
		driver = new ChromeDriver();
				driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
				 driver.manage().window().maximize();
				 
				  driver.get("https://www.target.com/");
	   }

	@When("^user go to click Deals dropdown menu and click the deals$")
	public void user_go_to_click_Deals_dropdown_menu_and_click_the_deals() throws Throwable {
		 Actions act= new Actions(driver);
		 targetdealsPOM dl= new  targetdealsPOM(driver);
		 act.moveToElement(dl.deals()).build().perform();
		 dl.deals().click();
		 WebDriverWait wait= new WebDriverWait(driver,20);
			
	}  
	@Then("^user successfully sees the clearance$")
	public void user_successfully_sees_the_clearance() throws Throwable {
		 targetdealsPOM cl= new  targetdealsPOM(driver);
		 cl.dealsclearance().click();
			 WebDriverWait wait= new WebDriverWait(driver,20);
				
	
    }
}