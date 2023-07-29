package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AutomationpandaPages {
	WebDriver driver;

	@FindBy(xpath="//a[contains(text(),'Contact')]")
	WebElement contact;
	public WebElement contact() {
		return contact;
	}
	
	@FindBy(id="g3-name")
	WebElement name;
	public WebElement name() {
		return name;
	}
	
	@FindBy(id="g3-email")
	WebElement email;
	public WebElement email() {
		return email;
	}
	
	@FindBy(id="contact-form-comment-g3-message")
	WebElement message;
	public WebElement message() {
		return message;
	}
	
	@FindBy(xpath="//strong[contains(text(),'Contact Me')]")
	WebElement submit;
	public WebElement submit() {
		return submit;
	}
	@FindBy(id="contact-form-success-header")
	WebElement successmsg;
	public WebElement successmsg() {
		return successmsg;
	}	
	
	
	public AutomationpandaPages(WebDriver rDriver) {
		this.driver= rDriver;
		PageFactory.initElements(rDriver, this);
	}

}
