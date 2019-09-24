package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by gudgoyal on 9/18/2017.
 */
public class FirstTestAutomation {

    public static void main(String args[]) throws InterruptedException {

        System.setProperty("webdriver.firefox.marionette", "./geckodriver.exe");


        FirefoxDriver webDriver = new FirefoxDriver();

        webDriver.get("https://www.google.co.in/");
        String baseUrl = "http://www.facebook.com";
        webDriver.get(baseUrl);

        FbPageNewUser.createNewUser(webDriver);


        String tag_name;
        tag_name = webDriver.findElement(By.id("email")).getTagName();
        System.out.println(tag_name);

        Thread.sleep(50);

        System.out.println("Yuppiieee reched google");

        webDriver


        webDriver.quit();
    }




}

