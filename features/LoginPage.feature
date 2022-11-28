Feature: Cucumber Framework

  @LP1 @DHP0
  Scenario: Login page form
    Given I am on the login page
    When  I enter username and password
      | username      | password      |
      | Administrator | administrator |
    And I click on login button
    Then I validate to login
