package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertTrue;

public class CheckoutInformationPage{

    WebDriver driver;

    By firstName = By.cssSelector("input#first-name");
    By lastName = By.cssSelector("input#last-name");
    By zipcode = By.cssSelector("input#postal-code");
    By continueButton = By.cssSelector("input#continue");
    By cancelButton = By.cssSelector("button#cancel");
    By errorMessage = By.className("error-message-container");

    public CheckoutInformationPage(WebDriver driver){
        this.driver = driver;
    }
    public void inputFirstName(String first_name){
        driver.findElement(firstName).sendKeys("Jonathan");
    }
    public void inputLastName (String last_name){
        driver.findElement(lastName).sendKeys("Joestar");
    }
    public void inputZipcode (String zip_code){
        driver.findElement(zipcode).sendKeys("123456");
    }
    public void zipcode_displayed(){
        assertTrue(driver.findElement(zipcode).isDisplayed());
    }
    public void click_continueButton(){
        driver.findElement(continueButton).click();
    }
    public void click_cancelButton(){
        driver.findElement(cancelButton).click();
    }
    public void errorMessage_displayed(){
        assertTrue(driver.findElement(errorMessage).isDisplayed());
    }


}
