$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "line": 1,
  "name": "Automation of Mont5",
  "description": "",
  "id": "automation-of-mont5",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "Mont5 Checkout",
  "description": "",
  "id": "automation-of-mont5;mont5-checkout",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@RandomBagCategoryProductCheckout"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I am on Mont5 Home page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I Click Login my account",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "I Enter  \"\u003cemail\u003e\" and \"\u003cpassword\u003e\" credentials",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "I Select a random category of Bags",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "Proceed to checkout and redirect to paypal",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "I am on Mont5 Home page",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "I logout",
  "keyword": "Then "
});
formatter.examples({
  "line": 12,
  "name": "",
  "description": "",
  "id": "automation-of-mont5;mont5-checkout;",
  "rows": [
    {
      "cells": [
        "email",
        "password"
      ],
      "line": 13,
      "id": "automation-of-mont5;mont5-checkout;;1"
    },
    {
      "cells": [
        "test@test.com",
        "test_123"
      ],
      "line": 14,
      "id": "automation-of-mont5;mont5-checkout;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 14,
  "name": "Mont5 Checkout",
  "description": "",
  "id": "automation-of-mont5;mont5-checkout;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@RandomBagCategoryProductCheckout"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I am on Mont5 Home page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I Click Login my account",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "I Enter  \"test@test.com\" and \"test_123\" credentials",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "I Select a random category of Bags",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "Proceed to checkout and redirect to paypal",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "I am on Mont5 Home page",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "I logout",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "5",
      "offset": 12
    }
  ],
  "location": "dashboardSteps.iAmOnMontHomePage(int)"
});
formatter.result({
  "duration": 16630347800,
  "status": "passed"
});
formatter.match({
  "location": "dashboardSteps.iClickLoginMyAccount()"
});
formatter.result({
  "duration": 10164542000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "test@test.com",
      "offset": 10
    },
    {
      "val": "test_123",
      "offset": 30
    }
  ],
  "location": "dashboardSteps.iEnterAndCredentials(String,String)"
});
formatter.result({
  "duration": 9290055800,
  "status": "passed"
});
formatter.match({
  "location": "dashboardSteps.iSelectARandomCategoryOfBags()"
});
formatter.result({
  "duration": 3180111600,
  "error_message": "org.openqa.selenium.interactions.MoveTargetOutOfBoundsException: move target out of bounds\n  (Session info: chrome\u003d86.0.4240.111)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-RV76CN4\u0027, ip: \u0027192.168.83.2\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002711.0.3\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 86.0.4240.111, chrome: {chromedriverVersion: 85.0.4183.87 (cd6713ebf92fa..., userDataDir: C:\\Users\\DISCRE~1\\AppData\\L...}, goog:chromeOptions: {debuggerAddress: localhost:11716}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: 416a2e47d24ac8f51716e1237cc0d300\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:490)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.perform(RemoteWebDriver.java:618)\r\n\tat org.openqa.selenium.interactions.Actions$BuiltAction.perform(Actions.java:639)\r\n\tat pages.DashboardPage.SelectRandomBagCategory(DashboardPage.java:117)\r\n\tat steps.dashboardSteps.iSelectARandomCategoryOfBags(dashboardSteps.java:37)\r\n\tat ✽.Then I Select a random category of Bags(Login.feature:8)\r\n",
  "status": "failed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({
  "arguments": [
    {
      "val": "5",
      "offset": 12
    }
  ],
  "location": "dashboardSteps.iAmOnMontHomePage(int)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "dashboardSteps.iLogout()"
});
formatter.result({
  "status": "skipped"
});
});