package com.qa.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlipkartPages {
	WebDriver driver;
	
	@FindBy(xpath="//button[contains(text(),'✕')]")
	WebElement closedialog;
	public WebElement closedialog() {
		return closedialog;
	}
	
	
	@FindBy(xpath="//img[@title='Flipkart']")
	WebElement flipkartlogo;
	public WebElement flipkartlogo() {
		return flipkartlogo;
	}
	
	@FindBy(xpath="//input[@name='q']")
	WebElement input;
	public WebElement input() {
		return input;
	}
	
	@FindBy(xpath="//button[@class='L0Z3Pu']")
	WebElement search;
	public WebElement search() {
		return search;
	}
	
	@FindAll(@FindBy(xpath="/html/body/div/div/div[3]/div[1]/div[2]/div/div/div/div/a/div[2]/div[1]/div[1]"))
	List<WebElement> allitems;
	public List<WebElement> allitems() {
		return allitems;
	}
	
	@FindBy(xpath="//span[@class='B_NuCI']")
	WebElement phonetitle;
	public WebElement phonetitle() {
		return phonetitle;
	}
	
	public FlipkartPages(WebDriver rDriver) {
		this.driver= rDriver;
		PageFactory.initElements(rDriver, this);
	}

}
