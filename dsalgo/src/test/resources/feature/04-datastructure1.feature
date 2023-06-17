@tag
Feature: The user is able to test Data Structure introduction page

Background: The user is logged in to DS Algo portal
    Given The user is on Signin page of background DS Algo portal
    When The user enter valid "Aarthi" and "@@Rthi1996" in the background
    And The user click on login button in the background
    Then The user redirected to homepage in the background

  @data1
  Scenario: The user is able to navigate to Data Structure introduction page
    Given The user is on the "home page" after logged in
    When The user clicks the "Get Started" button in Data Structure Page introduction Panel
    Then The user should be redirected to "Data Structure Page introduction" page

  @data2
  Scenario: The user is able to navigate to Time Complexity page
    Given The user is on the "Data Structures Introduction" after logged in
    When The user clicks Time Complexity link
    Then The user should be redirected to "Time Complexity" page

  @data3
  Scenario: The user is able to navigate to a page having an tryEditor from Time Complexity page
    Given The user is on the "Time Complexity" after logged in
    When The user clicks "Try Here" button on "Time Complexity" page
    Then The user should be redirected to "TryEditor" page

  @data4
  Scenario: The user is able run code in tryEditor for Time Complexity page
    Given The user is in a page having an tryEditor with a Run button to test
    When The user enter valid python code in tryEditor from "print('DataStructure introduction')"
    And The user clicks on run button
    Then The user should be presented with Run result

