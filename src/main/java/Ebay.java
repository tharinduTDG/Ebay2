import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Ebay {
    private WebDriver driver;

    public Ebay(WebDriver driver){
        this.driver = driver;

    }

    public void i_am_on_the_ebay_url(String url) {
        driver.get(url);

    }

    public WebElement ebay_logo_should_available() {
        WebElement elogo = driver.findElement(By.id("gh-logo"));
        return elogo;

    }

    public void select_art_item() {
        WebElement dropDown = driver.findElement(By.xpath("//*[@id=\"gh-cat\"]"));
        dropDown.click();

        Select art =new Select(dropDown);
        art.selectByValue("550");

    }

    public void type_as_elephant() {
        WebElement sbox =driver.findElement(By.xpath("//*[@id=\"gh-ac\"]"));
        sbox.sendKeys("Elephant");

    }

    public void click_on_search_button() {
        WebElement sButton =driver.findElement(By.xpath("//*[@id=\"gh-btn\"]"));
        sButton.click();

        driver.quit();

    }
}
