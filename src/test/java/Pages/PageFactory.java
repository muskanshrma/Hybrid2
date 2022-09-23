package Pages;

import org.openqa.selenium.WebDriver;

public class PageFactory {
    WebDriver driver;

    private LoginPage loginPage;
    private AddToCartAndCheckout cartCheckout;

    public PageFactory(WebDriver driver) {
        this.driver = driver;
    }

    public LoginPage getLoginPage() {
        if (loginPage == null) {
            loginPage = new LoginPage(driver);
        }
        return loginPage;
    }
    public AddToCartAndCheckout getAddToCartAndCheckout() {
        if (cartCheckout == null) {
            cartCheckout = new AddToCartAndCheckout(driver);
        }
        return cartCheckout;
    }
}