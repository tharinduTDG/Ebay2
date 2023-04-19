import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
    features ={"src/test/java/Ebay.feature"},
        glue = {""}


)
public class TestRunner {
    
}
