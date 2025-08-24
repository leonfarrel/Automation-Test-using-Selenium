package stepdef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.CheckoutInformationPage;

public class CheckoutInformationStepDef extends Driver{

    CheckoutInformationPage checkoutInformationPage;

    @Then("user will be redirect to the Checkout Page")
    public void validateZipcode(){
        checkoutInformationPage = new CheckoutInformationPage(driver);
        checkoutInformationPage.zipcode_displayed();
    }

    @And("user input first name with {string}")
    public void firstName(String first_name){
        checkoutInformationPage = new CheckoutInformationPage(driver);
        checkoutInformationPage.inputFirstName(first_name);
    }

    @And("user input last name with {string}")
    public void lastName(String last_name){
        checkoutInformationPage.inputLastName(last_name);
    }
    @And("user input zipcode with {string}")
    public void zipCode(String zip_code){
        checkoutInformationPage.inputZipcode(zip_code);
    }
    @When("user click on the Continue Button")
    public void continueButton(){
        checkoutInformationPage.click_continueButton();
    }
    @When("user click on the Cancel Button")
    public void cancelButton(){
        checkoutInformationPage.click_cancelButton();
    }
    @Then("user will see error message")
    public void errorMessage(){
        checkoutInformationPage.errorMessage_displayed();
    }

}
