$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/myApp/OIShoppinglist.feature");
formatter.feature({
  "line": 1,
  "name": "OI Shopping App features",
  "description": "",
  "id": "oi-shopping-app-features",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "User can Create new lists, Add new list items and Delete an item from the list",
  "description": "",
  "id": "oi-shopping-app-features;user-can-create-new-lists,-add-new-list-items-and-delete-an-item-from-the-list",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I am on the OI Shopping App Home page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I Navigating to My Shopping List Page",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I click on Add New List link",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I create a list \"grocery\"",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I add items \"Milk,Bread\" to the list",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "I click on Add New List link",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "I create a list \"kitchen\"",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I add items \"Toaster,Blender\" to the list",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "I delete an item from the list",
  "keyword": "And "
});
formatter.match({
  "location": "HomePageSteps.I_am_on_the_OI_Shopping_App_Home_page()"
});
formatter.result({
  "duration": 10485859200,
  "status": "passed"
});
formatter.match({
  "location": "ShoppingMenuSteps.Navigating_to_My_Shopping_List_Page()"
});
formatter.result({
  "duration": 213487200,
  "status": "passed"
});
formatter.match({
  "location": "ShoppingMenuSteps.I_click_on_Add_New_List_link()"
});
formatter.result({
  "duration": 2165067300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "grocery",
      "offset": 17
    }
  ],
  "location": "ShoppingMenuSteps.I_create_a_list_with_name(String)"
});
formatter.result({
  "duration": 6510203500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Milk,Bread",
      "offset": 13
    }
  ],
  "location": "ShoppingMenuSteps.I_add_items_to_the_list(String)"
});
formatter.result({
  "duration": 12472764400,
  "status": "passed"
});
formatter.match({
  "location": "ShoppingMenuSteps.I_click_on_Add_New_List_link()"
});
formatter.result({
  "duration": 2095527200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "kitchen",
      "offset": 17
    }
  ],
  "location": "ShoppingMenuSteps.I_create_a_list_with_name(String)"
});
formatter.result({
  "duration": 7070114200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Toaster,Blender",
      "offset": 13
    }
  ],
  "location": "ShoppingMenuSteps.I_add_items_to_the_list(String)"
});
formatter.result({
  "duration": 12911163700,
  "status": "passed"
});
formatter.match({
  "location": "ShoppingMenuSteps.I_delete_an_item_from_the_list()"
});
formatter.result({
  "duration": 6858163700,
  "status": "passed"
});
formatter.after({
  "duration": 1728419200,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "User can Create a list and then can sort it",
  "description": "",
  "id": "oi-shopping-app-features;user-can-create-a-list-and-then-can-sort-it",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 16,
  "name": "I am on the OI Shopping App Home page",
  "keyword": "Given "
});
formatter.step({
  "line": 17,
  "name": "I Navigating to My Shopping List Page",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "I click on Add New List link",
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "I create a list \"grocery\"",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "I add items \"Milk,Bread,Juice\" to the list",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "I sort the created list items",
  "keyword": "And "
});
formatter.match({
  "location": "HomePageSteps.I_am_on_the_OI_Shopping_App_Home_page()"
});
formatter.result({
  "duration": 374005800,
  "status": "passed"
});
formatter.match({
  "location": "ShoppingMenuSteps.Navigating_to_My_Shopping_List_Page()"
});
formatter.result({
  "duration": 201318400,
  "status": "passed"
});
formatter.match({
  "location": "ShoppingMenuSteps.I_click_on_Add_New_List_link()"
});
formatter.result({
  "duration": 2270814500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "grocery",
      "offset": 17
    }
  ],
  "location": "ShoppingMenuSteps.I_create_a_list_with_name(String)"
});
formatter.result({
  "duration": 6591873400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Milk,Bread,Juice",
      "offset": 13
    }
  ],
  "location": "ShoppingMenuSteps.I_add_items_to_the_list(String)"
});
formatter.result({
  "duration": 19050925400,
  "status": "passed"
});
formatter.match({
  "location": "ShoppingMenuSteps.I_sort_the_created_list_items()"
});
formatter.result({
  "duration": 760494800,
  "status": "passed"
});
formatter.after({
  "duration": 1832877500,
  "status": "passed"
});
});