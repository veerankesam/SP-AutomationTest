package com.cucumberFramework.pageObjects;

import com.cucumberFramework.helper.MyException;
import com.cucumberFramework.helper.WaitHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;


public class securePayStandardPricingPage {

    private WebDriver driver;
    WaitHelper waitHelper;

    public securePayStandardPricingPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        waitHelper = new WaitHelper(driver);
    }

    //**********************Locaters*******************************
    @FindBy(xpath = "//*[@class=\"o-item u-10/12@wide\"]/div/div[1]//a")
    WebElement btnLearnMorePoli;

    //**********************Locaters*******************************


    //*********************Methods**************************

    // to verify contact us page
    public void verifyTitle(String strExpTitle) throws MyException {
        try {
            waitHelper.WaitForElement(this.btnLearnMorePoli, 60);
            String strActTitle = driver.getTitle();
            System.out.println("Page title is$$$$$$$$$$$$: " + strActTitle);
            Assert.assertTrue(driver.getTitle().contains(strExpTitle));
            System.out.println("Standard pricing page is loaded successfully & Page title is***: " + strActTitle);
        } catch (Exception e) {
            throw new MyException("Failed to load Standard pricing Page");
        }
    }

    // to click on Learn More button under Poli
    public void clickLearnMorePoli() throws MyException {
        try {
            waitHelper.WaitForElement(this.btnLearnMorePoli, 60);
            this.btnLearnMorePoli.click();
            System.out.println("Learn More button under Poli is clicked successfully");
        } catch (Exception e) {
            throw new MyException("Failed To click Learn More button under Poli");
        }
    }

    //*********************Methods**************************

}
