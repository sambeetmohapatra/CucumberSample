Feature: Search the item

In order to Search an item
As a User
I want to get the Search Result 

@tester
Scenario: I am Searching an item

Given I enter the search item Rice
When I logged in as a user
Then I get the Valid result 390

Given I enter the search item ##
When I logged in as a user
Then I get the msg Sorry! There are no products to display.
