Feature: E2E Testing

  @E2E
  Scenario Outline: Test the complete E2E flow
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
    And enter login email "<Email>"
    And enter login password "<Password>"
    And click login button
    And verify navigation to expense page
    And click on add expense button
    And verify navigation to add expense page
    Then select Expense Title "<Head>"
    And enter expense amount "<Amount>"
    And select expense currency "<Currency>"
    And select expense date "<Date>"
    And select expense category "<Category>"
    And select recurring if applicable "<Recurring>"
    And attach the expense bill
    And enter expense extra details "<Details>"

    Examples:
      | Name      | Email         | Password | Confirm Password | Currency | Head | Amount | Date       | Category | Recurring | Details            |
      | TestUser1 | test@user.com | Test#12  | Test#12          | YEN-¥    | Taxi | 139    | 24/09/2022 | Personal | No        | Some extra Details |