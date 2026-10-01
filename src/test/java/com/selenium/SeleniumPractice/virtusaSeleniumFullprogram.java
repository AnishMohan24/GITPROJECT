package com.selenium.SeleniumPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class virtusaSeleniumFullprogram {

	public static void main(String[] args) {
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/login?utm_source=chatgpt.com");
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username")));
		driver.findElement(By.id("username")).sendKeys("tomsmith");
		driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
	String message=driver.findElement(By.id("flash")).getText();
	
	if(message.contains("\"You logged into a secure area!\""))
	
	System.out.println("Login successful");
	
	else {

		System.out.println("Login Failed");}
	
		
		
		

	}
	
		
		

	}


