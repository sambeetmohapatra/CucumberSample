$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("\u0027Scenario17\\check12.feature\u0027");
formatter.feature({
  "line": 1,
  "name": "Search the item",
  "description": "\r\nIn order to Search an item\r\nAs a User\r\nI want to get the Search Result",
  "id": "search-the-item",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 8,
  "name": "I am Searching an item",
  "description": "",
  "id": "search-the-item;i-am-searching-an-item",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 7,
      "name": "@tester"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "I enter the search item Rice",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "I logged in as a user",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "I get the Valid result",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "I enter the search item ###%",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "I logged in as a user",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "I get the msg for invalid entry",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Rice",
      "offset": 24
    }
  ],
  "location": "Search.Enter_item(String)"
});
formatter.result({
  "duration": 173963487,
  "status": "passed"
});
formatter.match({
  "location": "Search.Validate_user()"
});
formatter.result({
  "duration": 85231,
  "status": "passed"
});
formatter.match({
  "location": "Search.getvalidsearch()"
});
formatter.result({
  "duration": 81660,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "###%",
      "offset": 24
    }
  ],
  "location": "Search.Enter_item(String)"
});
formatter.result({
  "duration": 133871,
  "status": "passed"
});
formatter.match({
  "location": "Search.Validate_user()"
});
formatter.result({
  "duration": 74521,
  "status": "passed"
});
formatter.match({
  "location": "Search.getInvalidsearch()"
});
formatter.result({
  "duration": 95048,
  "status": "passed"
});
});