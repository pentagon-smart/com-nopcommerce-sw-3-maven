package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class CellPhonePage extends Utility {

    By verifyCellPhone = By.xpath("//h1[contains(text(),'Cell phones')]");
    By listView = By.xpath("//a[contains(text(),'List')]");
    By productName = By.xpath("//div[@class='details']//h2[@class='product-title']//a[contains(text(),'Nokia Lumia 1020')]");

    public void getCellPhoneText(){
        verifyText(verifyCellPhone,"Cell phones","Cell phones is not displayed");
    }
    public void clickOnListVeiw(){
        clickOnElement(listView);
    }
    public void clickOnProduct(){
        clickOnElement(productName);
    }
}
