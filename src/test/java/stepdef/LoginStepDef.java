package stepdef;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.LoginPage;

public class LoginStepDef extends Driver {

    LoginPage loginPage;

    @Given("user is on login page")
    public void userOnLoginPage(){
        loginPage = new LoginPage(driver);
        loginPage.goToLoginPage();
    }

    @When("user input username text box with valid data such as {string}")
    public void validDataUsername(String username){
        loginPage.standard_user(username);
    }

    @And("user input password text box with valid data such as {string}")
    public void validPassword(String password){
        loginPage.valid_password(password);
    }

    @And("user click login button")
    public void clickLogin(){
        loginPage.clickLoginButton();
    }

    @When("user input username text box with invalid data such as {string}")
    public void lockedUser(String username){
        loginPage.locked_out_user(username);
    }

    @And("user input password text box with invalid data such as {string}")
    public void wrongPass(String password){
        loginPage.wrong_password(password);
    }

    @And("user see error message")
    public void errorMessage(){
        loginPage.PopUpErrorMessage();
    }

    @When("user input username text box with problem data such as {string}")
    public void problemUser(String username){
        loginPage.problem_user(username);
    }

    @When("user input username text box with glitch data such as {string}")
    public void glitchUser(String username){
        loginPage.performance_glitch_user(username);
    }

    @When("user input username text box with error data such as {string}")
    public void errorUser(String username){
        loginPage.error_user(username);
    }

    @When("user input username text box with visual data such as {string}")
    public void visualUser(String username){
        loginPage.visual_user(username);
    }
    @Then("user will be redirect to the Login Page")
    public void ValidateLoginButton(){
        loginPage = new LoginPage(driver);
        loginPage.validateLoginButton();
    }


}
