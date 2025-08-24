package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertTrue;

public class ProductDetailPage {

    WebDriver driver;

    By productTitle = By.xpath("//*[@id=\"inventory_item_container\"]/div/div/div[2]/div[1]");
    By addItem = By.cssSelector("button#add-to-cart");
    By removeButton = By.cssSelector("button#remove");
    By backButton = By.id("back-to-products");


    public ProductDetailPage (WebDriver driver){
        this.driver = driver;
    }

    public void productTitle_displayed(){
        assert(driver.findElement(productTitle).isDisplayed());
    }
    public void click_add(){
        driver.findElement(addItem).click();
    }
    public void remove_button_displayed(){
        assertTrue(driver.findElement(removeButton).isDisplayed());
    }
    public void click_remove(){
        driver.findElement(removeButton).click();
    }
    public void add_button_displayed(){
        assertTrue(driver.findElement(addItem).isDisplayed());
    }
    public void click_back(){
        driver.findElement(backButton).click();
    }


}
