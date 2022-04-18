package com.cucumberFramework.stepdefinitions;

import com.cucumberFramework.helper.MyException;
import com.cucumberFramework.pageObjects.securePayMerchantEnquiryPage;
import com.cucumberFramework.testBase.TestBase;
import com.devskiller.jfairy.Fairy;
import com.devskiller.jfairy.producer.person.Person;
import com.devskiller.jfairy.producer.text.TextProducer;
import cucumber.api.java.en.Then;

public class securePayMerchantEnquiryPageStepDefinitions extends TestBase {
    securePayMerchantEnquiryPage objsecurePayMerchantEnquiryPage = new securePayMerchantEnquiryPage(driver);
    Fairy fairy = Fairy.create();
    Person person = fairy.person();
    TextProducer textProducer = fairy.textProducer();


    @Then("^Fill the merchant enquiry form with random generated data$")
    public void Fill_the_merchant_enquiry_form_with_random_generated_data() throws MyException {
        objsecurePayMerchantEnquiryPage.enterCompany(person.getCompany().getName());
        objsecurePayMerchantEnquiryPage.enterFirstName(person.getFirstName());
        objsecurePayMerchantEnquiryPage.enterLastName(person.getLastName());
        objsecurePayMerchantEnquiryPage.enterDescription(textProducer.word());
        objsecurePayMerchantEnquiryPage.enterPhone(person.getTelephoneNumber());
        objsecurePayMerchantEnquiryPage.enterWebsite(person.getCompany().getUrl());
        objsecurePayMerchantEnquiryPage.enterEmail(person.getEmail());
    }
}