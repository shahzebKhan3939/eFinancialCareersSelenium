package tests;


import driver.WebDriver;

import static driver.WebDriver.getWebDriver;

public class FirstTest {

    public static void main(String[] args) {
        WebDriver.initialize();


        getWebDriver().get("https://www.google.com");


        WebDriver.stop();

    }

}