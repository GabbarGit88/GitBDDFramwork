Feature: This is Background Demo 
Background: User is login in SauceDemo App
Given User is accessing Sauce Demo App
When User enter valid username and password
Then user should be able to navigate to home page

Scenario: Test sidebar Menu Items
And click on Breadcrumb icon
Then User should be able to see the sidebar menu item

Scenario: Verify Add to Cart Functionality
And Click on Add to Cart Button
Then Iten should be added to the cart 