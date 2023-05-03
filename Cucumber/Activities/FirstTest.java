package StepDefinitions;

import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class FirstTest extends BaseClass{
    @BeforeAll
    public static void setUp() {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }
    @Given("user is on the TS homepage")
    public void openPage() {
        //Open the TS homepage
        driver.get("https://www.training-support.net");

        // Assertion
        Assert.assertEquals("Training Support", driver.getTitle());
    }

    @When("they click the About Us link")
    public void clickAboutUsLink() {
        //Find and click About Us link
        driver.findElement(By.id("about-link")).click();
    }
    @Then("they are redirected to the About Us page")
    public void verifyAboutPage() {
        //Verify page title
        Assert.assertEquals("About Training Support", driver.getTitle());
    }
    @Then("^close the browser$")
    public void closeTheBrowser(){
        // To close the browser
        driver.quit();
    }
}
