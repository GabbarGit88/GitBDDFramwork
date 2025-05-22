 Feature: Login page automation of  Application
 
 Scenario Outline: Check Login Successful with Valid Credentials
 Given User is on Login Page
 When User enter valid "<username>" and "<password>"
 And Clicks on Login Button
 Then User navigated to Home Page 
 And Close the Browser 
 
 Examples:
 | username | password |
 | standard_user | secret_sauce |

  