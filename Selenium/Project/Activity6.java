package ProjectActivities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity6 {
    public static void main(String[] args) {
        // Setup the Firefox driver(GeckoDriver)
        WebDriverManager.firefoxdriver().setup();

        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        // navigate to the login page
        driver.get("http://alchemy.hguy.co/crm");

        // find and click the login button
        // WebElement loginButton = driver.findElement(By.cssSelector("button[aria-label='Login']"));
        // loginButton.click();

        // find the email and password input fields and submit button
        WebElement username = driver.findElement(By.id("user_name"));
        WebElement password = driver.findElement(By.id("username_password"));
        WebElement loginButton = driver.findElement(By.id("bigbutton"));
        //enter login credentials and click the submit button
        username.sendKeys("admin");
        password.sendKeys("pa$$w0rd");
        loginButton.click();
        // find the navigation menu element
        WebElement navMenu = driver.findElement(By.cssSelector("nav"));
        // find the "Activities" menu item within the navigation menu
        WebElement activitiesMenuItem = navMenu.findElement(By.xpath("//a[contains(text(), 'Activities')]"));

        // check if the "Activities" menu item exists
        if (activitiesMenuItem.isDisplayed()) {
            System.out.println("'Activities' menu item exists.");
        } else {
            System.out.println("'Activities' menu item does not exist.");
        }
        // close the browser
        driver.quit();
    }
}
