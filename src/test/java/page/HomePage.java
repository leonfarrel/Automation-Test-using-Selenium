package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.Assert.assertTrue;

public class HomePage {

    WebDriver driver;
    By validateLogo = By.xpath("//*[@id=\"header_container\"]/div[1]/div[2]/div");
    By burgerMenu = By.id("react-burger-menu-btn");
    By logoutButton = By.id("logout_sidebar_link");
    By cartIcon = By.className("shopping_cart_link");

    // Add item
    By addBackpack = By.cssSelector("button#add-to-cart-sauce-labs-backpack");
    By addBikeLight = By.cssSelector("button#add-to-cart-sauce-labs-bike-light");
    By addBoltShirt = By.cssSelector("button#add-to-cart-sauce-labs-bolt-t-shirt");
    By addFleeceJacket = By.cssSelector("button#add-to-cart-sauce-labs-fleece-jacket");
    By addOnesie = By.cssSelector("button#add-to-cart-sauce-labs-onesie");
    By addRedShirt = By.xpath("//*[@id=\"add-to-cart-test.allthethings()-t-shirt-(red)\"]");


    //Remove item
    By removeBackpack = By.cssSelector("button#remove-sauce-labs-backpack");
    By removeBikeLight = By.cssSelector("button#remove-sauce-labs-bike-light");
    By removeBoltShirt = By.cssSelector("button#remove-sauce-labs-bolt-t-shirt");
    By removeFleeceJacket = By.cssSelector("button#remove-sauce-labs-fleece-jacket");
    By removeOnesie = By.cssSelector("button#remove-sauce-labs-onesie");
    By removeRedShirt = By.xpath("//*[@id=\"remove-test.allthethings()-t-shirt-(red)\"]");

    //Access the Product Detail Page
    By backpack = By.xpath("//*[@id=\"item_4_title_link\"]/div");
    By bikeLight = By.xpath("//*[@id=\"item_0_title_link\"]/div");
    By boltShirt = By.xpath("//*[@id=\"item_1_title_link\"]/div");
    By fleeceJacket = By.xpath("//*[@id=\"item_5_title_link\"]/div");
    By onesie = By.xpath("//*[@id=\"item_2_title_link\"]/div");
    By redShirt = By.xpath("//*[@id=\"item_3_title_link\"]/div");


    public HomePage (WebDriver driver){
        this.driver = driver;
    }

    public void validateLogo(){
        assertTrue(driver.findElement(validateLogo).isDisplayed());
    }
    public void click_burgerMenu(){
        driver.findElement(burgerMenu).click();
    }
    public void click_logout_button(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement logoutBtn = wait.until(ExpectedConditions.elementToBeClickable(logoutButton));
        logoutBtn.click();
    }
    public void click_cart_icon(){
        driver.findElement(cartIcon).click();
    }

    //Add item
    public void add_backpack(){
        driver.findElement(addBackpack).click();
    }
    public void add_bikeLight(){
        driver.findElement(addBikeLight).click();
    }
    public void add_boltShirt(){
        driver.findElement(addBoltShirt).click();
    }
    public void add_fleeceJacket(){
        driver.findElement(addFleeceJacket).click();
    }
    public void add_onesie(){
        driver.findElement(addOnesie).click();
    }
    public void addRedShirt(){
        driver.findElement(addRedShirt).click();
    }


    //Validate Remove Button
    public void remove_backpack_displayed(){
        assertTrue(driver.findElement(removeBackpack).isDisplayed());
    }
    public void remove_bikeLight_displayed(){
        assertTrue(driver.findElement(removeBikeLight).isDisplayed());
    }
    public void remove_boltShirt_displayed(){
        assertTrue(driver.findElement(removeBoltShirt).isDisplayed());
    }
    public void remove_fleeceJacket_displayed(){
        assertTrue(driver.findElement(removeFleeceJacket).isDisplayed());
    }
    public void remove_onesie_displayed(){
        assertTrue(driver.findElement(removeOnesie).isDisplayed());
    }
    public void remove_redShirt_displayed(){
        assertTrue(driver.findElement(removeRedShirt).isDisplayed());
    }

    //Remove item
    public void remove_backpack(){
        driver.findElement(removeBackpack).click();
    }
    public void remove_bikeLight(){
        driver.findElement(removeBikeLight).click();
    }
    public void remove_boltShirt(){
        driver.findElement(removeBoltShirt).click();
    }
    public void remove_fleeceJacket(){
        driver.findElement(removeFleeceJacket).click();
    }
    public void remove_onesie(){
        driver.findElement(removeOnesie).click();
    }
    public void remove_redShirt(){
        driver.findElement(removeRedShirt).click();
    }

    //Validate Add to Cart Button
    public void add_backPack_displayed(){
        assertTrue(driver.findElement(addBackpack).isDisplayed());
    }
    public void add_bikeLight_displayed(){
        assertTrue(driver.findElement(addBikeLight).isDisplayed());
    }
    public void add_boltShirt_displayed(){
        assertTrue(driver.findElement(addBoltShirt).isDisplayed());
    }
    public void add_fleeceJacket_displayed(){
        assertTrue(driver.findElement(addFleeceJacket).isDisplayed());
    }
    public void add_onesie_displayed(){
        assertTrue(driver.findElement(addOnesie).isDisplayed());
    }
    public void add_redShirt_displayed(){
        assertTrue(driver.findElement(addRedShirt).isDisplayed());
    }

    //Access Product Detail Page
    public void access_backpack_product_detail_page(){
        driver.findElement(backpack).click();
    }
    public void access_bikeLight_product_detail_page(){
        driver.findElement(bikeLight).click();
    }
    public void access_boltShirt_product_detail_page(){
        driver.findElement(boltShirt).click();
    }
    public void access_fleeceJacket_product_detail_page(){
        driver.findElement(fleeceJacket).click();
    }
    public void access_onesie_product_detail_page(){
        driver.findElement(onesie).click();
    }
    public void access_redShirt_product_detail_page(){
        driver.findElement(redShirt).click();
    }




}
