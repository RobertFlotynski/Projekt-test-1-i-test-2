$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("classpath:features/Login.feature");
formatter.feature({
  "name": "Login after Change user information",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Add new address",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User click sign in button",
  "keyword": "Given "
});
formatter.match({
  "location": "steps.ChangeUserInfoSteps.user_click_sign_in_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "set email and password",
  "keyword": "And "
});
formatter.match({
  "location": "steps.ChangeUserInfoSteps.set_email_and_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click login button",
  "keyword": "And "
});
formatter.match({
  "location": "steps.ChangeUserInfoSteps.click_login_button()"
});
formatter.result({
  "error_message": "io.cucumber.java.PendingException: TODO: implement me\r\n\tat steps.ChangeUserInfoSteps.click_login_button(ChangeUserInfoSteps.java:54)\r\n\tat ✽.click login button(classpath:features/Login.feature:7)\r\n",
  "status": "pending"
});
formatter.step({
  "name": "click addresses",
  "keyword": "And "
});
formatter.match({
  "location": "steps.ChangeUserInfoSteps.click_addresses()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "click create new address",
  "keyword": "And "
});
formatter.match({
  "location": "steps.ChangeUserInfoSteps.click_create_new_address()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "set data to form",
  "keyword": "And "
});
formatter.match({
  "location": "steps.ChangeUserInfoSteps.set_data_to_form()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "set click save button",
  "keyword": "And "
});
formatter.match({
  "location": "steps.ChangeUserInfoSteps.set_click_save_button()"
});
formatter.result({
  "status": "skipped"
});
});