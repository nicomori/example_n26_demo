package com.nicolas.mori.n26;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

/**
 * Example of Automation. Creator: Nicolas Mori
 */

@CucumberOptions(plugin = { "html:target/cucumber-html-reports", "json:target/cucumber-html-reports/cucumber.json",
		"junit:target/surefire-reports/cucumber-junit.xml" }, features = "src/test/resources/features", tags = "@JsonAutomation", glue = {
				"com.nicolas.mori.n26.steps" })
public class AppTest extends AbstractTestNGCucumberTests {
}
