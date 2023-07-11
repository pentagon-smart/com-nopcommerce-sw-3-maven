package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.*;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.annotations.Test;

public class ElectronicsTest extends BaseTest {
    TopMenuPage topMenuPage = new TopMenuPage();
    CellPhonePage cellPhonePage = new CellPhonePage();
    ProductPage productPage = new ProductPage();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
    CheckOutPage checkOutPage = new CheckOutPage();
    RegisterPage registerPage = new RegisterPage();

    @Test
    public void verifyUserShouldNavigateToCellPhonesPageSuccessfully() {
        //1.1 Mouse Hover on “Electronics” Tab
        //1.2 Mouse Hover on “Cell phones” and click
        topMenuPage.mouseHoverAndClickCellPhone();
        //1.3 Verify the text “Cell phones”
        topMenuPage.getProductCellPhone();

    }

    @Test
    public void verifyThatTheProductAddedSuccessfullyAndPlaceOrderSuccessfully() throws InterruptedException {
        //2.1 Mouse Hover on “Electronics” Tab
        //2.2 Mouse Hover on “Cell phones” and click
        topMenuPage.mouseHoverAndClickCellPhone();
        Thread.sleep(1000);
        //2.3 Verify the text “Cell phones”
        cellPhonePage.getCellPhoneText();
        Thread.sleep(1000);

        //2.4 Click on List View Tab
        cellPhonePage.clickOnListVeiw();
        Thread.sleep(1000);

        //2.5 Click on product name “Nokia Lumia 1020” link
        cellPhonePage.clickOnProduct();
        Thread.sleep(1000);

        //2.6 Verify the text “Nokia Lumia 1020”
        productPage.getProductName();
        Thread.sleep(1000);

        //2.7 Verify the price “$349.00”
        productPage.getProductPrice();
        Thread.sleep(1000);

        //2.8 Change quantity to 2
        productPage.enterQty();
        Thread.sleep(1000);

        //2.9 Click on “ADD TO CART” tab
        productPage.clickOnAddToCart();
        Thread.sleep(1000);

        //2.10 Verify the Message "The product has been added to your shopping cart" on Top green Bar
        productPage.getText();
        Thread.sleep(1000);

        //After that close the bar clicking on the cross button.
        productPage.clickOnCloseButton();
        Thread.sleep(1000);

        //2.11 Then MouseHover on "Shopping cart" and Click on "GO TO CART" button.
        shoppingCartPage.mouseHoverAndClickOnCart();
        Thread.sleep(1000);

        //2.12 Verify the message "Shopping cart"
        shoppingCartPage.getShoppingCartText();
        Thread.sleep(1000);

        //2.13 Verify the quantity is 2
//        shoppingCartPage.getQty();
//        Thread.sleep(1000);

        //2.14 Verify the Total $698.00
        shoppingCartPage.getProductPrice1();
        Thread.sleep(1000);

        //2.15 click on checkbox “I agree with the terms of service”
        shoppingCartPage.clickOnCheckBox();
        Thread.sleep(1000);

        //2.16 Click on “CHECKOUT”
        shoppingCartPage.clickOnCheckOut();
        Thread.sleep(1000);

        //2.17 Verify the Text “Welcome, Please Sign In!”
        checkOutPage.getproductText();
        Thread.sleep(1000);

        //2.18 Click on “REGISTER” tab
        checkOutPage.clickOnRegisterButton();
        Thread.sleep(1000);

        //2.19 Verify the text “Register”
        registerPage.getText();
        Thread.sleep(1000);

        //2.20 Fill the mandatory fields
        registerPage.enterDetails();
        Thread.sleep(1000);

        //2.21 Click on “REGISTER” Button
        registerPage.clickOnRegisterButton();
        Thread.sleep(1000);

        //2.22 Verify the message “Your registration completed”
        registerPage.getRegisteText();
        Thread.sleep(1000);

        //2.23 Click on “CONTINUE” tab
        registerPage.clickOnContinue();
        Thread.sleep(1000);

        //2.24 Verify the text “Shopping card”
//        registerPage.getShoppingCartText();

        //2.25 click on checkbox “I agree with the terms of service”
        //2.26 Click on “CHECKOUT”
        //2.27 Fill the Mandatory fields
        //2.28 Click on “CONTINUE”
        //2.29 Click on Radio Button “2nd Day Air ($0.00)”
        //2.30 Click on “CONTINUE”
        //2.31 Select Radio Button “Credit Card”
        //2.32 Select “Visa” From Select credit card dropdown
        //2.33 Fill all the details
        //2.34 Click on “CONTINUE”
        //2.35 Verify “Payment Method” is “Credit Card”
        //2.36 Verify “Shipping Method” is “2nd Day Air”
        //2.37 Verify Total is “$698.00”
        //2.38 Click on “CONFIRM”
        //2.39 Verify the Text “Thank You”
        //2.40 Verify the message “Your order has been successfully processed!”
        //2.41 Click on “CONTINUE”
        //2.42 Verify the text “Welcome to our store”
        //2.43 Click on “Logout” link
        //2.44 Verify the URL is “https://demo.nopcommerce.com/”
    }
}
