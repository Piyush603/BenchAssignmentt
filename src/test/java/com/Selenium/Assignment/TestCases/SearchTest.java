package com.Selenium.Assignment.TestCases;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Selenium.Assignment.Pages.SearchPage;
import com.Selenium.Assignment.base.basepage;
import com.Selenium.Assignment.utilities.PropertiesFile;



public class SearchTest extends basepage {
	SearchPage lp;

	private static Logger logger = LogManager.getLogger(SearchTest.class);

	public SearchTest() {
		super();
	}

	@BeforeMethod
	public void Setup() throws IOException {
		setup();
		lp = new SearchPage(null);
	}

	@Test(priority = 6)
	public void Searchh() throws Exception {

		driver.findElement(SearchPage.btn_Search).sendKeys(PropertiesFile.prop.getProperty("Search"));
		driver.findElement(SearchPage.btn_Submit).click();
		Thread.sleep(2000);
		logger.info("Searched Successfully");
		Assert.assertEquals(driver.getTitle(), "GreenKart - veg and fruits kart");

	}

	@Test(priority = 7)
	public void FailedAddToCart() throws Exception {

		driver.findElement(SearchPage.btn_Search).sendKeys(PropertiesFile.prop.getProperty("Search"));
		driver.findElement(SearchPage.btn_Submit).click();
		logger.info("Searched Successfully");
		Thread.sleep(2000);
		driver.findElement(SearchPage.btn_IncreaseQuantity).click();
		driver.findElement(SearchPage.btn_AddToCart).click();
		driver.findElement(SearchPage.btn_lockCLick).click();
		logger.info("Failed to add to cart");
		driver.findElement(SearchPage.btn_FailedProceedToCheckout).click();
		Thread.sleep(2000);

	}

	@Test(priority = 8)
	public void AddToCart() throws Exception {

		driver.findElement(SearchPage.btn_Search).sendKeys(PropertiesFile.prop.getProperty("Search"));
		driver.findElement(SearchPage.btn_Submit).click();
		logger.info("Searched Successfully");
		Thread.sleep(2000);
		driver.findElement(SearchPage.btn_IncreaseQuantity).click();
		driver.findElement(SearchPage.btn_AddToCart).click();
		driver.findElement(SearchPage.btn_lockCLick).click();
		driver.findElement(SearchPage.btn_ProceedToCheckout).click();
		logger.info("Proceed to Checkout Successfully");
		Thread.sleep(2000);
		logger.info("Added To Cart");
		Assert.assertEquals(driver.getTitle(), "GreenKart - veg and fruits kart");

	}

	@Test(priority = 9)
	public void PlaceOrder() throws Exception {

		driver.findElement(SearchPage.btn_Search).sendKeys(PropertiesFile.prop.getProperty("Search"));
		driver.findElement(SearchPage.btn_Submit).click();
		logger.info("Searched Successfully");
		Thread.sleep(2000);
		driver.findElement(SearchPage.btn_IncreaseQuantity).click();
		driver.findElement(SearchPage.btn_AddToCart).click();
		driver.findElement(SearchPage.btn_lockCLick).click();
		driver.findElement(SearchPage.btn_ProceedToCheckout).click();
		logger.info("Proceed to Checkout Successfully");
		Thread.sleep(2000);
		driver.findElement(SearchPage.btn_PlaceeOrder).click();
		Thread.sleep(2000);
		driver.findElement(SearchPage.btn_Country).sendKeys(PropertiesFile.prop.getProperty("Country"));
		driver.findElement(SearchPage.Click_Box).click();
		driver.findElement(SearchPage.btn_Proceed).click();
		Thread.sleep(2000);
		logger.info("Placed Order Successfully");
		Assert.assertEquals(driver.getTitle(), "GreenKart - veg and fruits kart");

	}

	@Test(priority = 10)
	public void FailedPlaceOrder() throws Exception {

		driver.findElement(SearchPage.btn_Search).sendKeys(PropertiesFile.prop.getProperty("Search"));
		driver.findElement(SearchPage.btn_Submit).click();
		Thread.sleep(2000);
		driver.findElement(SearchPage.btn_IncreaseQuantity).click();
		driver.findElement(SearchPage.btn_AddToCart).click();
		driver.findElement(SearchPage.btn_lockCLick).click();
		driver.findElement(SearchPage.btn_ProceedToCheckout).click();
		Thread.sleep(2000);
		driver.findElement(SearchPage.btn_PlaceeOrder).click();
		Thread.sleep(2000);
		driver.findElement(SearchPage.btn_Country).sendKeys(PropertiesFile.prop.getProperty("Country"));
		driver.findElement(SearchPage.Click_Box).click();
		logger.info("Failed to place order");
		driver.findElement(SearchPage.btn_FailedProceed).click();

	}

}
