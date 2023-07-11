package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class CheckOutPage extends Utility {

    By verifyText1 = By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]");
    By checkOutGuest = By.xpath("//button[contains(text(),'Checkout as Guest')]");
    By fName = By.xpath("//input[@id='BillingNewAddress_FirstName']");
    By lName = By.xpath("//input[@id='BillingNewAddress_LastName']");
    By email = By.xpath("//input[@id='BillingNewAddress_Email']");
    By country = By.xpath("//select[@id='BillingNewAddress_CountryId']");
    By address = By.xpath("//select[@id='BillingNewAddress_StateProvinceId']");
    By city = By.xpath("//input[@id='BillingNewAddress_City']");
    By address1 = By.xpath("//input[@id='BillingNewAddress_Address1']");
    By zipCode = By.xpath("//input[@id='BillingNewAddress_ZipPostalCode']");
    By number = By.xpath("//input[@id='BillingNewAddress_PhoneNumber']");
    By continueButton = By.xpath("//div[@id='billing-buttons-container']//button[text()='Continue']");
    By registerButton = By.xpath("//button[contains(text(),'Register')]");

    public void getproductText(){
        verifyText(verifyText1,"Welcome, Please Sign In!","Message is not displayed");
    }
    public void clickONCheckOutGuest(){
        clickOnElement(checkOutGuest);
    }
    public void enterGuestDetails(){
        sendTextToElement(fName,"Poonam");
        sendTextToElement(lName,"Ramavat");
        sendTextToElement(email,"poonam@gmail.com");
        selectByVisibleTextFromDropDown(country,"United States");;
        selectByVisibleTextFromDropDown(address,"Arizona");
        sendTextToElement(city,"New York");
        sendTextToElement(address1,"Burley Road");
        sendTextToElement(zipCode,"FA1234");
        sendTextToElement(number,"09887241121");
    }
    public void clickOnContinueButton(){
        clickOnElement(continueButton);
    }
    public void clickOnRegisterButton(){
        clickOnElement(registerButton);
    }
}
