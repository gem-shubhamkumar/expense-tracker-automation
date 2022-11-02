Feature: Login user and Add one expense

  @addExp
  Scenario Outline: Test to login user and add one expense
    Given launch the app and verify the opened app
    When enter login email "<Email>"
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
    And enter expense extra details "<Details>"


    Examples:
      | Email         | Password | Head | Amount | Currency | Date       | Category | Recurring | Details            |
      | test@user.com | Test#12  | Taxi | 139    | YEN-¥    | 24/09/2022 | Personal | No        | Some extra Details |