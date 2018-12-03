Feature: Greeting

  Scenario: Say Hello world
    Given I have a greeting application with "Hello"
    When I ask it to say hi
    Then I receive "Hello World"
