package com.mazen.step_definitions;

import com.mazen.pages.DropdownPage;
import com.mazen.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class Dropdown_StepDef {
    DropdownPage dropdownPage = new DropdownPage();
    @Given("user on the dropdowns page of practice page")
    public void user_on_the_dropdowns_page_of_practice_page() {

        Driver.getDriver().get("https://practice.cydeo.com/dropdown");

    }
    @Then("user should see information in month dropdown")
    public void user_should_see_information_in_month_dropdown(List<String> expected) {
        Select select = new Select(dropdownPage.monthDropdown);

        List<WebElement> actualOptionAsWebElement = select.getOptions();

        List<String> actualOptionAsAString = new ArrayList<>();
        for (WebElement each : actualOptionAsWebElement){
           // actualOptionAsAString.add(each.getText());
            actualOptionAsAString.add(each.getText());
        }
        System.out.println(actualOptionAsAString);
       // Assert.assertEquals(expected,actualOptionAsAString);

    }

}
