package ProjectActivities;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity1 {
    public static void main(String[] args) {
        // set up the firefox driver (GeckoDriver)
        WebDriverManager.firefoxdriver().setup();
        // Initialize firefox driver
        WebDriver driver = new FirefoxDriver();
        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "NULL");
        //open the page
        driver.get("http://alchemy.hguy.co/crm");

        //print the title of the page
        String pageTitle = driver.getTitle();
        System.out.println(pageTitle);

        //Find and click the about us link
//        driver.findElement(By.id("about-link")).click();
//
        //print the title of the new page
        pageTitle = driver.getTitle();
        System.out.println(pageTitle);

        // Close the browser
        driver.quit();
    }
}
