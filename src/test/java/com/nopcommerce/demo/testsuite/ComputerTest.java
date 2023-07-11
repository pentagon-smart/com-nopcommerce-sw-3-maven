package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.*;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.annotations.Test;

public class ComputerTest extends BaseTest {

    ComputerPage computerPage = new ComputerPage();
    TopMenuPage topMenuPage = new TopMenuPage();
    ShoppingCartPage shoppingCartPage =new ShoppingCartPage();
    CheckOutPage checkOutPage = new CheckOutPage();
    PaymentPage paymentPage = new PaymentPage();
    ConfirmOrderPage confirmOrderPage = new ConfirmOrderPage();

    @Test
    public void verifyProductArrangeInAlphaBaticalOrder() throws InterruptedException {
        //1.1 Click on Computer Menu.
        //1.2 Click on Desktop
        topMenuPage.mouseHoverAndClickOnDesktopMenu();
        Thread.sleep(1000);
        //1.3 Select Sort By position "Name: Z to A"
        computerPage.selectSortFilterZToA();
        Thread.sleep(1000);
        //1.4 Verify the Product will arrange in Descending order.
        topMenuPage.getProductArrange();
    }

    @Test
    public void verifyProductAddedToShoppingCartSuccessFully() throws InterruptedException {

        //2.1 Click on Computer Menu.
        //2.2 Click on Desktop
        topMenuPage.mouseHoverAndClickOnDesktopMenu();
        Thread.sleep(1000);
        //2.3 Select Sort By position "Name: A to Z"
        computerPage.selectSortFilterAToZ();
        Thread.sleep(1000);

        //2.4 Click on "Add To Cart"
        computerPage.clickOnAddToCart();
        Thread.sleep(1000);

        //2.5 Verify the Text "Build your own computer"
        computerPage.getBuildYourComputer();
        Thread.sleep(1000);

        //2.6 Select "2.2 GHz Intel Pentium Dual-Core E2200" using Select class
        computerPage.selectProcessor();
        Thread.sleep(1000);

        //2.7.Select "8GB [+$60.00]" using Select class.
        computerPage.selectRam();
        Thread.sleep(1000);

        //2.8 Select HDD radio "400 GB [+$100.00]"
        computerPage.selectHDD();
        Thread.sleep(1000);

        //2.9 Select OS radio "Vista Premium [+$60.00]"
        computerPage.selectOS();
        Thread.sleep(1000);

        //2.10 Check Two Check boxes "Microsoft Office [+$50.00]" and "Total Commander [+$5.00]"
        computerPage.clickOnTotalCommander();
        Thread.sleep(1000);

        //2.11 Verify the price "$1,475.00"
        computerPage.getPriceText();
        Thread.sleep(1000);

        //2.12 Click on "ADD TO CARD" Button.
        computerPage.clickOnAddToCartLink();
        Thread.sleep(1000);
        //2.13 Verify the Message "The product has been added to your shopping cart" on Top green Bar
        computerPage.getProductMessage();
        Thread.sleep(1000);

        //After that close the bar clicking on the cross button.
        computerPage.clickOnCloseButton();
        Thread.sleep(1000);

        //2.14 Then MouseHover on "Shopping cart" and Click on "GO TO CART" button.
        shoppingCartPage.mouseHoverAndClickOnCart();
        Thread.sleep(1000);

        //2.15 Verify the message "Shopping cart"
        shoppingCartPage.getShoppingCartText();
        Thread.sleep(1000);

        //2.16 Change the Qty to "2" and Click on "Update shopping cart"
        shoppingCartPage.changeProductQty();
        Thread.sleep(1000);

        //2.17 Verify the Total"$2,950.00"
        shoppingCartPage.getProductPrice();
        Thread.sleep(1000);

        //2.18 click on checkbox “I agree with the terms of service”
        shoppingCartPage.clickOnCheckBox();
        Thread.sleep(1000);

        //2.19 Click on “CHECKOUT”
        shoppingCartPage.clickOnCheckOut();
        Thread.sleep(1000);

        //2.20 Verify the Text “Welcome, Please Sign In!”
        checkOutPage.getproductText();
        Thread.sleep(1000);

        //2.21Click on “CHECKOUT AS GUEST” Tab
        checkOutPage.clickONCheckOutGuest();
        Thread.sleep(1000);

        //2.22 Fill the all mandatory field
        checkOutPage.enterGuestDetails();
        Thread.sleep(1000);

        //2.23 Click on “CONTINUE”
        checkOutPage.clickOnContinueButton();
        Thread.sleep(1000);

        //2.24 Click on Radio Button “Next Day Air($0.00)”
        paymentPage.clickOnNextDayAir();
        Thread.sleep(1000);

        //2.25 Click on “CONTINUE”
        paymentPage.clickOnContinue();
        Thread.sleep(1000);

        //2.26 Select Radio Button “Credit Card”
        paymentPage.clickOnCreditCard();
        Thread.sleep(1000);

        // 2.27 Select “Master card” From Select credit card dropdown
        paymentPage.selectMasterCard();
        Thread.sleep(1000);

        //2.28 Fill all the details
        paymentPage.enterCardDetails();
        Thread.sleep(1000);

        //2.29 Click on “CONTINUE”
        paymentPage.clickOnContinue1();
        Thread.sleep(1000);

        //2.30 Verify “Payment Method” is “Credit Card”
        confirmOrderPage.getPaymentMthod();
        Thread.sleep(1000);

        //2.32 Verify “Shipping Method” is “Next Day Air”
//        confirmOrderPage.getShippingMethod();
//        Thread.sleep(1000);

        //2.33 Verify Total is “$2,950.00”
        confirmOrderPage.getTotal();
        Thread.sleep(1000);

        //2.34 Click on “CONFIRM”
        confirmOrderPage.clickOnConfirm();
        Thread.sleep(1000);

        //2.35 Verify the Text “Thank You”
        confirmOrderPage.getThankYou();
        Thread.sleep(1000);

        //2.36 Verify the message “Your order has been successfully processed!”
        confirmOrderPage.getMessage();
        Thread.sleep(1000);

        //2.37 Click on “CONTINUE”
        confirmOrderPage.clickOnContinue();
        Thread.sleep(1000);

        //2.37 Verify the text “Welcome to our store”
        confirmOrderPage.getText();
        Thread.sleep(1000);
    }
}
