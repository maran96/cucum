Feature: verify homepage



Scenario Outline: Verify Tabs in Home Page

Given User launch the application
When User enter "<data>" in searchbox
Then User should see the respective productpage page "<data>"

Examples:
|data|
|REDMI|
|IPHONE|






 