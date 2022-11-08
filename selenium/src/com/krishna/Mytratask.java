package com.krishna;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mytratask {
	public static WebDriver driver; 
//	public static int totalNumberofProducts;
	public static int minRate;
	
		    public static void Browser() {
		    System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace"
		    		+ "\\selenium\\driverfolder\\chromedriver.exe");
		    driver = new ChromeDriver();
			driver.get("https://www.myntra.com/");
			driver.manage().window().maximize();  
			Actions ac=new Actions(driver);
			WebElement kids = driver.findElement(By.xpath("//a[@data-group='kids']"));
			ac.contextClick(kids).build().perform();
			WebElement logout = driver.findElement(By.xpath("//a[@data-reactid='345']"));
			logout.click();
		 }
			public static void productCount() {
				
			List<WebElement> nop = driver.findElements(By.xpath("//div[@class='product-productMetaInfo']"));
			int size = nop.size();
			System.out.println("Total count of product is :"+size);
			}

			public static void minimumPriceOfallProducts()  {
			List<Integer>priceList=new ArrayList<Integer>();
			List<WebElement> allPrice=driver.findElements(By.xpath("//div[@class='product-productMetaInfo']"
					+ "//descendant::div[@class= 'product-price']/span/span//span[@class='product-discountedPrice']"));
            for (WebElement price: allPrice) {
            String priceText = price.getText().replaceAll("RS. ","");
            System.out.println(priceText);
            Integer pricevalue =Integer.parseInt(priceText);
            priceList.add(pricevalue);
            }
            minRate = Collections.min(priceList);
            System.out.println("Minimum rate :"+minRate);
            }

            public static void ProductsOfMinimumPrice()  {
            	
	        List<WebElement>productName=(List<WebElement>) driver.findElement(By.xpath("//li[@class='product-base']"
	        		+ "//descendant:span[@class='product-discountedPrice']//preceding sibiling:h3[@class='product-brand'"));
            System.out.println(productName);
          }
                public static void main(String[] args) throws InterruptedException, IOException{
            	Browser();
            	productCount();
            	minimumPriceOfallProducts();
            	ProductsOfMinimumPrice();
            }
}
		
