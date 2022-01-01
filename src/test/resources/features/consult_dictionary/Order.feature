#Feature: User orders
#  Scenario:  User dont login and purchase order in website:
#    Given Go to "homePage" url
#    When User searches product and adds the first item in list result to cart
#      | product | quantity |message|
#      | cotton  | 1        |Success! Item was successfully added to cart..|
#    Then Products in cart should be displayed
#      | productName                                      | price   | quantity |
#      | GIRLS AIRism Cotton Blend Short Sleeve Set       | $590.00 | 1        |
#    When User checkout with billing info, shipping info, payment method
#    |companyName|firstName|lastName|email|streetAdress|city|country|state|zipCode|phoneNumber|||||||
#    |MB         |Hong     |Thai    |hongthai@gmail.com|