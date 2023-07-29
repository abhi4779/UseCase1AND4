package com.qa.testscripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AutomationPandaScenario extends TestBase {
	
	@Test(priority=1)
	public void verifyhometitle() throws InterruptedException, IOException
	{
		if(driver.getTitle().contains("Want to practice test automation? Try these demo sites! | Automation Panda")) 
		{
			System.out.println("Browser is in Automation Panda Home Page");
		}
		else
		{
			System.out.println("Browser is not in Automation Panda Home Page ");
			Assert.assertEquals(driver.getTitle(),"Want to practice test automation? Try these demo sites! | Automation Panda");
		}
	}
	
	@Test(priority=2)
	public void verifycontacttitle() throws InterruptedException, IOException
	{
		Ap.contact().click();
		Thread.sleep(2000);
		if(driver.getTitle().contains("Contact | Automation Panda")) 
		{
			System.out.println("Browser is in Contact Page");
		}
		else
		{
			System.out.println("Browser is not in Contact Page ");
			Assert.assertEquals(driver.getTitle(),"Contact | Automation Panda");
		}
	}
	
	@Test(priority=3)
	public void checkmessagesent() throws InterruptedException, IOException
	{
	
	   Ap.name().sendKeys("abhi");
	   Ap.email().sendKeys("abh@g.com");
	   Ap.message().sendKeys("message1");
	   
	   Ap.submit().click();
	   Thread.sleep(5000);
	   if(Ap.successmsg().getText().equalsIgnoreCase("Your message has been sent"))
	   {
		   System.out.println("Message has successfully sent");
	   }
	   else
		{
			System.out.println("Message has not successfully sent");
			Assert.assertTrue(Ap.successmsg().getText().equalsIgnoreCase("Your message has been sent"));
		}
	}
	

}
