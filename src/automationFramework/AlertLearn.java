package automationFramework;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by gudgoyal on 9/20/2017.
 */
public class AlertLearn {

    public static void testAlert(FirefoxDriver webDriver) throws InterruptedException {

        webDriver.findElement(By.xpath("//*[@id='content']/p[4]/button")).click();

        //simple alert
        Alert simpleAlert = webDriver.switchTo().alert();
        String sAMsg = simpleAlert.getText();
        System.out.println("the alert msg is : " + sAMsg);
        simpleAlert.accept();

        //confirmation Alert
        WebElement cAElement = webDriver.findElement(By.xpath(".//*[@id='content']/p[8]/button"));

        ((JavascriptExecutor) webDriver).executeScript("arguments[0].click()", cAElement);
        Alert confirmAlert = webDriver.switchTo().alert();
        System.out.println("confirmation laert value is " + confirmAlert.getText());
        confirmAlert.accept();

        //prompt Alert

        WebElement pElement = webDriver.findElement(By.xpath(".//*[@id='content']/p[11]/button"));
        ((JavascriptExecutor)webDriver).executeScript("argument[0].click()",pElement);
        Alert promtAlert = webDriver.switchTo().alert();
        System.out.println("prompt  alert value is " + promtAlert.getText());
        promtAlert.sendKeys("Accepted ur alert msg");



        Thread.sleep(100);
    }
}
