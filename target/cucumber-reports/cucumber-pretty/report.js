$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Features/laptopNoteBooks.feature");
formatter.feature({
  "line": 3,
  "name": "Laptop \u0026 NoteBooks",
  "description": "",
  "id": "laptop-\u0026-notebooks",
  "keyword": "Feature",
  "tags": [
    {
      "line": 2,
      "name": "@laptop"
    }
  ]
});
formatter.before({
  "duration": 2209261600,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "User is on Retail websiteWhen",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User click on Laptop \u0026NoteBook tab",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "User click on Show all Laptop \u0026NoteBook option",
  "keyword": "And "
});
formatter.match({
  "location": "LaptopNoteBooksStepsDef.user_is_on_Retail_websiteWhen()"
});
formatter.result({
  "duration": 2043003100,
  "status": "passed"
});
formatter.match({
  "location": "LaptopNoteBooksStepsDef.user_click_on_Laptop_NoteBook_tab()"
});
formatter.result({
  "duration": 49647800,
  "status": "passed"
});
formatter.match({
  "location": "LaptopNoteBooksStepsDef.user_click_on_Show_all_Laptop_NoteBook_option()"
});
formatter.result({
  "duration": 416930500,
  "status": "passed"
});
formatter.scenario({
  "line": 37,
  "name": "Validate the price of MacBook Pro is 2000",
  "description": "",
  "id": "laptop-\u0026-notebooks;validate-the-price-of-macbook-pro-is-2000",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 36,
      "name": "@laptop4"
    }
  ]
});
formatter.step({
  "line": 38,
  "name": "User click on ‘MacBook Pro’ item",
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "User should see  \"$2,000.00\" price tag is present on UI",
  "keyword": "Then "
});
formatter.match({
  "location": "LaptopNoteBooksStepsDef.user_click_on_MacBook_Pro_item()"
});
formatter.result({
  "duration": 1052448800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "$2,000.00",
      "offset": 18
    }
  ],
  "location": "LaptopNoteBooksStepsDef.User_should_see__price_tag_is_present_on_UI(String)"
});
formatter.result({
  "duration": 256253500,
  "status": "passed"
});
formatter.after({
  "duration": 4722013400,
  "status": "passed"
});
});