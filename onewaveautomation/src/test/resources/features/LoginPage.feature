Feature: Reset functionality on login page of Application

  Scenario Outline: Verification of login function
    Given Open the chrome and launch the application
    When I enter Username as "<username>" and Password as "<password>"
    Then Reset the credential
Examples:

| username  | password  | 
| prudvi.penmetsa@techwave.net | Nikhila@77 | 
| prudvi.penmetsa@techwave.net | Nikhila@66 | 
