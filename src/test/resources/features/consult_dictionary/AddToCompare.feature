#Feature:  Search product , and add product into compare
#
#  @Test01
#  Scenario Outline: User login, search product  and add two product to compare. (User clicks on compare cart to view list compare product)
#    Given Go to "homePage" url
#    When User Login with "<username>" and "<password>"
#    Then User logs in "<result>" and return message is "<message>"
#    When User remove product in compare list
#    When User searches product and adds the first item in list result to compare cart
#      | product |
#      | cotton  |
#      | pan     |
#    And User clicks on Compare cart
#    Then Products in compare cart should be displayed
#      | productName                                      | price   | description                                                                                                                                                                                          |
#      | GIRLS AIRism Cotton Blend Short Sleeve Set       | $590.00 | Newly updated waistband prevents twisting. AIRism with DRY technology. Smooth texture. Fruit pattern on the top.                                                                                     |
#      | WOMEN Ultra Stretch Denim Cropped Leggings Pants | $390.00 | Made with Ultra Stretch denim. Comes with DRY technology. Design details include perfectly-sized back pockets and angled yoke to give you a flattering look from behind. Acid wash for a fresh look. |
#    And Cleare local storage
#    Examples:
#      | username           | password | result | message |
#      | hongthai@gmail.com | 123456   | pass   |         |
#
#  @Test02
#  Scenario Outline: User login, search product  and add two product to compare. (User clicks on profile to view list compare product)
#    Given Go to "homePage" url
#    When User Login with "<username>" and "<password>"
#    Then User logs in "<result>" and return message is "<message>"
#    When User remove product in compare list
#    When User searches product and adds the first item in list result to compare cart
#      | product |
#      | cotton  |
#      | pan     |
#    And User clicks on Profile and chooses Compare
#    Then Products in compare cart should be displayed
#      | productName                                      | price   | description                                                                                                                                                                                          |
#      | GIRLS AIRism Cotton Blend Short Sleeve Set       | $590.00 | Newly updated waistband prevents twisting. AIRism with DRY technology. Smooth texture. Fruit pattern on the top.                                                                                     |
#      | WOMEN Ultra Stretch Denim Cropped Leggings Pants | $390.00 | Made with Ultra Stretch denim. Comes with DRY technology. Design details include perfectly-sized back pockets and angled yoke to give you a flattering look from behind. Acid wash for a fresh look. |
#    And Cleare local storage
#    Examples:
#      | username           | password | result | message |
#      | hongthai@gmail.com | 123456   | pass   |         |
#
#  @Test03
#  Scenario Outline: User logins, adds 2 products into compare list, and adds 1 product into cart
#    Given Go to "homePage" url
#    When User Login with "<username>" and "<password>"
#    Then User logs in "<result>" and return message is "<message>"
#    When User remove product in compare list
#    And User remove cart
#    When User searches product and adds the first item in list result to compare cart
#      | product |
#      | cotton  |
#      | pan     |
#    And User clicks on Compare cart
#    Then Products in compare cart should be displayed
#      | productName                                      | price   | description                                                                                                                                                                                          |
#      | GIRLS AIRism Cotton Blend Short Sleeve Set       | $590.00 | Newly updated waistband prevents twisting. AIRism with DRY technology. Smooth texture. Fruit pattern on the top.                                                                                     |
#      | WOMEN Ultra Stretch Denim Cropped Leggings Pants | $390.00 | Made with Ultra Stretch denim. Comes with DRY technology. Design details include perfectly-sized back pockets and angled yoke to give you a flattering look from behind. Acid wash for a fresh look. |
#    When User adds first product into cart
#
#    Then Products in compare cart should be displayed
#      | productName                                      | price   | description                                                                                                                                                                                          |
#      | GIRLS AIRism Cotton Blend Short Sleeve Set       | $590.00 | Newly updated waistband prevents twisting. AIRism with DRY technology. Smooth texture. Fruit pattern on the top.                                                                                     |
#      | WOMEN Ultra Stretch Denim Cropped Leggings Pants | $390.00 | Made with Ultra Stretch denim. Comes with DRY technology. Design details include perfectly-sized back pockets and angled yoke to give you a flattering look from behind. Acid wash for a fresh look. |
#
#    Then Products in cart should be displayed
#      | productName                                | price   | quantity |
#      | GIRLS AIRism Cotton Blend Short Sleeve Set | $590.00 | 1        |
#    And Cleare local storage
#    Examples:
#      | username           | password | result | message |
#      | hongthai@gmail.com | 123456   | pass   |         |
#
#
#  @Test04
#  Scenario Outline:  User logins, adds 2 products into compare list, and removes one a product.
#    Given Go to "homePage" url
#    When User Login with "<username>" and "<password>"
#    Then User logs in "<result>" and return message is "<message>"
#    When User remove product in compare list
#    When User searches product and adds the first item in list result to compare cart
#      | product |
#      | cotton  |
#      | pan     |
#    And User clicks on Compare cart
#    Then Products in compare cart should be displayed
#      | productName                                      | price   | description                                                                                                                                                                                          |
#      | GIRLS AIRism Cotton Blend Short Sleeve Set       | $590.00 | Newly updated waistband prevents twisting. AIRism with DRY technology. Smooth texture. Fruit pattern on the top.                                                                                     |
#      | WOMEN Ultra Stretch Denim Cropped Leggings Pants | $390.00 | Made with Ultra Stretch denim. Comes with DRY technology. Design details include perfectly-sized back pockets and angled yoke to give you a flattering look from behind. Acid wash for a fresh look. |
#    When User remove first product in compare list
#    Then Products in compare cart should be displayed
#      | productName                                      | price   | description                                                                                                                                                                                          |
#      | WOMEN Ultra Stretch Denim Cropped Leggings Pants | $390.00 | Made with Ultra Stretch denim. Comes with DRY technology. Design details include perfectly-sized back pockets and angled yoke to give you a flattering look from behind. Acid wash for a fresh look. |
#    And Cleare local storage
#    Examples:
#      | username           | password | result | message |
#      | hongthai@gmail.com | 123456   | pass   |         |
#
#  @Test05:
#  Scenario Outline:  User logins, adds 2 products into compare list, and move one a product to wishlist
#    Given Go to "homePage" url
#    When User Login with "<username>" and "<password>"
#    Then User logs in "<result>" and return message is "<message>"
#    When User remove product in compare list
#    And User remove wishlist
#    When User searches product and adds the first item in list result to compare cart
#      | product |
#      | cotton  |
#      | pan     |
#    And User clicks on Compare cart
#    Then Products in compare cart should be displayed
#      | productName                                      | price   | description                                                                                                                                                                                          |
#      | GIRLS AIRism Cotton Blend Short Sleeve Set       | $590.00 | Newly updated waistband prevents twisting. AIRism with DRY technology. Smooth texture. Fruit pattern on the top.                                                                                     |
#      | WOMEN Ultra Stretch Denim Cropped Leggings Pants | $390.00 | Made with Ultra Stretch denim. Comes with DRY technology. Design details include perfectly-sized back pockets and angled yoke to give you a flattering look from behind. Acid wash for a fresh look. |
#    When User move first product to wishlist
#    Then Products in wishlist should be displayed
#      | productName                                | price   |
#      | GIRLS AIRism Cotton Blend Short Sleeve Set | $590.00 |
#    And Cleare local storage
#    Examples:
#      | username           | password | result | message |
#      | hongthai@gmail.com | 123456   | pass   |         |
#
#  @Test06
#  Scenario: User searchs product  and add two product to compare. (Not Login)
#    Given Go to "homePage" url
#    When User remove product in compare list
#    When User searches product and adds the first item in list result to compare cart
#      | product |
#      | cotton  |
#      | pan     |
#    And User clicks on Compare cart
#    Then Products in compare cart should be displayed
#      | productName                                      | price   | description                                                                                                                                                                                          |
#      | GIRLS AIRism Cotton Blend Short Sleeve Set       | $590.00 | Newly updated waistband prevents twisting. AIRism with DRY technology. Smooth texture. Fruit pattern on the top.                                                                                     |
#      | WOMEN Ultra Stretch Denim Cropped Leggings Pants | $390.00 | Made with Ultra Stretch denim. Comes with DRY technology. Design details include perfectly-sized back pockets and angled yoke to give you a flattering look from behind. Acid wash for a fresh look. |
#
#  @Test08
#  Scenario: User  adds 2 products into compare list, and adds 1 product into cart
#    Given Go to "homePage" url
#    When User remove product in compare list
#    And User remove cart
#    When User searches product and adds the first item in list result to compare cart
#      | product |
#      | cotton  |
#      | pan     |
#    And User clicks on Compare cart
#    Then Products in compare cart should be displayed
#      | productName                                      | price   | description                                                                                                                                                                                          |
#      | GIRLS AIRism Cotton Blend Short Sleeve Set       | $590.00 | Newly updated waistband prevents twisting. AIRism with DRY technology. Smooth texture. Fruit pattern on the top.                                                                                     |
#      | WOMEN Ultra Stretch Denim Cropped Leggings Pants | $390.00 | Made with Ultra Stretch denim. Comes with DRY technology. Design details include perfectly-sized back pockets and angled yoke to give you a flattering look from behind. Acid wash for a fresh look. |
#    When User adds first product into cart
#
#    Then Products in compare cart should be displayed
#      | productName                                      | price   | description                                                                                                                                                                                          |
#      | GIRLS AIRism Cotton Blend Short Sleeve Set       | $590.00 | Newly updated waistband prevents twisting. AIRism with DRY technology. Smooth texture. Fruit pattern on the top.                                                                                     |
#      | WOMEN Ultra Stretch Denim Cropped Leggings Pants | $390.00 | Made with Ultra Stretch denim. Comes with DRY technology. Design details include perfectly-sized back pockets and angled yoke to give you a flattering look from behind. Acid wash for a fresh look. |
#
#    Then Products in cart should be displayed
#      | productName                                | price   | quantity |
#      | GIRLS AIRism Cotton Blend Short Sleeve Set | $590.00 | 1        |
#
#  @Test09
#  Scenario:  User adds 2 products into compare list, and removes one a product.
#    Given Go to "homePage" url
#    When User remove product in compare list
#    When User searches product and adds the first item in list result to compare cart
#      | product |
#      | cotton  |
#      | pan     |
#    And User clicks on Compare cart
#    Then Products in compare cart should be displayed
#      | productName                                      | price   | description                                                                                                                                                                                          |
#      | GIRLS AIRism Cotton Blend Short Sleeve Set       | $590.00 | Newly updated waistband prevents twisting. AIRism with DRY technology. Smooth texture. Fruit pattern on the top.                                                                                     |
#      | WOMEN Ultra Stretch Denim Cropped Leggings Pants | $390.00 | Made with Ultra Stretch denim. Comes with DRY technology. Design details include perfectly-sized back pockets and angled yoke to give you a flattering look from behind. Acid wash for a fresh look. |
#    When User remove first product in compare list
#    Then Products in compare cart should be displayed
#      | productName                                      | price   | description                                                                                                                                                                                          |
#      | WOMEN Ultra Stretch Denim Cropped Leggings Pants | $390.00 | Made with Ultra Stretch denim. Comes with DRY technology. Design details include perfectly-sized back pockets and angled yoke to give you a flattering look from behind. Acid wash for a fresh look. |
#
#  @Test10:
#  Scenario:  User adds 2 products into compare list, and move one a product to wishlist
#    Given Go to "homePage" url
#    When User remove product in compare list
#    When User searches product and adds the first item in list result to compare cart
#      | product |
#      | cotton  |
#      | pan     |
#    And User clicks on Compare cart
#    Then Products in compare cart should be displayed
#      | productName                                      | price   | description                                                                                                                                                                                          |
#      | GIRLS AIRism Cotton Blend Short Sleeve Set       | $590.00 | Newly updated waistband prevents twisting. AIRism with DRY technology. Smooth texture. Fruit pattern on the top.                                                                                     |
#      | WOMEN Ultra Stretch Denim Cropped Leggings Pants | $390.00 | Made with Ultra Stretch denim. Comes with DRY technology. Design details include perfectly-sized back pockets and angled yoke to give you a flattering look from behind. Acid wash for a fresh look. |
#    Then User move first product to wishlist and page navigates to login page
#
