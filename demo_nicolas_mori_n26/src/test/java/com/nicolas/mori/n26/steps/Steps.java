package com.nicolas.mori.n26.steps;

import com.nicolas.mori.n26.framework.ParentScenario;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;

public class Steps extends ParentScenario {
	@Given("I start the android native calculator with this device \"(.*)?\"")
	public void accessTheAndroid(String uuid) {
		startAndroid(uuid);
	}

	@And("make the login into the app")
	public void accessToTheApp() {
		loginPage.pressClicInTheLoginButton();
		loginPage.loginIntoTheApp();
	}
	
	@And("access to the app")
	public void accessToTheHomePage() {
		homePage.clickInTheButtonGoIt();
		homePage.pressClickInTheMenuPresentation();
	}

	
}