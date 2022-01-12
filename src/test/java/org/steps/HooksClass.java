package org.steps;

import org.base.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HooksClass extends BaseClass {
	@Before
	public static void openBrowser() {
		chromeBrowser();
	}

	@After
	public static void closeBrowser() {
		driver.quit();
	}
}
