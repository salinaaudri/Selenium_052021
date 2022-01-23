package com.nexttechITC.Stepdefs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.nexttechITC.PageobjectModel.fbloginPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class fblogin {

	WebDriver driver;
				
	         
	@Given("^user landing to Fb homepage$")
	public void user_landing_to_Fb_homepage() throws Throwable {
	   
	
		   System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe"); 
				
			driver = new ChromeDriver();
			
			 // driver.manage().timeouts().implicitlyWait(20,TimeUnit,SECONDS);		
			driver.manage().window().maximize();
			driver.get("https://www.facebook.com/");
			
	         
	}

	@When("^user type\"([^\"]*)\"And \"([^\"]*)\"$")
	public void user_type_And(String arg1, String arg2) throws Throwable {
	  
	    fbloginPOM FB= new  fbloginPOM(driver);
	    FB.emailid().sendKeys(arg1);
	   // FB.emailid().submit();
	    FB.password().sendKeys(arg2);
	   // FB.password().submit();
	    
	    WebDriverWait wait=new WebDriverWait(driver,20);
	    
	}             
       @Then("^user click on login buttton$")
       public void user_click_on_login_buttton() throws Throwable {
    
        fbloginPOM FB= new  fbloginPOM(driver);
   	    FB.loginbutton().click();
   	   // driver.close();
   	    driver.quit();
   }








				
           }       




