package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class ProductPage extends Utility {

    By productText = By.xpath("//h1[contains(text(),'Nokia Lumia 1020')]");
    By productPrice = By.xpath("//span[@id='price-value-20']");
    By changeQty = By.xpath("//input[@id='product_enteredQuantity_20']");
    By addToCart = By.xpath("//button[@id='add-to-cart-button-20']");
    By verifyText = By.xpath("//body/div[@id='bar-notification']/div[1]/p[1]");
    By closeButton = By.xpath("//span[@class='close']");

    public void getProductName() {
        verifyText(productText, "Nokia Lumia 1020", "Nokia Lumia 1020 is not displayed");
    }

    public void getProductPrice() {
        verifyText(productPrice, "$349.00", "$349.00 is not displayed");
    }

    public void enterQty() {
        driver.findElement(By.xpath("//input[@id='product_enteredQuantity_20']")).clear();
        sendTextToElement(changeQty, "2");
    }
    public void clickOnAddToCart(){
        clickOnElement(addToCart);
    }
    public void getText(){
        verifyText(verifyText,"The product has been added to your shopping cart","Text is not displayed");
    }
    public void clickOnCloseButton(){
        clickOnElement(closeButton);
    }
}
