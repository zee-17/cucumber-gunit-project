package com.mazen.step_definitions;

import com.mazen.pages.WebtableAppPage;
import com.mazen.utilities.ConfigurationReader;
import com.mazen.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class WebtableApp_StepDef {
    WebtableAppPage webtableAppPage = new WebtableAppPage();
    @Given("user is on the login page of web table app")
    public void user_is_on_the_login_page_of_web_table_app() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
    }
    @When("user enters username {string}")
    public void user_enters_username(String string) {
        webtableAppPage.inputUsername.sendKeys(string);
    }
    @When("uesr click to login button")
    public void uesr_click_to_login_button() {
webtableAppPage.loginButton.click();
    }
    @Then("user should see url contains orders")
    public void user_should_see_url_contains_orders() {
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("orders"));

    }

    @And("user enters password {string}")
    public void userEntersPassword(String arg0) {
        webtableAppPage.inputPassword.sendKeys(arg0);
    }
}
