package com.cucumberFramework.stepdefinitions;

import com.cucumberFramework.helper.MyException;
import com.cucumberFramework.pageObjects.securePayPoliSitePage;
import com.cucumberFramework.testBase.TestBase;
import cucumber.api.java.en.And;

public class securePayPoliSitePageStepDefinitions extends TestBase {
    securePayPoliSitePage objsecurePayPoliSitePage = new securePayPoliSitePage(driver);

    @And("^Verify POLi site \"([^\"]*)\" is opened & loaded in the new window$")
    public void Verifies_Poli_site_is_loaded(String strExpTitle) throws MyException {
        objsecurePayPoliSitePage.switchTab();
        objsecurePayPoliSitePage.verifyPoliPageTitle(strExpTitle);
    }

    @And("^Navigate to Sell to Make a sales enquiry on the POLi site$")
    public void click_on_Learn_more_button_under_POLi() throws Throwable {
        objsecurePayPoliSitePage.mouseHoverSell();
        objsecurePayPoliSitePage.clickMakeSalesEnquiry();
    }
}