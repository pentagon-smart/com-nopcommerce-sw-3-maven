package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class ConfirmOrderPage extends Utility {

    By verifyPaymentMethod = By.xpath("//span[contains(text(),'Credit Card')]");
    By VerifyShippingMethod = By.xpath("//li[@class='shipping-method']/span[@class='value']");
    By verifyTotal = By.xpath("//span[@class='value-summary']//strong[text()='$2,950.00']");
    By confirmButton = By.xpath("//button[contains(text(),'Confirm')]");
    By verifyThankYouText = By.xpath("//h1[contains(text(),'Thank you')]");
    By verifyMessage = By.xpath("//strong[contains(text(),'Your order has been successfully processed!')]");
    By continueButton = By.xpath("//button[contains(text(),'Continue')]");
    By verifyText = By.xpath("//h2[contains(text(),'Welcome to our store')]");

    public void getPaymentMthod(){
        verifyText(verifyPaymentMethod,"Credit Card","Credit Card is not displayed");
    }
    public void getShippingMethod(){
        verifyText(verifyPaymentMethod,"Next Day Air","Next Day Air is not displayed");
    }
    public void getTotal(){
        verifyText(verifyTotal,"$2,950.00","$2,950.00 is not displaye");
    }
    public void clickOnConfirm(){
        clickOnElement(confirmButton);
    }
    public void getThankYou(){
        verifyText(verifyThankYouText,"Thank you","Thank you is not displayed");
    }

    public void getMessage(){
        verifyText(verifyMessage,"Your order has been successfully processed!","Message is not displayed");
    }
    public void clickOnContinue(){
        clickOnElement(continueButton);
    }
    public void getText(){
        verifyText(verifyText,"Welcome to our store","text is not displayed");
    }
}
