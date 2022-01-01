#Feature:  Search product , and add product into wish list
#
#  @Test01
#  Scenario Outline: User logins, searchs product and add first product to cart. Then verify with database product in cart
#
#    Given Go to "homePage" url
#    When Click button "guestBtn"
#    And Click button "signInBtn"
#    Then Verify url navigate is "loginPage"
#    When Insert "<username>" into "emailLogin" field
#    And Save "<username>" to local storegae with name "key"
#    And Insert "<password>" into "passwordLogin" field
#    And Click button "loginButton"
#    Then User logs in "<result>" and return message is "<message>"
#    And Click button "homeButton"
#    When User remove wishlist
#    When User searches product and adds the first item in list result to wishlist
#      | product |
#      | cotton  |
#      | pan     |
#
#    Then Products in wishlist should be displayed
#      | productName                                      | price   |
#      | GIRLS AIRism Cotton Blend Short Sleeve Set       | $590.00 |
#      | WOMEN Ultra Stretch Denim Cropped Leggings Pants | $390.00 |
#    And Cleare local storage
#    Examples:
#      | username           | password | result | message |
#      | hongthai@gmail.com | 123456   | pass   |         |
#
#  @Test02
#  Scenario Outline: User logins, searchs product and add first product to cart. Then verify with database product in cart
#
#    Given Go to "homePage" url
#    When User Login with "<username>" and "<password>"
#    Then User logs in "<result>" and return message is "<message>"
#    When User remove wishlist
#    When User searches product and adds the first item in list result to wishlist
#      | product |
#      | cotton  |
#      | pan     |
#
#    Then Products in wishlist should be displayed
#      | productName                                      | price   |
#      | GIRLS AIRism Cotton Blend Short Sleeve Set       | $590.00 |
#      | WOMEN Ultra Stretch Denim Cropped Leggings Pants | $390.00 |
#    And Cleare local storage
#    Examples:
#      | username           | password | result | message |
#      | hongthai@gmail.com | 123456   | pass   |         |