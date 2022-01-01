#Feature: Register
#  As an user
#  I want to register new account
#
#  Scenario Outline:  Register success
#    Given Go to "registerPage" url
#    When Insert "<firstname>" into "firstnameSignUp" field
#    And Insert "<lastname>" into "lastnameSignUp" field
#    And Insert "<email>" into "emailSignUp" field
#    And Insert "<password>" into "passwordSignUp" field
#    And Insert "<confirmPassword>" into "confirmPasswordSignUp" field
#    And Click button "signUpButton"
#    Then User sign up "<result>" and should see a message is "<message>"
#    Examples:
#      | firstname | lastname | email                     | password | confirmPassword | result | message                                                              |
#      | thai      | hong     | ht3330033@gmail.com       | 123456   | 123456          | pass   | Info! Account created successfully, but verification e-mail unsent.. |
#      | Thái      | Hồng     | hongthaiptit124@gmail.com | 1234567  | 1234567         | pass   | Success! Account created successfully..                              |
#      | Thái      | Hồng     | tester123@gmai.com        | hongthai | hongthai        | pass   | Success! Account created successfully..                              |
#      |           | Hồng     | hongthaiptit123@gmail.com | 123456   | 123456          | fail   | field is required                                                    |
#      | 1234567   | Hồng     | tester01@gmail.com        | 123456   | 123456          | fail   | field must be a valid first name                                     |
#      | !@#$%^&   | Hồng     | tester01@gmail.com        | 123456   | 123456          | fail   | field must be a valid first name                                     |
#      | Thái      |          | tester01@gmail.com        | 123456   | 123456          | fail   | field is required                                                    |
#      | Thái      | 1234567  | tester01@gmail.com        | 123456   | 123456          | fail   | field must be a valid first name                                     |
#      | Thái      | !@#$%^&  | tester01@gmail.com        | 123456   | 123456          | fail   | field must be a valid first name                                     |
#      | Thái      | Hồng     | hongthaiptit123@gmail.com | 123456   | 123456          | fail   | The email has already been taken.                                    |
#      | Thái      | Hồng     |                           | 123456   | 123456          | fail   | field is required                                                    |
#      | Thái      | Hồng     | tester01                  | 123456   | 123456          | fail   | field must be a valid email                                          |
#      | Thái      | Hồng     | tester01@gmailcom         | 123456   | 123456          | fail   | field must be a valid email                                          |
#      | Thái      | Hồng     | tester01@gmail            | 123456   | 123456          | fail   | field must be a valid email                                          |
#      | Thái      | Hồng     | tester01@.com             | 123456   | 123456          | fail   | field must be a valid email                                          |
#      | Thái      | Hồng     | tester01@gmail.com        |          | 123456          | fail   | field is required                                                    |
#      | Thái      | Hồng     | tester01@gmail.com        | 12345    | 123456          | fail   | field must be at least 6 characters                                  |
#      | Thái      | Hồng     | tester01@gmail.com        | 123456   |                 | fail   | field is required                                                    |
#      | Thái      | Hồng     | tester01@gmail.com        | 123456   | 12345           | fail   | field must be at least 6 characters                                  |
#      | Thái      | Hồng     | tester01@gmail.com        | 123456   | 123456788       | fail   | confirmation does not match                                          |
