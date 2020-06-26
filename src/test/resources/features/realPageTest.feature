#Language:en
#Author: Alejandro Martinez Varela
@runAll
Feature: realPage test

  @multipleItems
  Scenario: User can add multiple items to cart 1
    Given the user is on homepage
    When user can search women items
    Then user add items to cart
    And user continue shopping

  @eveningDress
  Scenario: User can add women evening dress
    Given the user is on homepage
    When user search and select printed dress
    Then user add pop up item to cart
    And user continue shopping

  @verifyCart
  Scenario: User verifies shopping cart has 2 item in cart
    Given the user is on homepage
    When user select 2 items
    Then verifies shopping cart have 2 items
    And user is taken to the AUTHENTICATION screen