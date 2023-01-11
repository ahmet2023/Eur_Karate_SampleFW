Feature: Computer Database Website

  Background:
    * url 'http://computer-database.gatling.io/computers'

  Scenario: Case1

    When method get
    Then status 200

  Scenario: Case2
    Given param f = 'macbook'
    When method get
    Then status 200

  Scenario: Case3
    Given path 6
    When method get
    Then status 200

  Scenario: Case4
    Given form field name = 'Beautiful Computer'
    And form field introduced = '2012-05-30'
    And form field discontinued = ''
    And form field company = '37'
    When method post
    Then status 200



