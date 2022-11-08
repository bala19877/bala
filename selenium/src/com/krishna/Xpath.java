package com.krishna;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {
	private static final String TakeScreenShot = null;

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@onclick='alertbox()']"));
		TakesScreenshot tc = (TakesScreenshot)driver;
		File source = tc.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\User\\eclipse-workspace\\selenium\\src\\com\\krishna\\Screen.Shot//auto1.png");
	    FileUtils.copyFile(source, destination);
				
		
		
	}

}

