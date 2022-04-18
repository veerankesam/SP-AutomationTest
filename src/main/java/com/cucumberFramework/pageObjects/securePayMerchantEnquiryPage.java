package com.cucumberFramework.pageObjects;

import com.cucumberFramework.helper.MyException;
import com.cucumberFramework.helper.WaitHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class securePayMerchantEnquiryPage {
    private WebDriver driver;
    WaitHelper waitHelper;

    public securePayMerchantEnquiryPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        waitHelper = new WaitHelper(driver);
    }

    //**********************Locaters*******************************
    @FindBy(xpath = "//*[@id='Company']")
    WebElement txtCompany;
    @FindBy(xpath = "//*[@id='FirstName']")
    WebElement txtFirstName;
    @FindBy(xpath = "//*[@id='LastName']")
    WebElement txtLastName;
    @FindBy(xpath = "//*[@id='Description']")
    WebElement txtDescription;
    @FindBy(xpath = "//*[@id='Phone']")
    WebElement txtPhone;
    @FindBy(xpath = "//*[@id='Website']")
    WebElement txtWebsite;
    @FindBy(xpath = "//*[@id='Email']")
    WebElement txtEmail;
    //**********************Locaters*******************************


    //*********************Methods**************************
    // to enter Company in Merchant Enquiry Page
    public void enterCompany(String strCompany) throws MyException {
        try {
            waitHelper.WaitForElement(this.txtCompany, 60);
            this.txtCompany.sendKeys(strCompany);
            System.out.println("Company entered successfully in Merchant Enquiry Page");
        } catch (Exception e) {
            throw new MyException("Failed to enter Company in Merchant Enquiry Page");
        }
    }

    // to enter FirstName in Merchant Enquiry Page
    public void enterFirstName(String strFirstName) throws MyException {
        try {
            this.txtFirstName.sendKeys(strFirstName);
            System.out.println("FirstName entered successfully in Merchant Enquiry Page");
        } catch (Exception e) {
            throw new MyException("Failed to enter FirstName in Merchant Enquiry Page");
        }
    }

    // to enter LastName in Merchant Enquiry Page
    public void enterLastName(String strLastName) throws MyException {
        try {
            this.txtLastName.sendKeys(strLastName);
            System.out.println("LastName entered successfully in Merchant Enquiry Page");
        } catch (Exception e) {
            throw new MyException("Failed to enter LastName in Merchant Enquiry Page");
        }
    }

    // to enter Description in Merchant Enquiry Page
    public void enterDescription(String strDescription) throws MyException {
        try {
            this.txtDescription.sendKeys(strDescription);
            System.out.println("Description entered successfully in Merchant Enquiry Page");
        } catch (Exception e) {
            throw new MyException("Failed to enter Description in Merchant Enquiry Page");
        }
    }

    // to enter Phone in Merchant Enquiry Page
    public void enterPhone(String intPhone) throws MyException {
        try {
            this.txtPhone.sendKeys(intPhone);
            System.out.println("Phone entered successfully in Merchant Enquiry Page");
        } catch (Exception e) {
            throw new MyException("Failed to enter Phone in Merchant Enquiry Page");
        }
    }

    // to enter Website in Merchant Enquiry Page
    public void enterWebsite(String strWebsite) throws MyException {
        try {
            this.txtWebsite.sendKeys(strWebsite);
            System.out.println("Website entered successfully in Merchant Enquiry Page");
        } catch (Exception e) {
            throw new MyException("Failed to enter Website in Merchant Enquiry Page");
        }
    }

    // to enter Email in Merchant Enquiry Page
    public void enterEmail(String strEmail) throws MyException {
        try {
            this.txtEmail.sendKeys(strEmail);
            System.out.println("Email entered successfully in Merchant Enquiry Page");
        } catch (Exception e) {
            throw new MyException("Failed to enter Email in Merchant Enquiry Page");
        }
    }
    //*********************Methods**************************
}
