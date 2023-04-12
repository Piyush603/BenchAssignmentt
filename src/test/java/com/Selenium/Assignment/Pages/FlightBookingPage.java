package com.Selenium.Assignment.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FlightBookingPage {
	WebDriver driver;

	public FlightBookingPage(WebDriver driver) {
		this.driver = driver;
	}
	public static By btn_FlightBooking = By.xpath("//*[@id=\"root\"]/div/header/div/div[3]/a[3]");
	public static By Box_Country = By.xpath("//*[@id=\"autosuggest\"]");
	public static By btn_Flight = By.xpath("//*[@id=\"buttons\"]/div/div/ul/li[2]/a/span[2]");
	public static By departure_city = By.xpath("//*[@id=\"ctl00_mainContent_ddl_originStation1_CTXT\"]");
	public static By arrival_city = By.xpath("//*[@id=\"ctl00_mainContent_ddl_destinationStation1_CTXT\"]");
	public static By btn_Date = By.xpath("//*[@id=\"ui-datepicker-div\"]/div[1]/table/tbody/tr[4]/td[4]/a");
	public static By btn_Submit = By.xpath("//*[@id=\"ctl00_mainContent_btn_FindFlights\"]");
	public static By btn_HolidayPackage = By.xpath("//*[@id=\"hlnkholidaypacks\"]/span[2]");



	
}
