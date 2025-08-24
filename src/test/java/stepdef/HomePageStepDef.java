package stepdef;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.HomePage;
import page.LoginPage;


public class HomePageStepDef extends Driver {

    HomePage homepage;
    LoginPage loginPage;

    @Then("user will be redirect to homepage")
    public void validateLogo(){
        homepage = new HomePage(driver);
        homepage.validateLogo();

    }
    @When("user click on the Burger Menu Button")
    public void burgerMenu(){
        homepage.click_burgerMenu();
    }

    @And("user click on the Logout Button")
    public void Logout(){
        homepage.click_logout_button();
    }

    @When("user click on the Cart Icon")
    public void accessCartPage(){
        homepage.click_cart_icon();
    }


    @Given("user is on homepage with username {string} and password {string}")
    public void userAtHomepage(String username, String password) {
        loginPage = new LoginPage(driver);
        homepage  = new HomePage(driver);

        loginPage.goToLoginPage();
        loginPage.standard_user(username);
        loginPage.valid_password(password);
        loginPage.clickLoginButton();
        homepage.validateLogo();
    }

    //Add item
    @When("user click the add to cart button on the Sauce Labs Backpack product")
    public void addBackpack() {
        homepage.add_backpack();
    }
    @When("user click the add to cart button on the Sauce Labs Bike Light product")
    public void addBikeLight() {
        homepage.add_bikeLight();
    }
    @When("user click the add to cart button on the Sauce Labs Bolt Shirt product")
    public void addBoltShirt() {
        homepage.add_boltShirt();
    }
    @When("user click the add to cart button on the Sauce Labs Fleece Jacket product")
    public void addFleeceJacket() {
        homepage.add_fleeceJacket();
    }
    @When("user click the add to cart button on the Sauce Labs Onesie product")
    public void addOnesie() {
        homepage.add_onesie();
    }
    @When("user click the add to cart button on the Sauce Labs Red Shirt product")
    public void addRedShirt() {
        homepage.addRedShirt();
    }


    //Validate Remove Button
    @Then("user will see the Remove button at the Sauce Labs Backpack Product")
    public void validateBackpackRemoveButton() {
        homepage.remove_backpack_displayed();
    }

    @Then("user will see the Remove button at the Sauce Labs Bike Light Product")
    public void validateBikeLightRemoveButton() {
        homepage.remove_bikeLight_displayed();
    }

    @Then("user will see the Remove button at the Sauce Labs Bolt Shirt Product")
    public void validateBoltShirtRemoveButton() {
        homepage.remove_boltShirt_displayed();
    }

    @Then("user will see the Remove button at the Sauce Labs Fleece Jacket Product")
    public void validateFleeceJacketRemoveButton() {
        homepage.remove_fleeceJacket_displayed();
    }

    @Then("user will see the Remove button at the Sauce Labs Onesie Product")
    public void validateOnesieRemoveButton() {
        homepage.remove_onesie_displayed();
    }

    @Then("user will see the Remove button at the Sauce Labs Red Shirt Product")
    public void validateRedShirtRemoveButton() {
        homepage.remove_redShirt_displayed();
    }

    //Remove item
    @And("user click the Remove button on the Sauce Labs Backpack Product")
    public void removeBackpack() {
        homepage.remove_backpack();
    }
    @And("user click the Remove button on the Sauce Labs Bike light Product")
    public void removeBikeLight() {
        homepage.remove_bikeLight();
    }
    @And("user click the Remove button on the Sauce Labs Bolt Shirt Product")
    public void removeBoltShirt(){
        homepage.remove_boltShirt();
    }
    @And("user click the Remove button on the Sauce Labs Fleece Jacket Product")
    public void removeFleeceJacket(){
        homepage.remove_fleeceJacket();
    }
    @And("user click the Remove button on the Sauce Labs Onesie Product")
    public void removeOnesie(){
        homepage.remove_onesie();
    }
    @And("user click the Remove button on the Sauce Labs Red Shirt Product")
    public void removeRedShirt(){
        homepage.remove_redShirt();
    }


    //Validate Add to Cart Button
    @Then("user will see the Add to Cart button at the Sauce Labs Backpack Product")
    public void validateBackpackAddButton() {
        homepage.add_backPack_displayed();
    }

    @Then("user will see the Add to Cart button at the Sauce Labs Bike Light Product")
    public void validateBikeLightAddButton() {
       homepage.add_bikeLight_displayed();
    }
    @Then("user will see the Add to Cart button at the Sauce Labs Bolt Shirt Product")
    public void validateBoltShirtAddButton(){
        homepage.add_boltShirt_displayed();
    }
    @Then("user will see the Add to Cart button at the Sauce Labs Fleece Jacket Product")
    public void validateFleeceJacketAddButton(){
        homepage.add_fleeceJacket_displayed();
    }
    @Then("user will see the Add to Cart button at the Sauce Labs Onesie Product")
    public void validateOnesieAddButton(){
        homepage.add_onesie_displayed();
    }
    @Then("user will see the Add to Cart button at the Sauce Labs Red Shirt Product")
    public void validateRedShirtAddButton(){
        homepage.add_redShirt_displayed();
    }

    //Access Product Detail Page
    @When("user click on the Sauce Labs Backpack product name")
    public void accessBackpackProductDetail() {
        homepage.access_backpack_product_detail_page();
    }
    @When("user click on the Sauce Labs Bike Light product name")
    public void accessBikeLightProductDetail(){
        homepage.access_bikeLight_product_detail_page();
    }
    @When("user click on the Sauce Labs Bolt Shirt product name")
    public void accessBoltShirtProductDetail(){
        homepage.access_boltShirt_product_detail_page();
    }
    @When("user click on the Sauce Labs Fleece Jacket product name")
    public void accessFleeceJacketProductDetail(){
        homepage.access_fleeceJacket_product_detail_page();
    }
    @When("user click on the Sauce Labs Onesie product name")
    public void accessOnesieProductDetail(){
        homepage.access_onesie_product_detail_page();
    }
    @When("user click on the Sauce Labs Red Shirt product name")
    public void accessRedShirtProductDetail(){
        homepage.access_redShirt_product_detail_page();
    }


}
