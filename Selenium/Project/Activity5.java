package ProjectActivities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.Color;

public class Activity5 {
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
        WebElement navBar;
        //enter login credentials and click the submit button
        username.sendKeys("admin");
        password.sendKeys("pa$$w0rd");
        loginButton.click();
        navBar= driver.findElement(By.className("navbar-header"));
//        WebElement navMenu = driver.findElement(By.cssSelector("nav"));
//        String navMenuColor = navMenu.getCssValue("background-color");
//
//        // print the color to the console
//        System.out.println("Navigation menu color: " + navMenuColor);

        //get the
        System.out.println("Color "+Color.fromString(navBar.getCssValue("color")).asHex());
            // close the browser
            driver.quit();
        }
    }
