package stepdef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.CartPage;


public class CartPageStepDef extends Driver{


    CartPage cartPage;

    @Then("user will be redirect to the Cart Page")
    public void validateCheckoutButton(){
        cartPage = new CartPage(driver);
        cartPage.checkout_button_displayed();
    }

    @And("user click on the Remove button at the cart page")
    public void removeBackpack(){
        cartPage = new CartPage(driver);
        cartPage.click_remove_backpack();
    }

    @Then("item will be removed from cart page")
    public void removeBackpackedNotDisplayed(){
        cartPage.remove_backpack_notDisplayed();
    }

    @When("user click on the Continue Shopping Button")
    public void returnToHomepage(){
        cartPage = new CartPage(driver);
        cartPage.click_continueShopping_button();
    }
    @When("user click ont the Checkout Button")
    public void checkout(){
        cartPage.click_checkout();
    }
}
