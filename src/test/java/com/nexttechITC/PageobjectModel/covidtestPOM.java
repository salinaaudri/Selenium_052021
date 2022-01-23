package com.nexttechITC.PageobjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class covidtestPOM {

	WebDriver driver;
	
	 public  covidtestPOM(WebDriver driver) {
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
		 }
	
	 @FindBy(xpath="//*[@id=\"week-04-32702-covid-banner\"]/div/div[4]/div/div[2]/a")
	 WebElement click_COVID19_testing_and_results;
	 public WebElement COVID19_testing_and_results() {
		 return click_COVID19_testing_and_results;
	
      }
	 
	 @FindBy(xpath="//*[@name=\"zip\"]")
	 WebElement edit_ZIP_code;
	 public WebElement ZIP_code() {
		 return edit_ZIP_code;
    }
	 @FindBy(xpath="//*[@id=\"content\"]/section[1]/div[2]/div/div/form/div[2]/button")
	 WebElement click_Schedule_a_test;
	 public WebElement Schedule_a_test() {
		  return click_Schedule_a_test;

    }
	  @FindBy(xpath="//*[@id=\"healthcare-no\"]")
	  WebElement click_No;
	 public WebElement click_No() {
		 return click_No;
	 }
		 
	  
	 @FindBy(xpath="//*[@for=\"acknowledgement\"]")
	 WebElement put_Check;
	 public WebElement Check () {
	 	 return put_Check;
	 }
	
	 @FindBy(xpath="//*[@id=\"submit-button\"]")
	 WebElement click_Submit;
	 public WebElement Submit () {
	 	 return click_Submit;
	 }
	
	 
}