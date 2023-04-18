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
import java.util.List;

public class Activity9 {
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
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.titleContains("Leads"));
        WebElement table = driver.findElement(By.tagName("table"));

        List<WebElement> rows = driver.findElements(By.xpath("//table[@class='list view table-responsive']/tbody/tr"));

        System.out.println(rows.size());
        for (int i = 0; i < 10; i++) {
                WebElement nameColumn = driver.findElement(By.xpath("//table[@class='list view table-responsive']/tbody/tr["+(i+1)+"]//td[3]//a"));
                WebElement userColumn = driver.findElement(By.xpath("//table[@class='list view table-responsive']/tbody/tr["+(i+1)+"]//td[8]//a"));
                System.out.println( "Name:"+nameColumn.getText()+", User:"+ userColumn.getText());
        }
        // close the browser
        driver.quit();
    }
}
