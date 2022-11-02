@Reg
Feature: Register a new user

  Scenario Outline: Test to create a new user
    Given launch the app and verify the opened app
    When click on signup button
    Then wait until signup page load
    And enter signup name "<Name>"
    And enter signup email "<Email>"
    And enter signup password "<Password>"
    And enter signup confirm password "<Confirm Password>"
    And select signup currency "<Currency>"
    And click register button
    And verify navigation to login

    Examples:
      | Name      | Email         | Password | Confirm Password | Currency |
      | TestUser1 | test@user.com | Test#12  | Test#12          | YEN-¥    |