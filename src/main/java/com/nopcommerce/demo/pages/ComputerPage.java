package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class ComputerPage extends Utility {


    By sortFilterZToA = By.name("products-orderby");
    By sortFilterAToZ = By.xpath("//select[@id='products-orderby']");
    By addToCart = By.xpath("//div[@class='buttons']//button[text()='Add to cart']");
    By verifyText1 = By.xpath("//h1[contains(text(),'Build your own computer')]");
    By processor = By.xpath("//select[@id='product_attribute_1']");
    By ram = By.xpath("//select[@id='product_attribute_2']");
    By hdd = By.xpath("//input[@id='product_attribute_3_7']");
    By os = By.xpath("//input[@id='product_attribute_4_9']");
    By totalCommander = By.xpath("//label[contains(text(),'Total Commander [+$5.00]')]");
    By price = By.xpath("//span[@id='price-value-1']");
    By addToCartLink = By.xpath("//button[@id='add-to-cart-button-1']");
    By productMessage = By.xpath("//p[@class='content']");
    By closeButton = By.xpath("//span[@class='close']");


    public void selectSortFilterZToA(){
        selectByVisibleTextFromDropDown(sortFilterZToA,"Name: Z to A");
    }
    public void selectSortFilterAToZ(){
        selectByIndexFromDropDown(sortFilterAToZ,1);
    }

    public void clickOnAddToCart(){
        clickOnElement(addToCart);
    }

    public void getBuildYourComputer(){
        verifyText(verifyText1,"Build your own computer","Build your own computer is not displayed");
    }
    public void selectProcessor(){
        selectByValueFromDropDown(processor,"1");
    }
    public void selectRam(){
        selectByValueFromDropDown(ram,"5");
    }

    public void selectHDD(){
        clickOnElement(hdd);
    }
    public void selectOS(){
        clickOnElement(os);
    }
    public void clickOnTotalCommander(){
        clickOnElement(totalCommander);
    }

    public void getPriceText(){
        verifyText(price,"$1,475.00","$1,475.00 is not displayed");
    }
    public void clickOnAddToCartLink(){
        clickOnElement(addToCartLink);
    }
    public void getProductMessage(){
        verifyText(productMessage,"The product has been added to your shopping cart","Message is not displayed");
    }
    public void clickOnCloseButton(){
        clickOnElement(closeButton);
    }



}
