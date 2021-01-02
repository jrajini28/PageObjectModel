package com.cleartrip.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cleartrip.qa.base.TestBase;

public class SearchFlightsPage extends TestBase
{
	
	@FindBy(id="OneWay")
	WebElement oneWayRadioButton;
	
	@FindBy(id="FromTag")
	WebElement fromCityTextBox;
	
	@FindBy(id="ToTag")
	WebElement toCityTextBox;
	
	@FindBy(id="DepartDate")
	WebElement depatureDate;
	
	@FindBy(id="SearchBtn")
	WebElement searchButton;
	
	@FindBy(className ="subTitle")
	WebElement clickelement;
	
	
	
	
	public SearchFlightsPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String GetPageTitle()
	{
		return driver.getTitle();
	}
	
	public void SelectOneWay()
	{
		oneWayRadioButton.click();
	}

	public void SelectFromCity(String fromCity)
	{
		fromCityTextBox.clear();
		fromCityTextBox.sendKeys("Bangalore");
	}
	
	public void SelectToCity(String toCity)
	{
		toCityTextBox.clear();
		toCityTextBox.sendKeys("Delhi");
	}
	
	public void SelectDepatureDate(String departDate)
	{
		depatureDate.clear();
		depatureDate.sendKeys(departDate);
		clickelement.click();
		
	}
	
	public void ClickOnSearchFlights()
	{
		searchButton.click();
	}
}
