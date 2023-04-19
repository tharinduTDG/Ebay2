import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class EbayPage {
    WebDriver driver = new ChromeDriver();
    Ebay ebay =new Ebay(driver);

    @Given("I am on the Ebay url {string}")
    public void i_am_on_the_ebay_url(String url) {
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        ebay.i_am_on_the_ebay_url(url);

    }
    @When("Ebay logo should available")
    public void ebay_logo_should_available() {
        boolean logo1 =ebay.ebay_logo_should_available().isDisplayed();
        Assert.assertTrue(logo1);

    }
    @Then("Select Art item")
    public void select_art_item() {
        ebay.select_art_item();

    }
    @Then("Type as Elephant")
    public void type_as_elephant() {
        ebay.type_as_elephant();

    }
    @Then("Click on search button")
    public void click_on_search_button() {
        ebay.click_on_search_button();

    }

}
