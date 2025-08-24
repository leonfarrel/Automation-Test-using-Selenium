package stepdef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.ProductDetailPage;

public class ProductDetailPageStepDef extends Driver{

    ProductDetailPage productDetailPage;


    @Then("user will be redirect to the Sauce Lab product detail page")
    public void validateProductTitle(){
        productDetailPage = new ProductDetailPage(driver);
        productDetailPage.productTitle_displayed();
    }

    @When("user click on the Add to Cart page")
    public void addItem(){
        productDetailPage.click_add();
    }

    @Then("user will see the Remove button")
    public void validateRemoveButton(){
        productDetailPage.remove_button_displayed();
    }

    @And("user click on the Remove button")
    public void removeItem(){
        productDetailPage.click_remove();
    }
    @Then("user will see tje Add tp Cart button")
    public void validateAddButton(){
        productDetailPage.add_button_displayed();
    }
    @When("user click on the Back to Product button")
    public void backButton(){
        productDetailPage.click_back();
    }

}
