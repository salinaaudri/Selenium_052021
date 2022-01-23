package com.nexttechITC.TestRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;



public class TestNGTestRunner {
	
	
	 @CucumberOptions (
		
		features = {"Features"},
		glue = {"com.nexttechITC.stepdefs"}
		
		)
  
  
  public class TestRunner extends AbstractTestNGCucumberTests{} 
  }

  
  
  
  
  
  
  
  
  
  
  
  
  
  