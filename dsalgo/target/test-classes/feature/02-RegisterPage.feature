@tag
Feature: DSalgo Register page

  @tag1
  Scenario: The user is presented with error message for empty fields below Username textbox
    Given The user opens Register Page
    When The user clicks "Register" button with all fields empty
    Then It should display an error "Please fill out this field." below Username textbox

  @tag2
  Scenario Outline: The user is presented with error message for empty fields below Password textbox
    When The user clicks "Register" button after entering "<username>" with other fields empty
    Then It should display an error "Please fill out this field" below Password textbox

    Examples: 
      | username        |
      | AArthi@sdet84_1 |

  @tag3
  Scenario Outline: The user is presented with error message for empty fields below Password Confirmation textbox
    When The user clicks "Register" button after entering "<username>" and "<password>" with Password Confirmation field empty
    Then It should display an error "Please fill out this field." below Password Confirmation textbox

    Examples: 
      | username       | password     |
      | ARGHI@sdet84_1 | testpassword |

  @tag4
  Scenario Outline: The user is presented with error message for username already exists
   
    When The user enters a valid existing "<username>" with "<password>" and "<password confirmation>"
    Then It should display an error message "password_mismatch:The two password fields didn’t match."

    Examples: 
      | username          | password     | password confirmation |
      | &**&**&           | testpassword | testpassword          |
      | gshx@sdet84_1     | RT56YUabc2    | RT56YUabc             |
      | fdhgjdg@sdet84_1  | testpassword | testpassword1         |
      | hgdfgfyu@sdet84_1 |     123456783 |              12345678 |
      | iuieyfe@sdet84_1  | testsdet842   | testsdet84            |
      | jhufiD@sdet84_1   | @@WElcome123 | Welcome1              |

 
  @tag5
  Scenario Outline: The user is succesfully able to register
    When The user enters a valid "<username>" and "<password>" and "<password confirmation>"
    Then The user should be redirected to Homepage with the message "New Account Created. You are logged in as <username>"

    Examples: 
      | username | password  | password confirmation |
      | Aarthi   | @@Rthi123 | @@Rthi123             |
      |gshx@sdet84_1|RT56YUabc|RT56YUabc|
  