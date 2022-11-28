Feature: Admin Dashboard

  @DHP1
  Scenario: I am on the Admin Dashboard
    Given I am on the login page
    When I login into the application
      | username      | password      |
      | Administrator | administrator |
    And  I click on messages link
    When I navigate to the messages page
    Then I send a new message


    @DHP2
    Scenario: I am going to create a new post
      Given I am on the login page
      When I login into the application
        | username      | password      |
        | Administrator | administrator |
      Then I create a new post
      Then I validate the Post is created