Feature: Verify LoginPage

Scenario Outline: Verify User Logged In

Given user launch the Application
When User enters "<userName>","<password>"and user click on login button
Then user should see Home Page

Examples:
|userName|password|
|300107|HI|