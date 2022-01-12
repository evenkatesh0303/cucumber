Feature: To validate login functionality of fb application

  Background: 
    Given user need to be in login page
@smoke
  Scenario Outline: To validate login with invalid username and invalid password
    When user should enter invalid "<username>" and invalid "<password>"
    And user click login button
    Then user will redirect to invalid credential page

    Examples: 
      | username | password |
      | Selenium | selenium |
      | Java     | java     |
      | Greens   | greens   |
      | Venkat   | venkat   |
@sanity
  Scenario: To validate login with empty username and empty password
    When user will clicks login page
    Then user will navigate to invalid credentila page
