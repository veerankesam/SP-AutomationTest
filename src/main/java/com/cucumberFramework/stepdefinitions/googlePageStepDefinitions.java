package com.cucumberFramework.stepdefinitions;

import com.cucumberFramework.helper.Constants;
import com.cucumberFramework.pageObjects.googlePage;
import com.cucumberFramework.testBase.TestBase;
import com.devskiller.jfairy.Fairy;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;

public class googlePageStepDefinitions extends TestBase {

    googlePage objGooglePage = new googlePage(driver);
    Fairy fairy = Fairy.create();

    @Given("^User search for \"([^\"]*)\" on the google page$")
    public void User_search_for_securePay_on_google_page(String SearchText) throws Throwable {
        driver.get(Constants.url);
        objGooglePage.searchItem(SearchText);
        objGooglePage.clickSearch();
    }

    @And("^Click on the securePay website$")
    public void Click_on_the_securePay_website() throws Throwable {
        objGooglePage.clickSecurePay();
    }

}