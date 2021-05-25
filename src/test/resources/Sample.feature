@tag
Feature: SauceDemo

  #@tag1
  #Scenario: Validate checkout
  #Given I open a Chrome Browser and navigate to SauceDemo URL
  #And I enter UserName,Password and click on loginButton
  #When i click on Add to cart on Sauce Labs Backpack
  #And click on yourcart logo
  #And click on checkout
  #When i Enter FirstName,LastName,ZipCode
  #And  click on Continue.
  #Then I validate Qty ,Description
  #And click on Finish.
  # hardcoded in the step and writing a variable.
  Scenario Outline: Validate checkout with Test Data
    Given I open a "<Browser>" and navigate to SauceDemo URL
    And I enter "<UserName>","<Password>" and click on loginButton
    When i click on Add to cart on Sauce Labs Backpack

    # And click on yourcart logo
    # And click on checkout
    # When i Enter "<FirstName>","<LastName>",<ZipCode>
    Examples: 
      | Browser | UserName      | Password     |
      | Chrome  | standard_user | secret_sauce |
      | Edge    | standard_user | secret_sauce |
    #  | FireFox | T3       | Tp3      | TFName3   | TLname3  |     789 |
  #@tag2
  #Scenario Outline: Title of your scenario outline
    #Given I want to write a step with <name>
    #When I check for the <value> in step
    #Then I verify the <status> in step
#
    #Examples: 
      #| name  | value | status  |
      #| name1 |     5 | success |
      #| name2 |     7 | Fail    |
