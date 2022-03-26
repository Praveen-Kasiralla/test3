package stepDefinition;

import java.io.IOException;

import cucumber.api.java.en.Then;
import utility.BaseClass;

public class AboutUsSections extends BaseClass{

	@Then("click on contatc us and twitter in about us page")
	public void click_on_contatc_us_and_twitter_in_about_us_page() throws IOException, InterruptedException {
		exReport.createNewTestReport("Open Twitter");
		aboutUs.clickContatcUs();
		aboutUs.openTwitter();
	}
}
