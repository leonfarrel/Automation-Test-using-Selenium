package stepdef;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Driver {
    protected static WebDriver driver;

    protected void getDriver(){
        ChromeOptions options = new ChromeOptions();

        // Disable password manager + leak detection popup
        options.addArguments("--incognito");
        options.addArguments("--disable-features=PasswordManagerEnabled,PasswordLeakDetection");

        driver = WebDriverManager.chromedriver().create();
    }

    protected void getDriverHeadless(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");

        // Disable password manager + leak detection popup
        options.addArguments("--incognito");
        options.addArguments("--disable-features=PasswordManagerEnabled,PasswordLeakDetection");

        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver(options);
    }


}
