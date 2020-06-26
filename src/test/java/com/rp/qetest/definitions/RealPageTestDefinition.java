package com.rp.qetest.definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class RealPageTestDefinition {

    @Steps
    com.rp.qetest.steps.RealPageTestStep RealPageTestStep;


    @Given("^the user is on homepage$")
    public void the_user_is_on_homepage() {

        RealPageTestStep.openApp();

   }



    @When("^user can search women items$")
    public void user_can_search_women_items(){

        RealPageTestStep.searchWomen();

    }

    @Then("^user add items to cart$")
    public void user_add_items_to_cart() {

        RealPageTestStep.addItems();


    }

    @Then("^user continue shopping$")
    public void user_continue_shopping()  {

        RealPageTestStep.continueShopping();

    }

    @When("^user search and select printed dress$")
    public void user_search_and_select_printed_dress(){
        RealPageTestStep.searchDress();


    }

    @Then("^user add pop up item to cart$")
    public void userAddPopUpItemToCart()  {
        RealPageTestStep.addItemPopUp();

    }

    @When("^user select (.*) items$")
    public void userSelectItems(int items) {
        RealPageTestStep.search2Dress(items);


    }

    @Then("^verifies shopping cart have (.*) items$")
    public void verifiesShoppingCart(String quantity) {

        RealPageTestStep.verifyCart(quantity);

    }

    @And("^user is taken to the (.*) screen$")
    public void userIsTakenToTheAuthenticationScreen(String text) {

        RealPageTestStep.authenticationScreen(text);

    }
}
