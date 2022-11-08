package com.mavenproject10AM.mavembala;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@SuppressWarnings("unused")
public class Flipkart {
//	public static class Hotel {
		public static void main(String[] args) throws InterruptedException, IOException {
		    System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.flipkart.com/");
			driver.manage().window().maximize();
	
//		static WebDriver driver;
//		public static void browser_Launch() {
//		
//		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");
//		driver=new ChromeDriver();
////		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
//		driver.get("https://www.flipkart.com/");
//		driver.manage().window().maximize();

}
}