Feature: Login
  As a user I would like to login.

  Scenario Outline: User logins
    Given user navigates to eFinancialCareers site
    When user logins using <parameters>
    Examples:
    | parameters        |
    | Login Credentials |