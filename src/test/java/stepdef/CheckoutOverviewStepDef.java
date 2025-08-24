package stepdef;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.CheckoutOverviewPage;

public class CheckoutOverviewStepDef extends Driver {

    CheckoutOverviewPage checkoutOverviewPage;

    @Then("user will be redirect to the Checkout Overview Page")
    public void ValidateTitle(){
        checkoutOverviewPage = new CheckoutOverviewPage(driver);
        checkoutOverviewPage.title_displayed();
    }
    @When("user click on the Finish Button")
    public void finishButton(){
        checkoutOverviewPage.click_finishButton();
    }
}
