package com.krishna;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Battery2 {
	public static void main(String[] args) {
		
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	
}
}
