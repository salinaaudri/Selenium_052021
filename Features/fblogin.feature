Feature: Validate Fbsignin

Scenario Outline: Validate Fbsignin
Given user landing to Fb homepage
When user type"<Emailid>"And "<Password>"
Then user click on login buttton

Examples:
|Emailid||Password|
|kmadlsl@hotmail.com||snabcm|


