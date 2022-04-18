package com.cucumberFramework.pageObjects;

import com.cucumberFramework.helper.MyException;
import com.cucumberFramework.helper.WaitHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.ArrayList;


public class securePayPoliSitePage {

    private WebDriver driver;
    WaitHelper waitHelper;

    public securePayPoliSitePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        waitHelper = new WaitHelper(driver);
    }

    //**********************Locaters*******************************
    @FindBy(xpath = "//span[text()='Sell']")
    WebElement mnuSell;

    @FindBy(xpath = "//a[text()='Make a sales enquiry']")
    WebElement mnuMakeSalesEnquiry;


    //**********************Locaters*******************************


    //*********************Methods**************************


    // to verify contact us page
    public void verifyPoliPageTitle(String strExpTitle) throws MyException {
        try {
            waitHelper.WaitForElement(this.mnuSell, 60);
            //driver.findElement(By.xpath("//span[text()='Sell']")).click();
            String strActTitle = driver.getTitle();
            System.out.println("Page title is@@@@@@@@: " + strActTitle);
            Assert.assertTrue(driver.getTitle().contains(strExpTitle));
            System.out.println("Poli site page is loaded successfully & Page title is***: " + strActTitle);
        } catch (Exception e) {
            throw new MyException("Failed to load Poli site Page");
        }
    }

    // to mouse hover on Sell main menu
    public void mouseHoverSell() throws MyException {
        try {
            waitHelper.WaitForElement(this.mnuSell, 30);
            //Mouse hover
            Actions action = new Actions(driver);
            action.moveToElement(this.mnuSell).build().perform();

            System.out.println("Sell main menu mouse hover successfully");
        } catch (Exception e) {
            throw new MyException("Failed To mouse hover Sell main menu ");
        }
    }

    // to click on Make a Sales Enquiry menu
    public void clickMakeSalesEnquiry() throws MyException {
        try {
            this.mnuSell.click();
            System.out.println("Make a Sales Enquiry menu item is clicked successfully");
        } catch (Exception e) {
            throw new MyException("Failed To click Make a Sales Enquiry menu item");
        }
    }

    // Switch window
    public void switchTab() throws MyException {
        try {
            //Tab switch
            ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
            driver.switchTo().window(tabs2.get(1));
            System.out.println("Switch window done successfully");
        } catch (Exception e) {
            throw new MyException("Failed To switch window");
        }
    }

    //*********************Methods**************************

}
