package com.mazen.step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_stepDefinitions {
    @Given("user is on the library log in page")
    public void user_is_on_the_library_log_in_page() {
        System.out.println("user on the login page");

    }
    @When("user enter librarian username")
    public void user_enter_librarian_username() {
        System.out.println("user enter librarian username");
    }
    @When("user enter librarian password")
    public void user_enter_librarian_password() {
        System.out.println("user enter password");
       //TODO: I NEED TO DO IMPLEMENTATION FOR LIBRARY PASSWORD
    }
    @Then("user should see dashboard")
    public void user_should_see_dashboard() {
        System.out.println("user should see dash board");
    }

    @When("user enter student username")
    public void userEnterStudentUsername() {
        System.out.println("user enter user name");
    }

    @And("user enter student password")
    public void userEnterStudentPassword() {
        System.out.println("user enter user password");
    }

    @When("user enter admin username")
    public void userEnterAdminUsername() {
        System.out.println("admin username");
    }

    @And("user enter admin password")
    public void userEnterAdminPassword() {
        System.out.println("admin password");
    }
}
