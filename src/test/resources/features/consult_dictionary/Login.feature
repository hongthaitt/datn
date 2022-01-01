#Feature: Login
#  In order to login
#  As an user
#  I want to login website bagisto
#
#  Scenario Outline: Customer Login with vailid email and password
#    Given Go to "loginPage" url
#    When Insert "<username>" into "emailLogin" field
#    And Insert "<password>" into "passwordLogin" field
#    And Click button "loginButton"
#    Then User logs in "<result>" and return message is "<message>"
#    Examples:
#      | username                  | password | result | message                                              |
#      | hongthai@gmail.com        | 123456   | pass   |                                                      |
#      | hongthai@gmail.com        | 12345    | fail   | Error! Please check your credentials and try again.. |
#      | hongthaiptit303@gmail.com | 123456   | fail   | Error! Please check your credentials and try again.. |
#      | HONGTHAI@GMAIL.COM        | 123456   | pass   |                                                      |
#
#
#  Scenario Outline: Customer Login with invalid email
#    Given Go to "loginPage" url
#    When Insert "<username>" into "emailLogin" field
#    And Insert "<password>" into "passwordLogin" field
#    And Click button "loginButton"
#    Then User should see an error is "<error>" in "errorEmail"
#
#    Examples:
#      | username             | password | error                       |
#      |                      | 123456   | field is required           |
#      | hongthai@gmail       | 123456   | field must be a valid email |
#      | hongthaigmail.com    | 123456   | field must be a valid email |
#      | hongthaiptit303@.com | 123456   | field must be a valid email |
#      | hongthai             | 123456   | field must be a valid email |
#
#  Scenario Outline:  Customer Login with invalid password
#    Given Go to "loginPage" url
#    When Insert "<username>" into "emailLogin" field
#    And Insert "<password>" into "passwordLogin" field
#    And Click button "loginButton"
#    Then User should see an error is "<error>" in "errorPassword"
#    Examples:
#      | username           | password | error             |
#      | hongthai@gmail.com |          | field is required |
