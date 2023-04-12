package com.Selenium.Assignment.TestCases;

import java.io.IOException;
import java.util.ArrayList;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Selenium.Assignment.Pages.FlightBookingPage;
import com.Selenium.Assignment.base.basepage;
import com.Selenium.Assignment.utilities.PropertiesFile;


public class FlightBookingTest extends basepage{
	FlightBookingPage lp;
	private static Logger logger = LogManager.getLogger(FlightBookingTest.class);

	public FlightBookingTest() {
		super();
	}

	@BeforeMethod
	public void Setup() throws IOException {
		setup();
		lp = new FlightBookingPage(null);
	}
	@Test(priority = 2)
	public void FLightBookings() throws Exception {

		driver.findElement(FlightBookingPage.btn_FlightBooking).click();
		logger.info("Successfully Opened Flight Booking Page");
		ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs2.get(1));
		Thread.sleep(2000);
		Assert.assertEquals(driver.getTitle(), "QAClickJet - Flight Booking for Domestic and International, Cheap Air Tickets");
		logger.info("Assertion passed Successfully");
		driver.close();
		driver.switchTo().window(tabs2.get(0));
		
		
	}
	@Test(priority = 3)
	public void FLightBookings1() throws Exception {
		
		driver.findElement(FlightBookingPage.btn_FlightBooking).click();
		logger.info("Successfully Opened Flight Booking Page");
		Thread.sleep(3000);
		ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs2.get(1));
		Thread.sleep(2000);
		driver.findElement(FlightBookingPage.Box_Country).sendKeys(PropertiesFile.prop.getProperty("Country"));
		driver.findElement(FlightBookingPage.departure_city).sendKeys(PropertiesFile.prop.getProperty("Departure_City"));;
		Thread.sleep(2000);
		driver.findElement(FlightBookingPage.arrival_city).sendKeys(PropertiesFile.prop.getProperty("Arrival_City"));
		driver.findElement(FlightBookingPage.btn_Date).click();
		driver.findElement(FlightBookingPage.btn_Submit).click();
		logger.info("Searched Successfully");
		//Thread.sleep(2000);
		Assert.assertEquals(driver.getTitle(), "QAClickJet - Flight Booking for Domestic and International, Cheap Air Tickets");
		logger.info("Assertion passed Successfully");
		driver.close();
		driver.switchTo().window(tabs2.get(0));
		

	}
	@Test(priority = 4)
	public void Hotels() throws Exception {
		driver.findElement(FlightBookingPage.btn_FlightBooking).click();
		logger.info("Successfully Opened Flight Booking Page");
		Thread.sleep(3000);
		ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs2.get(1));
		Thread.sleep(2000);
		driver.findElement(FlightBookingPage.Box_Country).sendKeys(PropertiesFile.prop.getProperty("Country"));
		driver.findElement(FlightBookingPage.btn_Flight).click();
		Thread.sleep(3000);
		Assert.assertEquals(driver.getTitle(), "QAClickJet - Flight Booking for Domestic and International, Cheap Air Tickets");
		logger.info("Assertion passed Successfully");
		driver.close();
		driver.switchTo().window(tabs2.get(0));
		
	}
	
	@Test(priority = 5)
	public void HolidayPackage() throws Exception {
		driver.findElement(FlightBookingPage.btn_FlightBooking).click();
		logger.info("Successfully Opened Flight Booking Page");
		Thread.sleep(3000);
		ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs2.get(1));
		Thread.sleep(2000);
		driver.findElement(FlightBookingPage.Box_Country).sendKeys(PropertiesFile.prop.getProperty("Country"));
		driver.findElement(FlightBookingPage.btn_HolidayPackage).click();
		Thread.sleep(3000);
		Assert.assertEquals(driver.getTitle(), "QAClickJet - Flight Booking for Domestic and International, Cheap Air Tickets");
		logger.info("Assertion passed Successfully");
		driver.close();
		driver.switchTo().window(tabs2.get(0));
		
	}
	
	

}
