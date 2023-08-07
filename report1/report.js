$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/cucumber.feature");
formatter.feature({
  "name": "To search T-Shirt prodect in  MYNTRA web application",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "Launch edgeBrowser",
  "keyword": "Given "
});
formatter.match({
  "location": "sample.launch_edgeBrowser()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To search T-Shirt prodect in  MYNTRA web application",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "Launch valid MYNTRA website url",
  "keyword": "When "
});
formatter.match({
  "location": "sample.launch_valid_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "sertch T-Shirt",
  "keyword": "And "
});
formatter.match({
  "location": "sample.sertch_T_Shirt()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "window handling",
  "keyword": "And "
});
formatter.match({
  "location": "sample.window_handling()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "select the M",
  "keyword": "And "
});
formatter.match({
  "location": "sample.select_the_M()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Add To Bag",
  "keyword": "And "
});
formatter.match({
  "location": "sample.add_To_Bag()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click the bag icon",
  "keyword": "And "
});
formatter.match({
  "location": "sample.click_the_bag_icon()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Clous browser",
  "keyword": "Then "
});
formatter.match({
  "location": "sample.clous_browser()"
});
formatter.result({
  "status": "passed"
});
});