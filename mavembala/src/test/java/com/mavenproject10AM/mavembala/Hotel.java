package com.mavenproject10AM.mavembala;



	import java.io.File;
	import java.io.IOException;

	import org.apache.commons.io.FileUtils;
	import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.Select;

	public class Hotel {
		public static void main(String[] args) throws InterruptedException, IOException {
		    System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://adactinhotelapp.com//");
			driver.manage().window().maximize();
			WebElement user = driver.findElement(By.name("username"));
			user.sendKeys("balamadhu");
			WebElement pass = driver.findElement(By.name("password"));
			pass.sendKeys("bala1987");
			Thread.sleep(5000);
			TakesScreenshot tc = (TakesScreenshot)driver;
			File source = tc.getScreenshotAs(OutputType.FILE);
			File destination = new File("C:\\Users\\User\\eclipse-workspace\\selenium\\src\\com\\krishna\\Screen.Shot//auto2.png");
		    FileUtils.copyFile(source, destination);
			WebElement log = driver.findElement(By.id("login"));
			log.click();
//			WebElement single = driver.findElement(By.xpath("//select[@name='location']//select"));
			WebElement single = driver.findElement(By.name("location"));
			Select ff = new Select(single);
			ff.selectByVisibleText("London");
			WebElement hotel = driver.findElement(By.name("hotels"));
			Select fe = new Select(hotel);
//			hotel hh = new hotel(single);
			fe.selectByVisibleText("Hotel Hervey");
//			hh.selectByVisibleText("HotelHervey");
			WebElement Room = driver.findElement(By.name("room_type"));
			Select fh= new Select(Room);
			fh.selectByVisibleText("Super Deluxe");
			WebElement No = driver.findElement(By.name("room_nos"));
			Select fk= new Select(No);
			fk.selectByVisibleText("6 - Six");
			WebElement datein = driver.findElement(By.name("datepick_in"));
//			Select fl= new Select(datein);
			datein.clear();
			datein.sendKeys("28/09/2022");
			WebElement dateout = driver.findElement(By.name("datepick_out"));
//			Select fl= new Select(datein);
			dateout.clear();
			dateout.sendKeys("29/09/2022");
			
			WebElement adults = driver.findElement(By.name("adult_room"));
			Select fj= new Select(adults);
			fj.selectByVisibleText("3 - Three");
			WebElement child = driver.findElement(By.name("child_room"));
			Select fs= new Select(child);
			fs.selectByVisibleText("4 - Four");
			
			Thread.sleep(000);
			TakesScreenshot td = (TakesScreenshot)driver;
			File source1 = td.getScreenshotAs(OutputType.FILE);
			File destination1 = new File("C:\\Users\\User\\eclipse-workspace\\selenium\\src\\com\\krishna\\Screen.Shot//auto33.png");
		    FileUtils.copyFile(source1, destination1);
		    
			WebElement submit = driver.findElement(By.id("Submit"));
			submit.click();
			WebElement radio = driver.findElement(By.id("radiobutton_0"));
			radio.click();
			
			Thread.sleep(0000);
			TakesScreenshot te = (TakesScreenshot)driver;
			File source2 = te.getScreenshotAs(OutputType.FILE);
			File destination2 = new File("C:\\Users\\User\\eclipse-workspace\\selenium\\src\\com\\krishna\\Screen.Shot//auto34.png");
		    FileUtils.copyFile(source2, destination2);
			
			
			
			WebElement Continue = driver.findElement(By.name("continue"));
			Continue.click();
			WebElement fname = driver.findElement(By.name("first_name"));
			fname.sendKeys("kkkk");
			WebElement sname = driver.findElement(By.name("last_name"));
			sname.sendKeys("b");
			WebElement address = driver.findElement(By.name("address"));
			address.sendKeys("maa st nathan nagar");
			WebElement cardno = driver.findElement(By.name("cc_num"));
			cardno.sendKeys("1234567891234567");
			WebElement cardtype = driver.findElement(By.name("cc_type"));
			Select fa= new Select(cardtype);
			fa.selectByVisibleText("Master Card");
			WebElement Exmonth = driver.findElement(By.name("cc_exp_month"));
			Select fb= new Select(Exmonth);
			fb.selectByVisibleText("May");
			WebElement Exyear = driver.findElement(By.name("cc_exp_year"));
			Select fc= new Select(Exyear);
			fc.selectByVisibleText("2022");
			WebElement cvv = driver.findElement(By.name("cc_cvv"));
			cvv.sendKeys("123");
			
			Thread.sleep(0000);
			TakesScreenshot tf = (TakesScreenshot)driver;
			File source3 = tf.getScreenshotAs(OutputType.FILE);
			File destination3 = new File("C:\\Users\\User\\eclipse-workspace\\selenium\\src\\com\\krishna\\Screen.Shot//auto34.png");
		    FileUtils.copyFile(source3, destination3);
			
			WebElement book = driver.findElement(By.name("book_now"));
			book.click();
			
			Thread.sleep(3000);
			
//			WebElement findElement = driver.findElement(By.xpath("(//input[@type='button'])[1]"));
//			JavascriptExecutor js= (JavascriptExecutor) driver;
//			js.executeScript("arguments[0].click();", findElement);
//			js.executeScript("arguments[0].scrollIntoView();", findElement);
			

//			WebElement a = driver.findElement(By.id("my_itinerary"));
//			JavascriptExecutor js = (JavascriptExecutor)driver;
//			js.executeScript("arguments[0].scrollIntoView();",a);
			//js.executeScript("window.scrollBy(0, 1000)");
			
			//WebElement my = driver.findElement(By.name("my_itinerary"));
			//my_itinerary.click();
			
//			Thread.sleep(0000);
//			TakesScreenshot tg = (TakesScreenshot)driver;
//			File source4 = tg.getScreenshotAs(OutputType.FILE);
//			File destination4 = new File("C:\\Users\\User\\eclipse-workspace\\selenium\\src\\com\\krishna\\Screen.Shot//auto34.png");
//		    FileUtils.copyFile(source4, destination4);
//			
//			WebElement logo = driver.findElement(By.name("logout"));
//			logo.click();
		
			WebElement logout = driver.findElement(By.xpath("a//[text()='Logout']"));
			logout.click();

			
			
			
		}
	}

