package org.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.jvm.JvmReport;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\Features", glue = "org.steps", 
dryRun = false, monochrome = true, strict = true, tags = "@sanity", plugin = {
		"pretty",
		"html:C:\\Users\\user\\eclipse-workspace1\\Cucumber\\Reports\\HTMLReport",
		"json:C:\\Users\\user\\eclipse-workspace1\\Cucumber\\Reports\\JSONReport.jsonreport.json",
		"junit:C:\\Users\\user\\eclipse-workspace1\\Cucumber\\Reports\\JUNITReport.junitreport.xml" })
public class TestRunnerClass {
	@AfterClass
	public static void jvm() {
		JvmReport.jvmReportGenerate(
				"C:\\Users\\user\\eclipse-workspace1\\Cucumber\\Reports\\JSONReport.jsonreport.json");

	}
}
