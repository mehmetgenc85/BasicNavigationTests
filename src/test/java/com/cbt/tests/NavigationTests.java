package com.cbt.tests;

import com.cbt.utilities.BrowserFactory;
import com.cbt.utilities.StringUtility;
import org.openqa.selenium.WebDriver;

public class NavigationTests {


    public static void main(String[] args) throws Exception {

        chromeTest();
        firefoxTest();
        safari();

    }

    public static void chromeTest() throws Exception {

        WebDriver driver = BrowserFactory.getDriver("chrome");

        driver.get("https://google.com");
        String title = driver.getTitle();

        driver.get("https://etsy.com");
        String title2 = driver.getTitle();

        Thread.sleep(2000);
        driver.navigate().back();

        String title3 = driver.getTitle();
        StringUtility.verifyEquals(title, title3);

        Thread.sleep(2000);

        driver.navigate().forward();
        String title4 = driver.getTitle();

        StringUtility.verifyEquals(title2, title4);

        Thread.sleep(2000);
        driver.quit();
    }











    public static void firefoxTest() throws Exception {

        WebDriver driver = BrowserFactory.getDriver("firefox");

        driver.get("https://google.com");
        String title = driver.getTitle();

        driver.get("https://etsy.com");
        String title2 = driver.getTitle();

        Thread.sleep(2000);
        driver.navigate().back();

        String title3 = driver.getTitle();
        StringUtility.verifyEquals(title, title3);

        Thread.sleep(2000);

        driver.navigate().forward();
        String title4 = driver.getTitle();

        StringUtility.verifyEquals(title2, title4);

        Thread.sleep(2000);
        driver.quit();

    }


    public static void safari() throws Exception {

        WebDriver driver = BrowserFactory.getDriver("safari");

        driver.get("https://google.com");
        String title = driver.getTitle();

        driver.get("https://etsy.com");
        String title2 = driver.getTitle();

        Thread.sleep(2000);
        driver.navigate().back();

        String title3 = driver.getTitle();
        StringUtility.verifyEquals(title, title3);

        Thread.sleep(2000);

        driver.navigate().forward();
        String title4 = driver.getTitle();

        StringUtility.verifyEquals(title2, title4);

        Thread.sleep(2000);
        driver.quit();


    }
}