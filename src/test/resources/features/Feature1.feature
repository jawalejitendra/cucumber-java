Feature: This is a sample feature

  @scenario1
  Scenario: Add two numbers
    Given I have two numbers 5 and 10
    When I add these two numbers
    Then result should be 15

  @scenario2
  Scenario: Add two numbers
    Given I have two numbers 5 and 15
    When I add these two numbers
    Then result should be 20

  @scenario3
  Scenario: Add two numbers
    Given I have two numbers 5 and 20
    When I add these two numbers
    Then result should be 25

#  @googleguice
#  Scenario: Multiply two number
#    Given I have two number 5 and 10 to multiply
#    When I multiply the numbers
#    Then the result should be 50