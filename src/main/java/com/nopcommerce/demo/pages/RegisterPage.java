package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class RegisterPage extends Utility {

    By verifyText = By.xpath("//h1[contains(text(),'Register')]");
    By fName = By.xpath("//input[@id='FirstName']");
    By lName= By.xpath("//input[@id='LastName']");
    By email = By.xpath("//input[@id='Email']");
    By password = By.xpath("//input[@id='Password']");
    By confirmPassword = By.xpath("//input[@id='ConfirmPassword']");
    By registerButton = By.xpath("//button[@id='register-button']");
    By verifyRegisterText = By.xpath("//div[contains(text(),'Your registration completed')]");
    By continueButton = By.xpath("//a[contains(text(),'Continue')]");
    By verifyShoppingCarText = By.xpath("//h1[contains(text(),'Shopping cart')]");
    public void getText(){
        verifyText(verifyText,"Register","Register is not displayed");
    }
    public void enterDetails(){
        sendTextToElement(fName,"Poonam");
        sendTextToElement(lName,"ramavat");
        sendTextToElement(email,"Poonam12356@gmail.com");
        sendTextToElement(password,"Poonam123");
        sendTextToElement(confirmPassword,"Poonam123");
    }
    public void clickOnRegisterButton(){
        clickOnElement(registerButton);
    }
    public void getRegisteText(){
        verifyText(verifyRegisterText,"Your registration completed","Text is not displayed");
    }
    public void clickOnContinue(){
        clickOnElement(continueButton);
    }
    public void getShoppingCartText(){
        verifyText(verifyShoppingCarText,"Shopping card","Shopping card is not displayed");
    }

}
