
@Signin
Feature: SignIn Action

  Scenario: Redirect to Register page
    Given User is on SignIn page
    When User Clicks on Register link
    Then User should be redirected to Register page

  Scenario: To verify SignIn with Empty fields
    Given User is on SignIn page
    When User clicks on login button with all empty field
    Then User verify the message at username as "Please fill out this field."

  Scenario: To verify SignIn with username only
    Given User is on SignIn page
    When User clicks on login button with username as "numpy" only
    Then User verify the message at password as "Please fill out this field."

  Scenario: To verify SignIn with password only
    Given User is on SignIn page
    When User clicks on login button with password as "numpy" only
    Then User verify the message at user as "Please fill out this field."

  Scenario Outline: To verify SignIn with invalid "<username>" and "<password>"
    Given User is on SignIn page
    When User enters username as "<username>"
    And User enters password as "<password>"
    And User clicks login button
    Then User verify the message as "Invalid Username and Password"

    Examples: 
      | username | password |
      | abcdefgh | zxyu1234 |

 Scenario Outline: The user is able to signin with registered credential
    Given The user is in the Sign in page
    When The user enters a valid "<username>" and "<password>"
    Then click login button to verify

    Examples: 
      | username | password  |
      | Aarthi   |  @@Rthi1996   |
      
 