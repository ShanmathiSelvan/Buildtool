package com.maven1;

//import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Webtab {
@Test
public void webtabletest() {
	WebDriver driver;
	WebDriverManager.chromedriver().setup();
	driver= new ChromeDriver();
	driver.get("https://www.w3schools.com/html/html_tables.asp");
	driver.manage().window().maximize();
	//((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");
	WebElement value  =driver.findElement(By.xpath("//table[@class='ws-table-all']/tbody/tr[2]"));
	
	System.out.println("The value is "+value.getText());
	driver.close();
	//System.out.println(value.getText());
	
	
	
	
}
}
