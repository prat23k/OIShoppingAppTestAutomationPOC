Feature: OI Shopping App features


Scenario: User can Create new lists, Add new list items and Delete an item from the list
  Given I am on the OI Shopping App Home page
  And I Navigating to My Shopping List Page
  When I click on Add New List link
  And I create a list "grocery"
  Then I add items "Milk,Bread" to the list  
  When I click on Add New List link
  And I create a list "kitchen"
  Then I add items "Toaster,Blender" to the list
  And I delete an item from the list
  
  Scenario: User can Create a list and then can sort it
     Given I am on the OI Shopping App Home page
     And I Navigating to My Shopping List Page
     When I click on Add New List link
     And I create a list "grocery"
    Then I add items "Milk,Bread,Juice" to the list  
    And I sort the created list items  
    
  