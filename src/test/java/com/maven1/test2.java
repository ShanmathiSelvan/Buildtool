package com.maven1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test2 {

	@Test
	public void click() throws InterruptedException {
		 WebDriver driver;
		 WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		WebElement search_box=driver.findElement(By.xpath("//input[@name='q']"));//input[@name='q']"));
		search_box.click();
		search_box.sendKeys("africa");
		search_box.sendKeys(Keys.ENTER);
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
}
