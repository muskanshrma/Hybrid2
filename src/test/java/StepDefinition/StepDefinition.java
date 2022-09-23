package StepDefinition;

import Pages.PageFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.io.IOException;

public class StepDefinition extends BaseClass {

    @Given("User is on Login Page")
    public void login() throws IOException {
        setup();
    }

    @When("User enter username and password")
    public void checkoutCart() throws IOException {

        pageFactory.getLoginPage().login();
//        pageFactory.getAddToCartAndCheckout().addToCart();
    }

    @And("User click on login button")
    public void userDetails() throws IOException {
        pageFactory.getLoginPage().loginButton();
    }

    @Then("User is on Inventory page")
    public void user_is_on_inventory_page() throws IOException {
        pageFactory.getLoginPage().verification();
    }
}