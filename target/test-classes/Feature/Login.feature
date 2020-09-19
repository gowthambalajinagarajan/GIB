Feature: Verify LoginPage

Scenario Outline: Verify User Logged In

Negative:	
Given user launch the Application
When User enters "<userName>","<password>"and user click on login button
Then user should see Home Page
And User click on Menu Page and Choose "<Customer Management>"
And User Select Approved Queue
Then User select "<GCIF ID>" from Grid Column
When user select GCIF ID,its navigated to customer page and select Edit


Then user select required mandatory field
And user enter Remarks and click on save button



Examples:
|userName|password|Customer Management|GCIF ID|
|300107|HI|Customer Master|12000088|