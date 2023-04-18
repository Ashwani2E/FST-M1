package ProjectActivities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class Activity2 {
    public static void main(String[] args) {
        // Setup the Firefox driver(GeckoDriver)
        WebDriverManager.firefoxdriver().setup();

        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        // Open the browser
        //driver.get("http://alchemy.hguy.co/crm");
        driver.navigate().to("http://alchemy.hguy.co/crm");

        // Perform testing and assertions
        //String URL = "http://alchemy.hguy.co/crm";
       //driver.get(URL);
        String pageTitle = driver.getTitle();
        System.out.println(pageTitle);
        String currentURL = driver.getCurrentUrl();
        System.out.println(currentURL);

        // Close the browser
        // Feel free to comment out the line below
        // so it doesn't close too quickly
        driver.quit();
    }
}
