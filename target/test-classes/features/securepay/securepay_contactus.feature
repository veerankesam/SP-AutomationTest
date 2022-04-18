Feature: As a user I should be able to Search SecurePay website in Google and navigate to Contact us tab and fill the details

  Scenario Outline: Searching SecurePay website in Google and fill the Contact us details
    Given User search for "<SearchText>" on the google page
    And Click on the securePay website
    When Navigates to Pricing
    And Click on Standard Pricing
    And Verifies that Standard Pricing page "<ExpStandardPricingTitle>" is loaded
    And Click on Learn more button under POLi
    And Verify POLi site "<ExpPOLiSiteTitle>" is opened & loaded in the new window
    And Navigate to Sell to Make a sales enquiry on the POLi site
    Then Fill the merchant enquiry form with random generated data

 	Examples:
	|SearchText|ExpStandardPricingTitle|ExpPOLiSiteTitle|
	|SecurePay|Online Payment Gateway|POLi Payments|




