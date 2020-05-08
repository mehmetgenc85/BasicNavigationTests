package com.cbt.utilities;

import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TitleVerification {

    public static void main(String[] args) throws Exception {

        List<String> urls = Arrays.asList("http://practice.cybertekschool.com/",
                "http://practice.cybertekschool.com/dropdown",
                "http://practice.cybertekschool.com/login");

        WebDriver driver=BrowserFactory.getDriver("chrome");

        List<String> titles = new ArrayList<>();
        List<Boolean> urlStartWith = new ArrayList<>();

        for (String url:urls){

            driver.get(url);

            titles.add(driver.getTitle());

        }

        for (int i = 0; i <titles.size()-1 ; i++) {
            StringUtility.verifyEquals(titles.get(i),titles.get(i+1));

        }
        StringUtility.verifyEquals(titles.get(0),titles.get(2));


        driver.quit();

        System.out.println("ALL URL`s start with \"http://practice.cybertekschool.com\" = " + urlStartWith);


    }
}
