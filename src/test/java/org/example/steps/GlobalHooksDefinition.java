package org.example.steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GlobalHooksDefinition {

    private WebDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "webdrivers/chromedriver");
        driver = new ChromeDriver();
    }

    @After
    public void testDown() throws InterruptedException {
        driver.quit();
        Thread.sleep(1000);
    }
    public  WebDriver getDriver() {
        return driver;
    }
}
