$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/login.feature");
formatter.feature({
  "name": "To validate login functionality of fb application",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user need to be in login page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefenition1.user_need_to_be_in_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate login with empty username and empty password",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "name": "user will clicks login page",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefnition2.user_will_clicks_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user will navigate to invalid credentila page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefnition2.user_will_navigate_to_invalid_credentila_page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/Features/product.feature");
formatter.feature({
  "name": "To validate the search functionality of amazon page",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "To check the searchablity of desired product",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@sanity"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user need to be in amazon page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefnition3.user_need_to_be_in_amazon_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user will enter product name in search box",
  "rows": [
    {
      "cells": [
        "product"
      ]
    },
    {
      "cells": [
        "iphone"
      ]
    },
    {
      "cells": [
        "mac laptop"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "StepDefnition3.user_will_enter_product_name_in_search_box(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "use clicks search button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefnition3.use_clicks_search_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user will redirect tp product page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefnition3.user_will_redirect_tp_product_page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});