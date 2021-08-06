package org.jpmc.newsvalidation.stepdefinitions;

import java.util.ArrayList;
import java.util.List;

import org.jpmc.newsvalidation.common.Config;
import org.jpmc.newsvalidation.common.Driver;
import org.jpmc.newsvalidation.common.Page;
import org.jpmc.newsvalidation.pages.NewsPage;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Home_stepdefn {



	@Given("^Launch the application$")
	public void launch_The_Application() throws Throwable {
		NewsPage np = new NewsPage();
		np.launchApplication();
	}

	@Then("^navigate to \"([^\"]*)\" home page$")
	public void navigate_To_Home_Page(String pagename) throws Exception {
		NewsPage np = new NewsPage();
		np.clickYes();
	}

	@Then("^Search for the news and confirm the news is valid$")
	public void search_For_The_News_And_Confirm_The_News_IS_Valid() throws Exception{
		NewsPage np = new NewsPage();
		np.confirmNewsValid();
	}

	@Then("^I confirm the news \"([^\"]*)\" by searching in google$")
	public void i_Confirm_The_News_By_Searching_In_Google(String strval, DataTable table) throws Exception {
		NewsPage np = new NewsPage();
		np.verifyNewsMessage(strval, table.raw());

	}

}
