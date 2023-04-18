package ProjectActivities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity7 {

    public static void main(String[] args) {
        // Setup the Firefox driver(GeckoDriver)
        WebDriverManager.firefoxdriver().setup();

        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        // navigate to the login page
        driver.get("http://alchemy.hguy.co/crm");

        WebElement username = driver.findElement(By.id("user_name"));
        WebElement password = driver.findElement(By.id("username_password"));
        WebElement loginButton = driver.findElement(By.id("bigbutton"));
        //enter login credentials and click the submit button
        username.sendKeys("admin");
        password.sendKeys("pa$$w0rd");
        loginButton.click();

        WebElement salesMenu = driver.findElement(By.xpath("//a[text()='Sales']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(salesMenu).perform();

        // find the Leads menu item and click it
        WebElement leadsMenuItem = driver.findElement(By.xpath("//a[.='Leads']"));
        leadsMenuItem.click();

        // wait for the Leads page to load
        WebDriverWait wait = new WebDriverWait (driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.titleContains("Leads"));

        // print a message to the console to indicate that we have navigated to the Leads page
        System.out.println("Navigated to the Sales -> Leads page: " + driver.getCurrentUrl());


        WebElement leadsInformationDetails = driver.findElement(By.xpath("//span[@title='Additional Details']"));
        wait.until(ExpectedConditions.elementToBeClickable(leadsInformationDetails));
        leadsInformationDetails.click();

        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//span[@class='phone']")));
        WebElement mobileNumber = driver.findElement(By.xpath("//span[@class='phone']"));
        System.out.println("Mobile number is:" + mobileNumber.getText());

        // close the browser
        driver.quit();
    }
}
