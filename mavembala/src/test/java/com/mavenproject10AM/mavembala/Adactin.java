package com.mavenproject10AM.mavembala;


import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.ScreenshotException;
import org.openqa.selenium.remote.*;
import org.openqa.selenium.support.ui.Select;

public class Adactin{
	static WebDriver driver;
	public static void browser_Launch() {
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://adactin.com/HotelApp/Register.php");
	driver.manage().window().maximize();
	}
	public static void Registration() throws InterruptedException
	{
	WebElement username= driver.findElement(By.id("username"));
	username.sendKeys("Ammuthaya");
	WebElement password=driver.findElement(By.id("password"));
	password.sendKeys("Ammu@123");
	WebElement confirm_password=driver.findElement(By.id("re_password"));
	confirm_password.sendKeys("Ammu@123");
	WebElement fullname=driver.findElement(By.id("full_name"));
	fullname.sendKeys("Amudha J");
	WebElement email=driver.findElement(By.id("email_add"));
	email.sendKeys("ammujayaraman6@gmail.com");
	Thread.sleep(10000);
	WebElement terms=driver.findElement(By.id("tnc_box"));
	terms.click();
	WebElement register=driver.findElement(By.id("Submit"));
	register.click();
	}
	public static void login()
	{
	driver.get("https://adactinhotelapp.com/");
	driver.manage().window().maximize();
	WebElement username_login= driver.findElement(By.id("username"));
	username_login.sendKeys("Ammuthaya");
	WebElement password_login=driver.findElement(By.id("password"));
	password_login.sendKeys("Ammu@123");
	WebElement login=driver.findElement(By.id("login"));
	login.click();
	}
	public static void search_hotel()
	{
		WebElement location=driver.findElement(By.id("location"));
		Select s=new Select(location);
		s.selectByIndex(3);
		WebElement hotels=driver.findElement(By.id("hotels"));
		Select s1=new Select(hotels);
		s1.selectByVisibleText("Hotel Sunshine");
		WebElement room_type =driver.findElement(By.id("room_type"));
		Select s2=new Select(room_type);
		s2.selectByIndex(2);
		WebElement room_nos=driver.findElement(By.id("room_nos"));
		Select s3=new Select(room_nos);
		s3.selectByIndex(3);
		WebElement date_in =driver.findElement(By.id("datepick_in"));
		date_in.clear();
		date_in.sendKeys("12/12/2022");
		WebElement date_out =driver.findElement(By.id("datepick_out"));
		date_out.clear();
		date_out.sendKeys("15/12/2022");
		WebElement adult=driver.findElement(By.id("adult_room"));
		Select s4=new Select(adult);
		s4.selectByIndex(2);
		WebElement children=driver.findElement(By.id("child_room"));
		Select s5=new Select(children);
		s5.selectByIndex(1);
		WebElement search=driver.findElement(By.id("Submit"));
		search.click();	
	}
	public static void confirm_hotel()
	{
		WebElement confirm=driver.findElement(By.id("radiobutton_0"));
		confirm.click();
		WebElement ok=driver.findElement(By.id("continue"));
		ok.click();
	}
	public static void book_hotel()
	{
	WebElement first_name=driver.findElement(By.id("first_name"));
	first_name.sendKeys("Amudha");
	WebElement last_name=driver.findElement(By.id("last_name"));
	last_name.sendKeys("J");
	WebElement address=driver.findElement(By.id("address"));
	address.sendKeys("Chennai");
	WebElement card_no=driver.findElement(By.id("cc_num"));
	card_no.sendKeys("1234567890123456");
	WebElement cc_type=driver.findElement(By.id("cc_type"));
	Select s6=new Select(cc_type);
	s6.selectByIndex(2);
	WebElement cc_expmonth=driver.findElement(By.id("cc_exp_month"));
	Select s7=new Select(cc_expmonth);
	s7.selectByIndex(4);
	WebElement cc_expyear=driver.findElement(By.id("cc_exp_year"));
	Select s8=new Select(cc_expyear);
	s8.selectByIndex(6);
	WebElement cc_cvv=driver.findElement(By.id("cc_cvv"));
	cc_cvv.sendKeys("09876");
	WebElement book_now=driver.findElement(By.id("book_now"));
	book_now.click();	
	}
	public static void screenshot() throws IOException,InterruptedException
	{
		Thread.sleep(5000);
		TakesScreenshot s=(TakesScreenshot)driver;
		File source=s.getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Users\\amudh\\eclipse-workspace\\Selenium\\snap\\Adactin.png");
		FileUtils.copyFile(source,dest);
	}
	public static void main(String[] args) throws InterruptedException, IOException {
	browser_Launch();
	//Registration();
	login();
	search_hotel();
	confirm_hotel();
	book_hotel();
	screenshot();
	
}
}


