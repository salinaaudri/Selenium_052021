Feature: Covid test registration

Scenario Outline: Validate Covid test Registration
Given user visits to CVS homepage
When user Click on COVID-19 testing and results
Then user Land to Covid-19 testing page
Then user Enter "<ZIP code>"and click on schedule a test button 
Then  user Land to the Answer a few questions for no-cost testing page
Then user Select  No for do you work in health care
Then user put Check mark for I acknowledge that I have answered these questions truthfully to the best of my knowledge.
Then user Click Submit Button

Examples:
|ZIP code|
|33321|
