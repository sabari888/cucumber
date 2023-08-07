package org.stepdefinition;



import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class sample  extends BaseClass{

	@Given("Launch edgeBrowser")
	public void launch_edgeBrowser() {
	    launchTheBrowser();
	    windowMax();
	}

	@When("Launch valid MYNTRA website url")
	public void launch_valid_url() {
	    launchUrl("https://www.myntra.com");
	}
	

	@When("sertch T-Shirt")
	public void sertch_T_Shirt() {
		WebElement ser = driver.findElement(By.xpath("//input[@class='desktop-searchBar']"));
		ser.sendKeys("T-Shirt");
		WebElement sa = driver.findElement(By.xpath("//span[@class='myntraweb-sprite desktop-iconSearch sprites-search']"));
		sa.click();
		WebElement m = driver.findElement(By.xpath("(//img[@class='img-responsive'])[1]"));
		m.click();
	}

	@When("window handling")
	public void window_handling() {
		String er = driver.getWindowHandle();
		Set<String> re = driver.getWindowHandles();
		for(String wind:re) {
			if(wind!=er) {
				driver.switchTo().window(wind);
			}}	}

	@When("select the M")
	public void select_the_M() {
		WebElement sd = driver.findElement(By.xpath("(//p[@class='size-buttons-unified-size'])[2]"));
		sd.click();
	}

	@When("Add To Bag")
	public void add_To_Bag() {
		WebElement aw = driver.findElement(By.xpath("//div[text()='ADD TO BAG']"));
		aw.click();
	}

	@When("click the bag icon")
	public void click_the_bag_icon() {
	    WebElement bag = driver.findElement(By.xpath("(//span[@class='desktop-userTitle'])[3]"));
	    bag.click();
	}
	
@Then("Clous browser")
public void clous_browser() {
   driver.quit();
}}
