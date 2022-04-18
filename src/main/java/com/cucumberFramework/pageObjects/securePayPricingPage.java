package com.cucumberFramework.pageObjects;

import com.cucumberFramework.helper.MyException;
import com.cucumberFramework.helper.WaitHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class securePayPricingPage {

    private WebDriver driver;
    WaitHelper waitHelper;

    public securePayPricingPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        waitHelper = new WaitHelper(driver);
    }

    //**********************Locaters*******************************
    @FindBy(xpath = "//span[text()='Pricing']")
    WebElement mnuPricing;

    @FindBy(xpath = "//a[text()='Standard pricing']")
    WebElement mnuStandardPricing;

    @FindBy(xpath = "//*[@class=\"o-item u-10/12@wide\"]/div/div[1]//a")
    WebElement btnLearnMoreUnderPOLi;

    //**********************Locaters*******************************


    //*********************Methods**************************
    // to click on Pricing main menu
    public void clickPricingMainMenu() throws MyException {
        try {
            waitHelper.WaitForElement(this.mnuPricing, 60);
            this.mnuPricing.click();
            System.out.println("Pricing menu is clicked successfully");
        } catch (Exception e) {
            throw new MyException("Failed To click Pricing menu");
        }
    }

    // to click Learn more button under POLi
    public void clickStandardPricing() throws MyException {
        try {
            waitHelper.WaitForElement(this.mnuStandardPricing, 60);
            this.mnuStandardPricing.click();
            System.out.println("Standard Pricing sub menu item is clicked successfully");
        } catch (Exception e) {
            throw new MyException("Failed To click Standard Pricing sub menu");
        }
    }

    // to click Learn more button under POLi
    public void clickLearnMoreUnderPOLi() throws MyException {
        try {
            waitHelper.WaitForElement(this.btnLearnMoreUnderPOLi, 60);
            this.btnLearnMoreUnderPOLi.click();
            System.out.println("Learn more button under POLi is clicked successfully");
        } catch (Exception e) {
            throw new MyException("Failed To click Learn more button under POLi");
        }
    }
    //*********************Methods**************************

}
