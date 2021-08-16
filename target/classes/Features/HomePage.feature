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

Feature: Login to Retail website
 

  @tag1
  Scenario: Go in Home Page
    Given User is on Retail Website
   
    When User click on currency
    And User click on My Account
    And User click on wish List
    And User click on shopping Cart
    And User click on checkout
    And User click on phoneNum
    And User click on searchBar
    Then  User click on searchButton
   
    

 
