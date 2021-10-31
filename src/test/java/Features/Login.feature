Feature: LoginFeature
  This feature deals with the login functionality of the application

  Scenario Outline: Login with correct username and password
    Given I navigate to the login page
    And I enter <username> and <password>
    When I click login button
    Then I should see the userform page

    Examples:
      | username | password   |
      | admin    | admin      |
      | execute  | automation |
      | testing  | qa         |