Feature: User want to visit Amazon webpage and search

Scenario Outline:
Given user landing amazon homepage
When user search by"<product>"
Then user click on search button

Examples:
|product|
|tv|

