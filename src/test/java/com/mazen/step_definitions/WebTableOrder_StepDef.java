package com.mazen.step_definitions;

import com.mazen.pages.ViewAllOrdersPage;
import com.mazen.pages.WebTableOrderPage;
import com.mazen.pages.WebtableAppPage;
import com.mazen.utilities.BrowserUtils;
import com.mazen.utilities.ConfigurationReader;
import com.mazen.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class WebTableOrder_StepDef {
    Select select;
    WebtableAppPage webtableAppPage = new WebtableAppPage();
    WebTableOrderPage webTableOrderPage = new WebTableOrderPage();
    ViewAllOrdersPage viewAllOrdersPage = new ViewAllOrdersPage();
    @Given("User is logged into the web page")
    public void user_is_logged_into_the_web_page() {
    Driver.getDriver().get(ConfigurationReader.getProperty("env"));
    webtableAppPage.login(ConfigurationReader.getProperty("username"),ConfigurationReader.getProperty("password"));
    webTableOrderPage.orderButton.click();

    }
    @When("user selects product type {string}")
    public void user_selects_product_type(String string) {
       // Select select = new Select(webTableOrderPage.productTypeDropdow);
//        select.selectByVisibleText(string);
        select = new Select(webTableOrderPage.typeName);
        select.selectByIndex(1);
    }
    @When("user enters quantity {int}")
    public void user_enters_quantity(Integer int1) {
//webTableOrderPage.quantityName.clear();

//webTableOrderPage.quantityName.sendKeys(int1+""); correct
        webTableOrderPage.inputQuantity.sendKeys(String.valueOf(int1));
    }
    @When("user enters customer name {string}")
    public void user_enters_customer_name(String string) {
webTableOrderPage.customerName.sendKeys(string);
    }
    @When("user enters street {string}")
    public void user_enters_street(String string) {
webTableOrderPage.street.sendKeys(string);
    }
    @When("user enters city {string}")
    public void user_enters_city(String string) {
webTableOrderPage.city.sendKeys(string);
    }
    @When("user enters state {string}")
    public void user_enters_state(String string) {
        webTableOrderPage.state.sendKeys(string);
    }
    @When("user enters zipcode {string}")
    public void user_enters_zipcode(String string) {
webTableOrderPage.zipCode.sendKeys(string);
    }
    @When("user selects credit card type {string}")
    public void user_selects_credit_card_type(String string) {
//        for (WebElement each : webTableOrderPage.cardType) {
//            if (each.getAttribute("value").equalsIgnoreCase(string)){
//                each.click();
//            }
//        }
        BrowserUtils.radioButton(webTableOrderPage.cardType,string);
    }
    @When("user enters credit card number {string}")
    public void user_enters_credit_card_number(String string) {
        webTableOrderPage.cardNumber.sendKeys(string);
    }
    @When("user enters expiry date {string}")
    public void user_enters_expiry_date(String string) {
webTableOrderPage.dateExpire.sendKeys(string);
    }
    @When("user enters process order button")
    public void user_enters_process_order_button() {
webTableOrderPage.processOrderButton.click();
    }
    @Then("user should see {string} in first row of the web table")
    public void user_should_see_in_first_row_of_the_web_table(String expectedCustomerName ) {
        String actualCustomerName = viewAllOrdersPage.newCustomerCell.getText();

        Assert.assertEquals(expectedCustomerName,actualCustomerName);
    }

    @Given("user is already logged in and on order page")
    public void userIsAlreadyLoggedInAndOnOrderPage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
        webtableAppPage.login(ConfigurationReader.getProperty("username"),ConfigurationReader.getProperty("password"));
        webTableOrderPage.orderButton.click();
    }
}
