package StepDefinition;

import Pages.PageFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.io.IOException;

public class StepDefinition extends BaseClass {

    @Given("User is on Login Page")
    public void website() throws IOException {
        setup();
    }

    @When("User enter username and password")
    public void loginUser() throws IOException {

        pageFactory.getLoginPage().login();
    }

    @And("User click on login button")
    public void button() throws IOException {
        pageFactory.getLoginPage().loginButton();
    }

    @Then("User is on Inventory page")
    public void user_is_on_inventory_page() throws IOException {
        pageFactory.getLoginPage().verification();
    }

    @Given("User is logged in and clicks on add to cart button")
    public void addCart() throws IOException {
        pageFactory.getAddToCartAndCheckout().addToCart();
    }

    @When("User navigates to shopping cart")
    public void shoppingCart() throws IOException {

        pageFactory.getAddToCartAndCheckout().myCart();
    }

    @And("User enters details and checksout")
    public void userDetails() throws IOException {
        pageFactory.getAddToCartAndCheckout().checkoutDetails();
    }

    @Then("User is on Thank you page")
    public void user_is_on_thank_you_page() throws IOException {
        pageFactory.getAddToCartAndCheckout().verifyCheckout();
    }
}