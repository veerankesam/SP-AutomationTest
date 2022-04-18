package com.cucumberFramework.stepdefinitions;

import com.cucumberFramework.helper.MyException;
import com.cucumberFramework.pageObjects.securePayStandardPricingPage;
import com.cucumberFramework.testBase.TestBase;
import cucumber.api.java.en.And;


public class securePayStandardPricingPageStepDefinitions extends TestBase {
    securePayStandardPricingPage objsecurePayStandardPricingPage = new securePayStandardPricingPage(driver);

    @And("Verifies that Standard Pricing page \"([^\"]*)\" is loaded")
    public void Verifies_that_Standard_Pricing_page_is_loaded(String strExpTitle) throws MyException {
        objsecurePayStandardPricingPage.verifyTitle(strExpTitle);
    }

    @And("^Click on Learn more button under POLi$")
    public void Click_on_Learn_more_button_under_POLi() throws Throwable {
        objsecurePayStandardPricingPage.clickLearnMorePoli();
    }

}