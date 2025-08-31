package stepdef;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;

public class Hooks extends Driver {

    @Before
    public void beforeTest(){
        getDriverHeadless(); //Change to getDriverHeadless() to use the Headless option
    }

    @After
    public void afterTest() throws InterruptedException {
//        Thread.sleep(2000);
        driver.close();
    }
//    @AfterStep
//    public void afterStep() throws InterruptedException {
//        Thread.sleep(2000);
//    }

}
