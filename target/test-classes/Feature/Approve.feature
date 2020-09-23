Feature: Verify Approve

Scenario Outline: Verify User Submit GCIF for Approval

	
Given user launch the Application
When User enters "<userName>","<password>"and user click on login button
Then user should see Home Page
And User click on Menu Page and Choose "<Customer Management>"
And User Select Approved Queue
Then User select "<GCIF ID>" from Grid Column
When user select GCIF ID,its navigated to customer page and select Edit
Then user select required mandatory field
And user enter Remarks and click on submit button
And User Logout the application

Examples:
|userName|password|Customer Management|GCIF ID|
|300107|HI|Customer Master|12000088|

@Positive
Scenario Outline: Verify GCIF ID Approved
	
Positive:	
When User enters another "<userName>","<password>"and user click on login button
Then user should see Home Page
And User click on Menu Page and Choose "<Customer Management>"	
Then user select Pending for Approval button and select "<GCIF ID>" from Grid Column	
And user select Approve button and click yes in Confirmation

Examples:
|userName|password|Customer Management|GCIF ID|
|webuser|hi|Customer Master|12000088|