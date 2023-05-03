package ProjectActivities;

import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity1Class extends Activity1Baseclass{
    @BeforeAll
    public static void setUp() {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @Given("user is on the CRM system they click the navigation link")
    public void user_is_on_the_crm_system_they_click_the_navigation_link() {
        // Write code here that turns the phrase above into concrete actions
        driver.get("https://alchemy.hguy.co/crm/");
        throw new io.cucumber.java.PendingException();
    }
    @Then("get the title of website")
    public void get_the_title_of_website() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println(driver.getTitle());
        throw new io.cucumber.java.PendingException();
    }
    @Then("if it matches with SuiteCRM")
    public void if_it_matches_with_suite_crm() {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertEquals("SuiteCRM",driver.getTitle());
        throw new io.cucumber.java.PendingException();
    }
}
