package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertTrue;

public class LoginPage {

    WebDriver driver;

    By standardUser = By.cssSelector("input#user-name");
    By lockedOutUser = By.cssSelector("input#user-name");
    By problemUser = By.cssSelector("input#user-name");
    By performanceGlitchUser = By.cssSelector("input#user-name");
    By errorUser = By.cssSelector("input#user-name");
    By visualUser = By.cssSelector("input#user-name");
    By validPassword = By.cssSelector("input#password");
    By wrongPassword = By.cssSelector("input#password");
    By loginButton = By.cssSelector("input#login-button");
    By errorMessage = By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]");


    public LoginPage (WebDriver driver){
        this.driver = driver;
    }

    public void goToLoginPage(){
        driver.get("https://www.saucedemo.com/");
    }

    public void standard_user(String username){
        driver.findElement(standardUser).sendKeys("standard_user");
    }
    public void locked_out_user(String username){
        driver.findElement(lockedOutUser).sendKeys("locked_out_user");
    }

    public void problem_user(String username){
        driver.findElement(problemUser).sendKeys("problem_user");
    }

    public void performance_glitch_user(String username){
        driver.findElement(performanceGlitchUser).sendKeys("performance_glitch_user");
    }

    public void error_user(String username){
        driver.findElement(errorUser).sendKeys("error_user");
    }

    public void visual_user(String username){
        driver.findElement(visualUser).sendKeys("visual_user");
    }

    public void valid_password(String password){
        driver.findElement(validPassword).sendKeys("secret_sauce");
    }

    public void wrong_password(String password){
        driver.findElement(wrongPassword).sendKeys("wrong_password");
    }

    public void clickLoginButton(){
        driver.findElement(loginButton).click();
    }
    public void PopUpErrorMessage(){
        assertTrue(driver.findElement(errorMessage).isDisplayed());
    }
    public void validateLoginButton(){
        assertTrue(driver.findElement(loginButton).isDisplayed());
    }


}
