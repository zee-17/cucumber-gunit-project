package com.mazen.step_definitions;

import com.mazen.pages.Task01Page;
import com.mazen.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class Task01_Dropdown_stepDef {
    Task01Page task01Page = new Task01Page();
    Select dropDown;
    @Given("User is on the dropdown page")
    public void user_is_on_the_dropdown_page() {
        Driver.getDriver().get("https://practice.cydeo.com/dropdown");

    }
    @Then("user should see info in month dropdown")
    public void user_should_see_info_in_month_dropdown(List<String> months) {

         dropDown = new Select(task01Page.monthDropdown);

         List<WebElement> actualElements = dropDown.getOptions();

         List<String> storedElements = new ArrayList<>();

         for (WebElement each : actualElements){

             storedElements.add(each.getText());
         }
        Assert.assertEquals(months,storedElements);


    }
}
