package com.base;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	public static WebDriver driver;

	public void launchTheWeb() {
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		Properties prop=new Properties();
		
		driver.get(prop.getProperty("weburl"));
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("pooja");
	}

}
