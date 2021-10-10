$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("classpath:features/Order.feature");
formatter.feature({
  "name": "Order Testing",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Testing buy Hummingbird Printed Sweater",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user logged in system",
  "keyword": "Given "
});
formatter.match({
  "location": "steps.OrderSteps.user_logs_in_to_prodkurscoderslab()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user chose Hummingbird Printed Sweater",
  "keyword": "And "
});
formatter.match({
  "location": "steps.OrderSteps.user_chose_Hummingbird_Printed_Sweater()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user added product to cart",
  "keyword": "And "
});
formatter.match({
  "location": "steps.OrderSteps.user_added_product_to_cart()"
});
formatter.result({
  "status": "passed"
});
});