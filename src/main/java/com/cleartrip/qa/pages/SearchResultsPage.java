package com.cleartrip.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cleartrip.qa.base.TestBase;

public class SearchResultsPage extends TestBase
{
	@FindBy(className="p-relative")
	WebElement pageTrait;
	
	public SearchResultsPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public Boolean isPageDisplayed()
	{
		return pageTrait.isDisplayed();
	}

}
