
@tag001
 Feature: ds algo Get-started page

  Scenario: Get started page scenario
    Given The user opens DS Algo portal link
    When The user clicks the "Get Started" button
    Then The user should be redirected to homepage
@tag1
  Scenario Outline: User launches home page of a dsalgo project
    Given The user opens home page link
    When The user clicks on Get Started link on homepage "<option>" without login
    Then The user gets warning message "You are not logged in"
    Examples:
      | option         |
      | Data structure |
      | Arrays         |
      | Linked List    |
      | Stack          |
      | Queue          |
      | Tree           |
      | Graph          |
  @tag2    
  Scenario Outline: User is on home page and click on dropdown without login
  #Given The user is on Homepage 
  When The user click on dropdown link "<options>" without login
  Then The user gets warning message "You are not logged in"
  Examples:
      | Arrays         |
      | Linked List    |
      | Stack          |
      | Queue          |
      | Tree           |
      | Graph          |
   @tag3   
  Scenario: User is on homepage and click on SignIn 
  #Given The user is on Home page to signIn 
  When The user click "Sign in" button signIn
  Then The user should redirected to signIn page
  @tag4
  Scenario: User is on homepage and click on Register
  #Given The user is on Home page 
  When The user click "Register" button Register
  Then The user should redirected to Register page
  
  