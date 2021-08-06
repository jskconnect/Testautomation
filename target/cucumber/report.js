$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/confirmNews.feature");
formatter.feature({
  "line": 2,
  "name": "Confirm the news is valid by Searching in Google",
  "description": "",
  "id": "confirm-the-news-is-valid-by-searching-in-google",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@NewsValidation"
    },
    {
      "line": 1,
      "name": "@smoke"
    },
    {
      "line": 1,
      "name": "@newsregression"
    }
  ]
});
formatter.scenarioOutline({
  "line": 13,
  "name": "To Confirm the news is valid",
  "description": "",
  "id": "confirm-the-news-is-valid-by-searching-in-google;to-confirm-the-news-is-valid",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 12,
      "name": "@Checknews"
    },
    {
      "line": 12,
      "name": "@searchConfirmNews"
    }
  ]
});
formatter.step({
  "line": 14,
  "name": "Launch the application",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "navigate to \"News\" home page",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "I confirm the news \"\u003csplitword\u003e\" by searching in google",
  "rows": [
    {
      "cells": [
        "\u003cnewsToSearch\u003e"
      ],
      "line": 17
    }
  ],
  "keyword": "And "
});
formatter.examples({
  "line": 18,
  "name": "",
  "description": "",
  "id": "confirm-the-news-is-valid-by-searching-in-google;to-confirm-the-news-is-valid;",
  "rows": [
    {
      "cells": [
        "newsToSearch",
        "splitword"
      ],
      "line": 19,
      "id": "confirm-the-news-is-valid-by-searching-in-google;to-confirm-the-news-is-valid;;1"
    },
    {
      "cells": [
        "Laura Muir keeps faith and is rewarded with Olympic",
        "silver"
      ],
      "line": 20,
      "id": "confirm-the-news-is-valid-by-searching-in-google;to-confirm-the-news-is-valid;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 76600,
  "status": "passed"
});
formatter.scenario({
  "line": 20,
  "name": "To Confirm the news is valid",
  "description": "",
  "id": "confirm-the-news-is-valid-by-searching-in-google;to-confirm-the-news-is-valid;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@smoke"
    },
    {
      "line": 1,
      "name": "@NewsValidation"
    },
    {
      "line": 1,
      "name": "@newsregression"
    },
    {
      "line": 12,
      "name": "@searchConfirmNews"
    },
    {
      "line": 12,
      "name": "@Checknews"
    }
  ]
});
formatter.step({
  "line": 14,
  "name": "Launch the application",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "navigate to \"News\" home page",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "I confirm the news \"silver\" by searching in google",
  "matchedColumns": [
    0,
    1
  ],
  "rows": [
    {
      "cells": [
        "Laura Muir keeps faith and is rewarded with Olympic"
      ],
      "line": 17
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "Home_stepdefn.launch_The_Application()"
});
formatter.result({
  "duration": 2410897300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "News",
      "offset": 13
    }
  ],
  "location": "Home_stepdefn.navigate_To_Home_Page(String)"
});
formatter.result({
  "duration": 3272584499,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "silver",
      "offset": 20
    }
  ],
  "location": "Home_stepdefn.i_Confirm_The_News_By_Searching_In_Google(String,DataTable)"
});
formatter.result({
  "duration": 9360262000,
  "status": "passed"
});
formatter.after({
  "duration": 83007699,
  "status": "passed"
});
});