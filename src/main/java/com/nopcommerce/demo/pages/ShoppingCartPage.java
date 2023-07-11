package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class ShoppingCartPage extends Utility {

    By cart = By.xpath("//li[@id='topcartlink']/a[@class='ico-cart']");
    By goToCart = By.xpath("//button[contains(text(),'Go to cart')]");
    By shoppingCartText = By.xpath("//h1[contains(text(),'Shopping cart')]");
    By changeQty = By.xpath("//input[@class='qty-input']");
    By updateButton = By.xpath("//button[@class='button-2 update-cart-button']");
    By productPrice = By.xpath("//span[@class='value-summary']//strong[text()='$2,950.00']");
    By productPrice1 = By.xpath("//span[@class='value-summary']//strong[text()='$698.00']");
    By checkBoxButton = By.xpath("//input[@id='termsofservice']");
    By checkOutButton = By.xpath("//button[@id='checkout']");
    By verifyQty = By.xpath("//input[@class='qty-input']");


    public void mouseHoverAndClickOnCart(){
        mouseHoverTwo(cart,goToCart);
    }
    public void getShoppingCartText(){
        verifyText(shoppingCartText,"Shopping cart","Shopping cart is not displayed");
    }
    public void changeProductQty(){
        driver.findElement(By.xpath("//input[@class='qty-input']")).clear();
        sendTextToElement(changeQty,"2");
        clickOnElement(updateButton);
    }
    public void getProductPrice(){
        verifyText(productPrice,"$2,950.00","$2,950.00 is not displayed");
    }
    public void getProductPrice1(){
        verifyText(productPrice1,"$698.00","$698.00 is not displayed");
    }

    public void clickOnCheckBox(){
        clickOnElement(checkBoxButton);
    }
    public void clickOnCheckOut(){
        clickOnElement(checkOutButton);
    }
    public void getQty(){
        verifyText(verifyQty,"2","Qty is not dispplayed");
    }
}
