package com.qa.testscripts;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FlipkartScenario extends TestBase {

	@Test(priority=1)
	public void verifylogo()
	{
		if(Fp.flipkartlogo().isDisplayed())
		{
			System.out.println("Flipkart Logo is present");
		}
		else
		{
			System.out.println("Flipkart Logo is not present");
			Assert.assertTrue(Fp.flipkartlogo().isDisplayed());
		}
	}
	
	@Test(priority=2)
	public void searchphone() throws InterruptedException
	{
		String phone="iPhone 14";
		Fp.input().sendKeys(phone);
		Fp.search().click();
		Thread.sleep(2000);
		
		List<WebElement> allphones = Fp.allitems();
		int all=allphones.size();
		System.out.println(all+" phones are displayed in these page");
		
		allphones.get(0).click();
		
		for(String b : driver.getWindowHandles())
			driver.switchTo().window(b); 
		
		Thread.sleep(3000);		
		if(driver.getTitle().contains(phone))  //checks if browser landed on find a store page
		{
			System.out.println("Title is displayed with Phone Name");
			
		}
		else
		{
			System.out.println("Title is not displayed with Phone");
			Assert.assertTrue(driver.getTitle().contains(Fp.phonetitle().getText()));
		}
		
	}
}
