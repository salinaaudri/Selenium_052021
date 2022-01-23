package com.nexttechITC.Stepdefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.nexttechITC.PageobjectModel.amazonsearchbarPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class amazonsearchbar {

	WebDriver driver;
	
	
	@Given("^user landing amazon homepage$")
	public void user_landing_amazon_homepage() throws Throwable {
		
System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe"); 
		
		driver = new ChromeDriver();
				//soft wait,global wait
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		//hard wait
		//Thread.sleep(5000);
		
				driver.get("https://www.amazon.com/");
				
				 driver.manage().window().maximize();
	    
	}

	@When("^user search by\"([^\"]*)\"$")
	public void user_search_by(String arg1) throws Throwable {
		
		
		amazonsearchbarPOM AS = new amazonsearchbarPOM(driver);
		AS.searchbar().sendKeys(arg1);
		WebDriverWait wait= new WebDriverWait(driver,20);
		
		
	}

	@Then("^user click on search button$")
	public void user_click_on_search_button() throws Throwable {
		
		amazonsearchbarPOM AS = new amazonsearchbarPOM(driver);
	    AS.searchbutton().clear();
	    //driver.close();
	    driver.quit();
	}

	
	
	
}
