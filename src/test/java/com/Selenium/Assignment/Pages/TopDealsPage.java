package com.Selenium.Assignment.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TopDealsPage {
	WebDriver driver;

	public TopDealsPage(WebDriver driver) {
		this.driver = driver;
	}
	public static By btn_topdeals = By.xpath("//*[@id=\"root\"]/div/header/div/div[3]/a[2]");
}
