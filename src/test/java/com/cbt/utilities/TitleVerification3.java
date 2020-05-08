package com.cbt.utilities;

import org.openqa.selenium.WebDriver;

import java.util.Arrays;
import java.util.List;

public class TitleVerification3 {

    public static void main(String[] args) throws Exception {

        List<String> url = Arrays.asList("https://luluandgeorgia.com", "https://wayfair.com/", "https://walmart.com" ,
                "https://westelm.com/");


        for (String eachUrl: url){
            WebDriver driver= BrowserFactory.getDriver("chrome");

            driver.get(eachUrl);

            if(eachUrl.contains(driver.getTitle().replace(" ","").toLowerCase())){

                System.out.println("TEST PASSED !!!");
            }else{
                System.out.println("TEST FAILED !!!");
                System.out.println("url = "+eachUrl );
                System.out.println("title = "+ driver.getTitle());
            }
            driver.quit();

        }

    }



}


