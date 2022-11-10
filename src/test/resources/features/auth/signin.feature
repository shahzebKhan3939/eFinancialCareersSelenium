Feature: Sign In
  As a user I would like to Sign In.

  Scenario Outline: User Sign In
    Given user navigates to eFinancialCareers site
    When user Sign In using <parameters>
    Examples:
    | parameters          |
    | Sign In Credentials |