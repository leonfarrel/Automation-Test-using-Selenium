package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertTrue;

public class CheckoutCompletePage {

    WebDriver driver;

    By backHomeButton = By.id("back-to-products");

    public CheckoutCompletePage (WebDriver driver){
        this.driver = driver;
    }

    public void backHomeButton_displayed(){
        assertTrue(driver.findElement(backHomeButton).isDisplayed());
    }
    public void click_backHome_button(){
        driver.findElement(backHomeButton).click();
    }
}
