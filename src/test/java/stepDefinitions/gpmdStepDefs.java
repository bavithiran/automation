package stepDefinitions;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import cucumber.BaseClassGPMD;
import cucumber.mainPageForGPMD;
import io.cucumber.java.en.Given;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class gpmdStepDefs extends mainPageForGPMD {
    WebDriver driver;

    @Given("^Access WebDriverManager For GPMD $")
    public void access_WebdriverManager() {
        driver = BaseClassGPMD.getinitilizedSingleTonDriver();
    }





    
}
