package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.TopMenuPage;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.annotations.Test;

public class TopMenuTest extends BaseTest {

    TopMenuPage topMenuPage = new TopMenuPage();

    @Test
    public void verifyPageNavigation() throws InterruptedException {
        //  1.2 This method should click on the menu whatever name is passed as parameter.
        topMenuPage.selectMenu("Computer");
        Thread.sleep(1000);

        //  1.3. create the @Test method name verifyPageNavigation.use selectMenu method to
//        select the Menu and click on it and verify the page navigation.
        topMenuPage.clickOnComputer();
        Thread.sleep(1000);
        topMenuPage.getCurrentUrl();
        Thread.sleep(1000);

    }


}
