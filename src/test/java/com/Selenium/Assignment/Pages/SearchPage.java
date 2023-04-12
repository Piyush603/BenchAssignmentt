package com.Selenium.Assignment.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchPage {
	WebDriver driver;

	public SearchPage(WebDriver driver) {
		this.driver = driver;
	}
	public static By btn_Search = By.xpath("//*[@id=\"root\"]/div/header/div/div[2]/form/input");
	public static By btn_Submit = By.xpath("//*[@id=\"root\"]/div/header/div/div[2]/form/button");
	public static By btn_IncreaseQuantity = By.xpath("//*[@id=\"root\"]/div/div[1]/div/div/div[2]/a[2]");
	public static By btn_AddToCart = By.xpath("//*[@id=\"root\"]/div/div[1]/div/div/div[3]/button");
	public static By btn_lockCLick = By.xpath("//*[@id=\"root\"]/div/header/div/div[3]/a[4]/img");
	public static By btn_ProceedToCheckout = By.xpath("//*[@id=\"root\"]/div/header/div/div[3]/div[2]/div[2]/button");
	public static By btn_FailedProceedToCheckout = By.xpath("//*[@id=\"root\"]/div/header/div/div[3]div[2]/div[2]/button");
	public static By btn_PlaceeOrder= By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/button[1]");
	public static By btn_Country= By.xpath("//*[@id=\"root\"]/div/div/div/div/div/select");
	public static By Click_Box= By.xpath("//*[@id=\"root\"]/div/div/div/div/input");
	public static By btn_Proceed= By.xpath("//*[@id=\"root\"]/div/div/div/div/button");
	public static By btn_FailedProceed= By.xpath("//*[@id=\"root\"]/div/div/divdiv/button");
	
	
	
	

}
