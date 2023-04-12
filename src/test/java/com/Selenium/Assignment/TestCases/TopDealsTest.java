package com.Selenium.Assignment.TestCases;

import java.io.IOException;
import java.util.ArrayList;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Selenium.Assignment.Pages.TopDealsPage;
import com.Selenium.Assignment.base.basepage;




public class TopDealsTest extends basepage {
	TopDealsPage lp;
	private static Logger logger = LogManager.getLogger(TopDealsTest.class);

	public TopDealsTest() {
		super();
	}

	@BeforeMethod
	public void Setup() throws IOException {
		setup();
		lp = new TopDealsPage(null);
	}

	@Test(priority = 1)
	public void TopDealss() throws Exception {

		driver.findElement(TopDealsPage.btn_topdeals).click();
		ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs2.get(1));
		Thread.sleep(2000);
		driver.close();
		driver.switchTo().window(tabs2.get(0));
		Thread.sleep(2000);
		logger.info("Successfully Opened Top Deals Page");
		Assert.assertEquals(driver.getTitle(), "GreenKart - veg and fruits kart");
		logger.info("Assertion passed Successfully");
	}
}
