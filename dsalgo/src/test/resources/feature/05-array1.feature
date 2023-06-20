@array
Feature: The user is able to test the Array Page
  @Array1
  Scenario: getting started the array page
    When user clicks on Array getstarted
    Then User should be redirected to "Array" page

  @Array02
  Scenario: Validation of Arrays in Python link
    Given User is on "Array page" after logged in
    When User clicks on Arrays in Python link
    Then User should be redirected to "Arrays in Python" page

  @Array03
  Scenario: Validation of Try Here button
    Given User is on "Arrays in Python page" after logged in
    When User clicks on "Try Here" button in "Arrays in Python page"
    Then User should be redirected to a page having an tryEditor with a Run button to test

  @Array04
  Scenario Outline: Validation of valid python code in TryEditor page
    Given User is on "Try Editor Page" after logged in
    When User enters valid Python code from sheet "<SheetName>" and <RowNumber>
    And User clicks on Run button
    Then User should be able to see the output

    Examples: 
      | SheetName  | RowNumber |
      | arrayXL    |         0 |

  @Array05
  Scenario Outline: Validation of error message for invalid python code in TryEditor page
    Given User is on "Try Editor Page" after logged in
    When User enters invalid Python code from sheet "<SheetName>" and <RowNumber>
    And User clicks on Run button
    Then User should be able to see error message

    Examples: 
      | SheetName  | RowNumber |
      |  arrayXL   |         1 |

  @Array06
  Scenario: Validation of Arrays Using List link
    Given User is on "Array page" after logged in
    When User clicks on Arrays Using List link
    Then User should be redirected to "Arrays Using List" page

  @Array07
  Scenario: Validation of Try Here button
    Given User is on "Arrays Using List" after logged in
    When User clicks on "Try Here" button in "Arrays Using List"
    Then User should be redirected to a page having an tryEditor with a Run button to test

  @Array08
  Scenario Outline: Validation of valid python code in TryEditor page using Arrays Using List
    Given User is on "Try Editor Page" after logged in
    When User enters valid Python code from sheet "<SheetName>" and <RowNumber>
    And User clicks on Run button
    Then User should be able to see the output

    Examples: 
      | SheetName  | RowNumber |
      | arrayXL    |         2 |

  @Array09
  Scenario Outline: Validation of invalid python code in TryEditor page for Arrays Using List
    Given User is on "Try Editor Page" after logged in
    When User enters invalid Python code from sheet "<SheetName>" and <RowNumber>
    And User clicks on Run button
    Then User should be able to see error message in an Alert

    Examples: 
      | SheetName  | RowNumber |
      |  arrayXL   |         3 |

  @Array10
  Scenario: Validation of Basic Operations in Lists link
    Given User is on "Array page" after logged in
    When User clicks on Basic Operations in Lists link
    Then User should be redirected to "Basic Operations in Lists" page

  @Array11
  Scenario Outline: Validation of valid python code in TryEditor page for Basic Operations in Lists
    Given User is on "Try Editor Page" after logged in
    When User enters valid Python code from sheet "<SheetName>" and <RowNumber>
    And User clicks on Run button
    Then User should be able to see the output

    Examples: 
      | SheetName  | RowNumber |
      |  arrayXL   |         4 |

  @Array12
  Scenario Outline: Validation of invalid python code in TryEditor page for Basic Operations in Lists
    Given User is on "Try Editor Page" after logged in
    When User enters invalid Python code from sheet "<SheetName>" and <RowNumber>
    And User clicks on Run button
    Then User should be able to see error message in an Alert box

    Examples: 
      | SheetName  | RowNumber |
      |  arrayXL   |         5 |

  @Array13
  Scenario: Validation of Applications of Arrays link
    Given User is on "Array page" after logged in
    When User clicks on Applications of Array link
    Then User should be redirected to "Applications of Array" page

  @Array14
  Scenario Outline: Validation of valid python code in TryEditor page for Applications of Array
    Given User is on "Try Editor Page" after logged in
    When User enters valid Python code from sheet "<SheetName>" and <RowNumber>
    And User clicks on Run button
    Then User should be able to see the output

    Examples: 
      | SheetName  | RowNumber |
      |   arrayXL  |         6 |

  @Array15
  Scenario Outline: Validation of invalid python code in TryEditor page for Applications of Array
    Given User is on "Try Editor Page" after logged in
    When User enters valid Python code from sheet "<SheetName>" and <RowNumber>
    And User clicks on Run button
    Then User should be able to see an error message in an Alert

    Examples: 
      | SheetName  | RowNumber |
      | arrayXL    |          7|

  @Array16
  Scenario: Validation of Practice Questions link
    Given User is on "Arrays in Python page" after logged in
    When User clicks on Practice Questions link
    Then User should be redirected to "Practice Questions" page

  @Array17
  Scenario: Validation of Search the Array link
    Given User is on "Practice page" after logged in
    When User clicks on Search the Array link
    Then User should be redirected to Questions page contains a tryEditor with Run and Submit buttons

  @Array18
  Scenario Outline: Validation of valid python code in Practice Questions page for Search for Array link
    Given User is on "Question" page of "Search the array" after logged in
    When User enters valid Python code from sheet "<SheetName>" and <RowNumber> for the PracticeQuestions
    And User clicks on Run button
    Then User should be able to see the Result

    Examples: 
      | SheetName  | RowNumber |
      | arrayXL    |         8 |

  @Array19
  Scenario Outline: Validation of Submit button in Practice Questions page for Search for Array link
    Given User is on "Question" page of "Search the array" after logged in
    When User enters valid Python code from sheet "<SheetName>" and <RowNumber> for the PracticeQuestions
    And User clicks on Submit button
    Then User should get success submission message

    Examples: 
      | SheetName  | RowNumber |
      | arrayXL    |         9 |

  @Array20
  Scenario: Validation of Max Consecutive Ones link
    Given User is on "Practice page" after logged in
    When User clicks on Max Consecutive Ones link
    Then User should be redirected to Questions page contains a tryEditor with Run and Submit buttons

  @Array21
  Scenario Outline: Validation of valid python code in Practice Questions page for Max Consecutive Ones link
    Given User is on "Question" page of "Max Consecutive Ones" after logged in
    When User enters valid Python code from sheet "<SheetName>" and <RowNumber> for the PracticeQuestions
    And User clicks on Run button
    Then User should be able to see the Result

    Examples: 
      | SheetName  | RowNumber |
      |  arrayXL   |         10 |

  @Array22
  Scenario Outline: Validation of Submit button in Practice Questions page for Max Consecutive Ones link
    Given User is on "Question" page of "Max Consecutive Ones" after logged in
    When User enters valid Python code from sheet "<SheetName>" and <RowNumber> for the PracticeQuestions
    And User clicks on Submit button
    Then User should get success submission message

    Examples: 
      | SheetName  | RowNumber |
      | arrayXL    |        11 |

  @Array23
  Scenario: Validation of Find Numbers with Even Number of Digits link
    Given User is on "Practice page" after logged in
    When User clicks on Find Numbers with Even Number of Digits link
    Then User should be redirected to Questions page contains a tryEditor with Run and Submit buttons

  @Array24
  Scenario Outline: Validation of valid python code in Practice Questions page for Find Numbers with Even Numbers of Digits link
    Given User is on "Question" page of "FindNumberswithEvenNumberofDigits" after logged in
    When User enters valid Python code from sheet "<SheetName>" and <RowNumber> for the PracticeQuestions
    And User clicks on Run button
    Then User should be able to see the Result

    Examples: 
      | SheetName  | RowNumber |
      | arrayXL    |         12|

  @Array25
  Scenario Outline: Validation of Submit button in Practice Questions page for Find Numbers with Even Numbers of Digits link
    Given User is on "Question" page of "FindNumberswithEvenNumberofDigits" after logged in
    When User enters valid Python code from sheet "<SheetName>" and <RowNumber> for the PracticeQuestions
    And User clicks on Submit button
    Then User should get success submission message

    Examples: 
      | SheetName  | RowNumber |
      | arrayXL    |         13|

  @Array26
  Scenario: Validation of Squares of a Sorted Array link
    Given User is on "Practice page" after logged in
    When User clicks on Squares of a Sorted Array link
    Then User should be redirected to Questions page contains a tryEditor with Run and Submit buttons

  @Array27
  Scenario Outline: Validation of valid python code in Practice Questions page for Find Numbers with Even Numbers of Digits link
    Given User is on "Question" page of "Squares of a Sorted Array" after logged in
    When User enters valid Python code from sheet "<SheetName>" and <RowNumber> for the PracticeQuestions
    And User clicks on Run button
    Then User should be able to see the Result

    Examples: 
      | SheetName  | RowNumber |
      | arrayXL    |         14 |

  @Array28
  Scenario Outline: Validation of Submit button in Practice Questions page for Find Numbers with Even Numbers of Digits link
    Given User is on "Question" page of "Squares of a Sorted Array" after logged in
    When User enters valid Python code from sheet "<SheetName>" and <RowNumber> for the PracticeQuestions
    And User clicks on Submit button
    Then User should get success submission message

    Examples: 
      | SheetName  | RowNumber |
      | arrayXL    |         15|