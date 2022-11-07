package com.mazen.step_definitions;

import com.mazen.pages.GoogleSearchPage;
import com.mazen.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class GoogleSearch_StepDefinition {

    GoogleSearchPage googleSearchPage = new GoogleSearchPage();
    @Given("User is on Google search page")
    public void user_is_on_google_search_page() {
        Driver.getDriver().get("https://www.google.com");
    }
    @When("User type apple in the google search and clicks enter")
    public void user_type_apple_in_the_google_search_and_clicks_enter() {
        googleSearchPage.searchBox.sendKeys("apple" + Keys.ENTER);
    }
    @Then("User sees apple - Google Search is in the google title")
    public void user_sees_apple_google_search_is_in_the_google_title() {
        String expectedTitle = "apple - Google Search";
        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertEquals(expectedTitle,actualTitle);

    }
    @When("User type {string} in the google search and clicks enter")
    public void user_type_in_the_google_search_and_clicks_enter(String searchKeyword) {

        googleSearchPage.searchBox.sendKeys(searchKeyword + Keys.ENTER);
    }
    @Then("User sees {string} is in the google title")
    public void user_sees_is_in_the_google_title(String expectedTitle) {


        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertEquals(expectedTitle,actualTitle);

    }

}
