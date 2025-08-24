package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertTrue;

public class CartPage {

    WebDriver driver;

    By checkoutButton = By.id("checkout");
    By remove_backpack = By.cssSelector("button#remove-sauce-labs-backpack");
    By continueShopping = By.cssSelector("button#continue-shopping");


    public CartPage (WebDriver driver){
        this.driver = driver;
    }
    public void checkout_button_displayed(){
        assertTrue(driver.findElement(checkoutButton).isDisplayed());
    }
    public void click_remove_backpack(){
       driver.findElement(remove_backpack).click();
    }
    public void remove_backpack_notDisplayed(){
        assertTrue(driver.findElements(remove_backpack).isEmpty());
    }
    public void click_continueShopping_button(){
        driver.findElement(continueShopping).click();
    }
    public void click_checkout(){
        driver.findElement(checkoutButton).click();
    }




}
