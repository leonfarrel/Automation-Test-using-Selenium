package stepdef;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.CheckoutCompletePage;

public class CheckoutCompleteStepDef extends Driver{

    CheckoutCompletePage checkoutCompletePage;


    @Then("user will be redirect to the checkout complete")
    public void validateBackHomeButton(){
        checkoutCompletePage = new CheckoutCompletePage(driver);
        checkoutCompletePage.backHomeButton_displayed();
    }

    @When("user click on the Back Home Button")
    public void BackHomeButton(){
        checkoutCompletePage.click_backHome_button();
    }
}
