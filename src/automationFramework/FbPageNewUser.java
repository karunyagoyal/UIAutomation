package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by gudgoyal on 9/19/2017.
 */
public class FbPageNewUser {
    public static void createNewUser(FirefoxDriver webDriver) throws InterruptedException {

        webDriver.findElement(By.name("firstname")).sendKeys("Krishna");
        //check if the box is filled with firstName
        WebElement firstNameDisplay = webDriver.findElement(By.name("firstname"));
        System.out.println("Print true if firstname successfully feb in the box :  " +firstNameDisplay.isDisplayed());

        webDriver.findElement(By.name("lastname")).sendKeys("Nanda");

        webDriver.findElement(By.id("u_0_k")).sendKeys("9900011111");
        webDriver.findElement(By.id("u_0_r")).sendKeys("radhe");
        webDriver.findElement(By.id("day")).sendKeys("15");
        webDriver.findElement(By.id("month")).sendKeys("Aug");
        webDriver.findElement(By.id("year")).sendKeys("2017");
        webDriver.findElement(By.id("u_0_7")).sendKeys("2");
        WebElement gender = webDriver.findElement(By.id("u_0_7"));
        gender.click();
        WebElement Submit = webDriver.findElement(By.name("websubmit"));
        Submit.click();
        Thread.sleep(100000);
    }
}
