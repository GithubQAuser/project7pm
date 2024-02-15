package com.alerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertss {

	public static void main(String[] args) {
		
		
System.setProperty("webdriver.chrome.driver","E:\\SeleniumDec23batch\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
	/*	driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
	
		driver.manage().window().maximize();
		
		
		driver.switchTo().frame("iframeResult");
		
		driver.findElement(By.xpath("/html/body/button")).click();
	
		driver.switchTo().alert().dismiss();
		
		
		String text =driver.findElement(By.xpath("//*[@id=\"demo\"]")).getText();
		
		System.out.println(text);*/
		
		
		// TODO Auto-generated method stub
		
		
		
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
	
		driver.manage().window().maximize();
	
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("/html/body/button")).click();
		
		driver.switchTo().alert().sendKeys("welcome");
		
		driver.switchTo().alert().accept();
		
        String text =driver.findElement(By.xpath("//*[@id=\"demo\"]")).getText();
		
		System.out.println(text);
		
		

	}

}
