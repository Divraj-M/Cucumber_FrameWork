#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Title of your feature
  I want to use this template for my feature file

  @Validate
  Scenario: Demo test of registration
    Given I want to go the website
    When i login
    |lalalala@lalala.com|lalalala|
    And go to the my accounts page and click address from that click on add new
    When i in the correct page i want to enter the details
    |Pokemon              |
    |Show                 |
    |Pokeipokei@gmail.com |
    |Nintendo             |  
    And Click on country
    When Country is done give input
    |Coimbatore                 |
    |city of city of of city    |
    |city the city the the city |
    |123456                     |
    |1234567890                 |
    Then Assert it to check it is saved or not