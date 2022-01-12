package org.steps;

import java.util.List;
import java.util.Map;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefnition3 extends BaseClass {
	@Given("user need to be in amazon page")
	public void user_need_to_be_in_amazon_page() {

	}

	@When("user will enter product name in search box")
	public void user_will_enter_product_name_in_search_box(io.cucumber.datatable.DataTable d) {
		launchUrl("https://www.amazon.in/");
		maxWindow();
		List<Map<String, String>> m = d.asMaps();
		WebElement searchbox = driver.findElement(By.id("twotabsearchtextbox"));
		fillTextBox(searchbox, m.get(1).get("product"));

	}

	@When("use clicks search button")
	public void use_clicks_search_button() {
		WebElement btn = driver.findElement(By.xpath("//input[@type='submit']"));
		buttonClick(btn);
	}

	@Then("user will redirect tp product page")
	public void user_will_redirect_tp_product_page() {
		System.out.println("user is in products page");
	}

}
