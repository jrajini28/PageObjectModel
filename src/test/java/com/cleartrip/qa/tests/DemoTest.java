package com.cleartrip.qa.tests;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.cleartrip.qa.base.TestBase;
import com.cleartrip.qa.pages.SearchFlightsPage;
import com.cleartrip.qa.pages.SearchResultsPage;

public class DemoTest extends TestBase 
{
	SearchFlightsPage launchPage;
	SearchResultsPage resultsPage;
	
	public DemoTest(){
		super();
	}
	
	@BeforeMethod
	public void setUp(){
		initialization();
		launchPage = new SearchFlightsPage();	
	}
	
	@Test
	public void SampleTestCase()
	{
		//launchPage.SelectOneWay();
		launchPage.SelectFromCity("");
		launchPage.SelectToCity("");
		Calendar c = Calendar.getInstance();
        c.add(Calendar.DATE, 1);
        String date = new SimpleDateFormat("dd/MM/yyyy").format(c.getTime());
		launchPage.SelectDepatureDate(date);
		launchPage.ClickOnSearchFlights();
		
		resultsPage = new SearchResultsPage();
		Assert.assertTrue(resultsPage.isPageDisplayed(), "");
		
	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	
	

} 
