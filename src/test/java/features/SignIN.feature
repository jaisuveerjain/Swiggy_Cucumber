Feature: To Test the Swiggy Home Page

  @Sanity
  Scenario Outline: Positive scenario to test login functinonality
    Background: Positive scenario to test login functionality

    Given User has opened swiggy website on Chrome Browser
    When User entered the "<phonenumber>"
    Then User should be able to login

    Examples: 
      | phonenumber |
      | 9000000000 |
