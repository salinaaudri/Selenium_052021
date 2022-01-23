package com.nexttechITC.Stepdefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.nexttechITC.PageobjectModel.amazonbestsellerPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class amazonbestseller {

   WebDriver driver;	
   
   
	@Given("^User landing to Amazon Homepage$")
	public void user_landing_to_Amazon_Homepage() throws Throwable {
		
System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe"); 
		
		driver = new ChromeDriver();
	//soft wait
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		//hard wait
		Thread.sleep(5000);
		
		driver.get("https://www.amazon.com/");
				
	//how to maximize the browser
				 driver.manage().window().maximize();
		
				
	}

	@When("^User cleck the Bestseller$")
	public void user_cleck_the_Bestseller() throws Throwable {
	   
		amazonbestsellerPOM bestsell= new amazonbestsellerPOM(driver);
		bestsell.bestseller().click();
		WebDriverWait wait= new WebDriverWait(driver,20);
		
	}

	@Then("^User successfully redirect to the Bestseller$")
	public void user_successfully_redirect_to_the_Bestseller() throws Throwable {
		//close the window
		//driver.close();
		driver.quit();
	   
	}

	
	
	
	
}
