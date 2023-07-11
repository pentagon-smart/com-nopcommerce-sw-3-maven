package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;
import org.testng.Assert;

public class TopMenuPage extends Utility {

    By computerMenu = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Computers']");
    By desktop = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Desktops']");

    By electronic = By.xpath("//ul[@class='top-menu notmobile']//a[@href='/electronics']");
    By cellPhones = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Cell phones']");

    By productArrange = By.xpath("//option[contains(text(),'Name: Z to A')]");
    By cellPhone = By.xpath("//h1[contains(text(),'Cell phones')]");

    public void selectMenu(String menu){

    }
    public void clickOnComputer(){
        clickOnElement(computerMenu);
    }

    public void mouseHoverAndClickOnDesktopMenu(){
        mouseHoverTwo(computerMenu,desktop);
    }
    public void mouseHoverAndClickCellPhone(){
        mouseHoverTwo(electronic,cellPhones);
    }
    public void getCurrentUrl(){
        String expectedPage = "https://demo.nopcommerce.com/computers";
        String actualPage = driver.getCurrentUrl();
        Assert.assertEquals(actualPage,expectedPage,"Page is not displayed");

    }
    public void getProductArrange(){
        String expectedPage = "Name: Z to A";
        String actualPage = getTextFromElement(productArrange);
        Assert.assertEquals(actualPage,expectedPage,"Product is not displayed");

    }
    public void getProductCellPhone(){
        String expectedPage = "Cell phones";
        String actualPage = getTextFromElement(cellPhone);
        Assert.assertEquals(actualPage,expectedPage,"Product is not displayed");

    }


}
