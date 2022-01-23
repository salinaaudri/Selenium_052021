package com.nexttechITC.Stepdefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.nexttechITC.PageobjectModel.covidtestPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class covidtest {
	
	
	WebDriver driver;
	
	@Given("^user visits to CVS homepage$")
	public void user_visits_to_CVS_homepage() throws Throwable {
		
  System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe"); 
		
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		 driver.manage().window().maximize();
				driver.get("https://www.cvs.com/");
	   
	}

	@When("^user Click on COVID-(\\d+) testing and results$")
	public void user_Click_on_COVID_testing_and_results(int arg1) throws Throwable {
		 covidtestPOM Cl= new  covidtestPOM(driver);
		  Cl.COVID19_testing_and_results().click();
		WebDriverWait wait= new WebDriverWait(driver,20);
			    
	}

	@Then("^user Land to Covid-(\\d+) testing page$")
	public void user_Land_to_Covid_testing_page(int arg1) throws Throwable {
		
	    WebDriverWait wait= new WebDriverWait(driver,20);
			}
	@Then("^user Enter \"([^\"]*)\"and click on schedule a test button$")
	public void user_Enter_and_click_on_schedule_a_test_button(String arg1) throws Throwable {
		  covidtestPOM zip= new  covidtestPOM(driver);
		 zip.ZIP_code().sendKeys(arg1);
		 zip.Schedule_a_test().click();
		 WebDriverWait wait= new WebDriverWait(driver,20);
	}

	@Then("^user Land to the Answer a few questions for no-cost testing page$")
	public void user_Land_to_the_Answer_a_few_questions_for_no_cost_testing_page() throws Throwable {
		WebDriverWait wait= new WebDriverWait(driver,20);
	}
	
	@Then("^user Select  No for do you work in health care$")
	public void user_Select_No_for_do_you_work_in_health_care() throws Throwable {
	    covidtestPOM HC= new covidtestPOM(driver);
	    HC.click_No();
		WebDriverWait wait= new WebDriverWait(driver,20);
	}

	@Then("^user put Check mark for I acknowledge that I have answered these questions truthfully to the best of my knowledge\\.$")
	public void user_put_Check_mark_for_I_acknowledge_that_I_have_answered_these_questions_truthfully_to_the_best_of_my_knowledge() throws Throwable {
		 covidtestPOM CH= new covidtestPOM(driver);
		 CH.Check().click();
		 WebDriverWait wait= new WebDriverWait(driver,20);
	}

	@Then("^user Click Submit Button$")
	public void user_Click_Submit_Button() throws Throwable {
		 covidtestPOM SB= new  covidtestPOM(driver);
		 SB.Submit().click();
		WebDriverWait wait= new WebDriverWait(driver,20);
	    
	}



}
