package org.example;

import io.cucumber.java.bs.A;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "webdrivers/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://demo.opensource-socialnetwork.org/login");
        driver.findElement(By.xpath("//*[@id='ossn-login']/fieldset/div[1]/input")).sendKeys("Administra");
        driver.findElement(By.xpath("//*[@id='ossn-login']/fieldset/div[2]/input")).sendKeys("administrator");
        driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
        WebElement isThere = driver.findElement(By.xpath("//strong[contains(text(),'Invalid username or password!')]"));
if (isThere.isDisplayed()){
    System.out.println("scenario passed");
}
        synchronized (driver){
            driver.wait();
        }

        driver.close();

        System.out.println( "Hello World!" );
    }
}
