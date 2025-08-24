package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertTrue;

public class CheckoutOverviewPage {

    WebDriver driver;

    By overviewTitle = By.className("title");
    By finishButton = By.id("finish");


    public CheckoutOverviewPage (WebDriver driver){
        this.driver = driver;
    }

    public void title_displayed(){
        assertTrue(driver.findElement(overviewTitle).isDisplayed());
    }
    public void click_finishButton(){
        driver.findElement(finishButton).click();
    }
}
