package org.steps;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefnition2 extends BaseClass {


	@When("user will clicks login page")
	public void user_will_clicks_login_page() {
		launchUrl("https://en-gb.facebook.com/");
		maxWindow();
		WebElement btn = driver.findElement(By.name("login"));
		buttonClick(btn);
	}

	@Then("user will navigate to invalid credentila page")
	public void user_will_navigate_to_invalid_credentila_page() {
		System.out.println("uer willredirect to invalid credential page");
	}

}
