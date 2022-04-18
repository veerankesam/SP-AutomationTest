package com.cucumberFramework.stepdefinitions;

import com.cucumberFramework.pageObjects.securePayPricingPage;
import com.cucumberFramework.testBase.TestBase;
import cucumber.api.java.en.When;

public class securePayPricingPageStepDefinitions extends TestBase {
    securePayPricingPage objSecurePayPricingPage = new securePayPricingPage(driver);

    @When("^Navigates to Pricing$")
    public void Navigates_to_Pricing() throws Throwable {
        objSecurePayPricingPage.clickPricingMainMenu();
    }

    @When("^Click on Standard Pricing$")
    public void Click_on_Standard_Pricing() throws Throwable {
        objSecurePayPricingPage.clickStandardPricing();

    }

}