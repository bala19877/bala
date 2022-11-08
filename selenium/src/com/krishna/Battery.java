package com.krishna;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Battery {
	
	public static void main(String[] args) throws InterruptedException
 {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.navigate().to("https://www.flipkart.com/");
		driver.navigate().to("https://www.amazon.com/");
		driver.navigate().back();
		
		String title = driver.getTitle();
		System.out.println(title);
		String url=driver.getCurrentUrl();
		System.out.println(url);
		driver.navigate().forward();
		
		String title1 = driver.getTitle();
		System.out.println(title1);
		Thread.sleep(4000);
		driver.navigate().to("https://www.instagram.com/");
		
		String title2 = driver.getTitle();
		System.out.println(title2);
		driver.navigate().back();
		driver.navigate().back();
		driver.navigate().back();
		driver.navigate().back();
		driver.navigate().back();
//		driver.navigate().to("https://www.facebook.com/");
		driver.close();
	
	}

}
