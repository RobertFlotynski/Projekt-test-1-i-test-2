package runer;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = "steps",
        features = "classpath:features",
        plugin = {"pretty", "html:target/report" }
)
public class CucumberRunner {
}
