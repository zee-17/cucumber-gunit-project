package com.mazen.step_definitions;

import com.mazen.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class EstyTitle_StepDefinition {
    @Given("User is on www.etsy.com")
    public void user_is_on_www_etsy_com() {
Driver.getDriver().get("https://www.etsy.com");
    }
    @When("user navigate to www.etsy.com")
    public void user_navigate_to_www_etsy_com() {

    }


    @Then("Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone")
    public void etsyShopForHandmadeVintageCustomAndUniqueGiftsForEveryone() {
        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = "Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone";
        Assert.assertEquals(expectedTitle,actualTitle);
    }
}
