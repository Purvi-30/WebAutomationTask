#Author: purvikala3003@gmail.com
#Summary - Automation Practice Web Solution
Feature: Feature to perform a web automation task

  Background: User is on Automation Practice demo website
    Given browser is open
    And user enters Automation Practice Demo website URL
    When user clicks on Sign in tab
    And user enters email address and password for a registered user
    And user clicks on Sign in button
    Then user is redirected to MyAccount Page

  @Scenario1 @OrderHistory
  Scenario: Verify user is able to order T-Shirt and order is reflected in Order History
    And user clicks on T-Shirts tab
    When user clicks on Add to Cart button for the selected T-Shirt
    And user clicks on Proceed to checkout button on a window pop-up
    Then user is redirected to Summary page
    And user clicks on Proceed to checkout button on the page
    Then user is redirected to Address page
    And user clicks on Proceed to checkout button on the page
    Then user is redirected to Shipping Page
    And user selects the checkbox to agree terms of service
    And user clicks on Proceed to checkout button on the page
    Then user is redirected to Payment Page
    And user selects the option of Pay by check by clicking on it
    And user clicks on I confirm my order button
    And user recieved a message of order completion
    Then user clicks on back to orders button on the page
    And user can find the order details under Order History tab
    And browser is closed

  #@Scenario2 @MyAccount
  #Scenario: Verify that user is able to update First name on MyAccount Page
    #And user clicks on My Personal Information button
    #When user enters new value for First name field
    #And user enters the current password and clicks on save button
    #Then success message is recieved.
    #And browser is closed
