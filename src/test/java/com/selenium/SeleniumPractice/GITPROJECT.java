package com.selenium.SeleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GITPROJECT {

    public static void main(String[] args)throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/");
        
        
        
        Thread.sleep(3000);

        System.out.println(driver.getTitle());

        driver.quit();
    }
}