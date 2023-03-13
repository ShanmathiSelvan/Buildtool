package com.maven1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demowebtable {
	@Test
	public void testchk() {
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		
		driver.get("https://www.google.com/");
		WebElement searchBox=driver.findElement(By.xpath("//input[@name='q']"));
		searchBox.sendKeys("africa");
		searchBox.sendKeys(Keys.ENTER);
		
		
		
	}

}
