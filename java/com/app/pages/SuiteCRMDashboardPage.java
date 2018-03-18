package com.app.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.app.utilities.Driver;

public class SuiteCRMDashboardPage {
	
	private WebDriver driver;
	
	public SuiteCRMDashboardPage(){
		this.driver = Driver.getDriver();
		PageFactory.initElements(driver, this);
	}
	@FindBy(linkText="SALES")
	public WebElement sales;
	
	@FindBy(linkText="MARKETING")
	public WebElement marketing;
	
	@FindBy(linkText="SUPPORT")
	public WebElement support;
	
	@FindBy(linkText="ACTIVITIES")
	public WebElement activities;
	
	@FindBy(linkText="COLLABORATION")
	public WebElement collaboration;
	
	@FindBy(linkText="ALL")
	public WebElement all;

}
