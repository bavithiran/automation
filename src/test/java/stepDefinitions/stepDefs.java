package stepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.java.en.Given;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class stepDefs {


    @Given("^TestFrameWork$")
	public void TestFrameWork() throws Exception {

		System.out.println("Launching Test.............");
		//Launch_NewstuckApp();

	}
    
}
