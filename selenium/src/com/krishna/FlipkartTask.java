package com.krishna;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartTask {
		public static void main(String[] args) throws InterruptedException, IOException {
		    System.setProperty("webdriver.chrome.driver", "webdriver.chrome.driver\", \"C:\\Users\\User\\eclipse-workspace\"\r\n"
		    		+ "		    		+ \"\\selenium\\driverfolder\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.myntra.com/kids?f=Categories%3ATshirts%3A%3AGender%3Aboys%2Cboys%20girls&plaEnabled=false");
			driver.manage().window().maximize();
			WebElement tshort = driver.findElement(By.xpath("//a[@class='desktop-categoryLink'][1]"));
			tshort.click();
}
}