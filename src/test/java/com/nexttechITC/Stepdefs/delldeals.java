package com.nexttechITC.Stepdefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.nexttechITC.PageobjectModel.delldealsPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class delldeals {
	
	
	WebDriver driver;
	
	
	@Given("^User landing Dell \"([^\"]*)\"$")
	public void user_landing_Dell(String arg1) throws Throwable {
		 System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe"); 
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			driver.manage().window().maximize();
			
					driver.get("https://www.dell.com/en-us" );                
	}
    @When("^User hover mouse over to Deals$")
	public void user_hover_mouse_over_to_Deals() throws Throwable {
		Actions act= new Actions(driver);
		delldealsPOM del = new delldealsPOM(driver);
		act.moveToElement(del.deals()).build().perform();
		
		WebDriverWait wait= new WebDriverWait(driver,20);
	    
	}
   @Then("^User hover mouse over to Laptop Deals$")
	public void user_hover_mouse_over_to_Laptop_Deals() throws Throwable {
		Actions act= new Actions(driver);
		delldealsPOM LP= new delldealsPOM(driver);
		act.moveToElement(LP.laptop()).build().perform();
		WebDriverWait wait= new WebDriverWait(driver,20);
		}

	@Then("^User hover mouse over to For Home and click on it\\.$")
	public void user_hover_mouse_over_to_For_Home_and_click_on_it() throws Throwable {
	 Actions act =new Actions(driver);
	 delldealsPOM Ho= new delldealsPOM(driver);
	 act.moveToElement(Ho.home()).build().perform();
	 Ho.home().click();
	 WebDriverWait wait= new WebDriverWait(driver,20);
		}

	@Then("^User lands on Laptop Deals page$")
	public void user_lands_on_Laptop_Deals_page() throws Throwable {
		 WebDriverWait wait= new WebDriverWait(driver,20);
		
	}

	@When("^User select Lowest Price from the drop down$")
	public void user_select_Lowest_Price_from_the_drop_down() throws Throwable {
		delldealsPOM LO = new delldealsPOM(driver);
		Select dropdown= new Select(LO.click_Relevance);
		dropdown.selectByVisibleText("Lowest Price");
		WebDriverWait wait= new WebDriverWait(driver,20);
		
	}

	@Then("^User sees lowest priced laptop top of the list$")
	public void user_sees_lowest_priced_laptop_top_of_the_list() throws Throwable {
		
		
	    
	}



   
	}

	


