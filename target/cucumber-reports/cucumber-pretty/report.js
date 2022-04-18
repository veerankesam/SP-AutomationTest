$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/securepay/securepay_contactus.feature");
formatter.feature({
  "line": 1,
  "name": "As a user I should be able to Search SecurePay website in Google and navigate to Contact us tab and fill the details",
  "description": "",
  "id": "as-a-user-i-should-be-able-to-search-securepay-website-in-google-and-navigate-to-contact-us-tab-and-fill-the-details",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Searching SecurePay website in Google and fill the Contact us details",
  "description": "",
  "id": "as-a-user-i-should-be-able-to-search-securepay-website-in-google-and-navigate-to-contact-us-tab-and-fill-the-details;searching-securepay-website-in-google-and-fill-the-contact-us-details",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "User search for \"\u003cSearchText\u003e\" on the google page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Click on the securePay website",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "Navigates to Pricing",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Click on Standard Pricing",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Verifies that Standard Pricing page \"\u003cExpStandardPricingTitle\u003e\" is loaded",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Click on Learn more button under POLi",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Verify POLi site \"\u003cExpPOLiSiteTitle\u003e\" is opened \u0026 loaded in the new window",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Navigate to Sell to Make a sales enquiry on the POLi site",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "Fill the merchant enquiry form with random generated data",
  "keyword": "Then "
});
formatter.examples({
  "line": 14,
  "name": "",
  "description": "",
  "id": "as-a-user-i-should-be-able-to-search-securepay-website-in-google-and-navigate-to-contact-us-tab-and-fill-the-details;searching-securepay-website-in-google-and-fill-the-contact-us-details;",
  "rows": [
    {
      "cells": [
        "SearchText",
        "ExpStandardPricingTitle",
        "ExpPOLiSiteTitle"
      ],
      "line": 15,
      "id": "as-a-user-i-should-be-able-to-search-securepay-website-in-google-and-navigate-to-contact-us-tab-and-fill-the-details;searching-securepay-website-in-google-and-fill-the-contact-us-details;;1"
    },
    {
      "cells": [
        "SecurePay",
        "Online Payment Gateway",
        "POLi Payments"
      ],
      "line": 16,
      "id": "as-a-user-i-should-be-able-to-search-securepay-website-in-google-and-navigate-to-contact-us-tab-and-fill-the-details;searching-securepay-website-in-google-and-fill-the-contact-us-details;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 6522876100,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "Searching SecurePay website in Google and fill the Contact us details",
  "description": "",
  "id": "as-a-user-i-should-be-able-to-search-securepay-website-in-google-and-navigate-to-contact-us-tab-and-fill-the-details;searching-securepay-website-in-google-and-fill-the-contact-us-details;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "User search for \"SecurePay\" on the google page",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Click on the securePay website",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "Navigates to Pricing",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Click on Standard Pricing",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Verifies that Standard Pricing page \"Online Payment Gateway\" is loaded",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Click on Learn more button under POLi",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Verify POLi site \"POLi Payments\" is opened \u0026 loaded in the new window",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Navigate to Sell to Make a sales enquiry on the POLi site",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "Fill the merchant enquiry form with random generated data",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "SecurePay",
      "offset": 17
    }
  ],
  "location": "googlePageStepDefinitions.User_search_for_securePay_on_google_page(String)"
});
formatter.result({
  "duration": 5550946500,
  "status": "passed"
});
formatter.match({
  "location": "googlePageStepDefinitions.Click_on_the_securePay_website()"
});
formatter.result({
  "duration": 3186926300,
  "status": "passed"
});
formatter.match({
  "location": "securePayPricingPageStepDefinitions.Navigates_to_Pricing()"
});
formatter.result({
  "duration": 98971600,
  "status": "passed"
});
formatter.match({
  "location": "securePayPricingPageStepDefinitions.Click_on_Standard_Pricing()"
});
formatter.result({
  "duration": 133120500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Online Payment Gateway",
      "offset": 37
    }
  ],
  "location": "securePayStandardPricingPageStepDefinitions.Verifies_that_Standard_Pricing_page_is_loaded(String)"
});
formatter.result({
  "duration": 678404500,
  "status": "passed"
});
formatter.match({
  "location": "securePayStandardPricingPageStepDefinitions.Click_on_Learn_more_button_under_POLi()"
});
formatter.result({
  "duration": 177048500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "POLi Payments",
      "offset": 18
    }
  ],
  "location": "securePayPoliSitePageStepDefinitions.Verifies_Poli_site_is_loaded(String)"
});
formatter.result({
  "duration": 2129532000,
  "status": "passed"
});
formatter.match({
  "location": "securePayPoliSitePageStepDefinitions.click_on_Learn_more_button_under_POLi()"
});
formatter.result({
  "duration": 862196800,
  "status": "passed"
});
formatter.match({
  "location": "securePayMerchantEnquiryPageStepDefinitions.Fill_the_merchant_enquiry_form_with_random_generated_data()"
});
formatter.result({
  "duration": 1324948000,
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 1056573700,
  "status": "passed"
});
});