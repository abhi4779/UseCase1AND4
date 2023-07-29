package com.qa.testscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import com.qa.pages.AutomationpandaPages;
import com.qa.pages.FlipkartPages;

import io.github.bonigarcia.wdm.WebDriverManager;


public class TestBase {
	WebDriver driver;
	AutomationpandaPages Ap;
	FlipkartPages Fp;
	@Parameters({"Url"})
	
	@BeforeClass
	public void setUp(String Url) throws InterruptedException, IOException
	{
		
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	 Ap = new AutomationpandaPages(driver);
	 Fp = new FlipkartPages(driver);
	 driver.manage().window().maximize();
	 driver.get(Url);
	 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	 
	 if(Url.equalsIgnoreCase("https://www.flipkart.com/"))
	 {
		 Fp.closedialog().click();
	 }
	}
	
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}
}
