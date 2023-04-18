package ProjectActivities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4 {
    public static void main(String[] args) {
        // Setup the Firefox driver(GeckoDriver)
        WebDriverManager.firefoxdriver().setup();

        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        // navigate to the login page
        driver.get("http://alchemy.hguy.co/crm");

        // find the email and password input fields and submit button
        WebElement username = driver.findElement(By.id("user_name"));
        WebElement password = driver.findElement(By.id("username_password"));
        WebElement loginButton = driver.findElement(By.id("bigbutton"));

        // enter login credentials and click the submit button
        username.sendKeys("admin");
        password.sendKeys("pa$$w0rd");
        loginButton.click();
            String Title = "SuiteCRM";
            String aTitle = driver.getTitle();
            if (aTitle.contentEquals(aTitle)) {
                System.out.println("Login page opened");
            } else {
                System.out.println("failed");
            }

            // close the webdriver
            driver.quit();
        }
    }

