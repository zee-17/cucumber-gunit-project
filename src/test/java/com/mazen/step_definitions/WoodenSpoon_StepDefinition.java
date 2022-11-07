package com.mazen.step_definitions;

import com.mazen.pages.WoodenSpoonPage;
import com.mazen.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class WoodenSpoon_StepDefinition {
WoodenSpoonPage wooden = new WoodenSpoonPage();
    @Given("user in Etsy search page")
    public void user_in_etsy_search_page() {
        Driver.getDriver().get("https://www.etsy.com");
    }
    @When("User search Wooden Spoon in search box")
    public void user_search_wooden_spoon_in_search_box() {

wooden.SearchBox.sendKeys("Wooden Spoon" + Keys.ENTER);

    }
    @Then("Title should be displayed as Wooden Spoon")
    public void title_should_be_displayed_as_wooden_spoon() {

        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = "Wooden spoon - Etsy";

        Assert.assertEquals(expectedTitle,actualTitle);

    }

//    @Then("title is Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone")
//    public void titleIsEtsyShopForHandmadeVintageCustomAndUniqueGiftsForEveryone() {
//
//    }
}
