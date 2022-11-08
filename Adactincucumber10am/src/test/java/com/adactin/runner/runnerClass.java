package com.adactin.runner;

import org.junit.BeforeClass;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@Runwith(Cucumber.class)
@CucumberOptions (features = "src//test//java/com//adactin//feature//adactinHotel//feature",
glue = "com.adactin.Stepdefinition",
monochrome = true,
dryRun = false,
strict = true,
tags = "@SmokeTest",
plugin = {"html:Reports/Html_Report",
		"pretty",
		"json:Reports/Json_Report.json",
		"com.cucumber.listener.ExtentcucumberFormatter:Reports/Extent_Report.html"})


public class runnerClass {
	public static webDriver driver; //null
	
	@BeforeClass
	public static void setup() {
		System.setProperty("webDriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace"
	    		+ "\\selenium\\driverfolder\\chromedriver.exe");
	
    driver = new chromeDriver();
    driver.manager().window().maximize();
    
    @AfterClass
    public Static void tearDoen() {
    driver.close();
    
	}
}
