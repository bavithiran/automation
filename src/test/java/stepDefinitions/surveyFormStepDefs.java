package stepDefinitions;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.junit.Cucumber;
import io.github.bonigarcia.wdm.WebDriverManager;

import cucumber.mainPageForSurveyForm;

@RunWith(Cucumber.class)
public class surveyFormStepDefs extends mainPageForSurveyForm {

    WebDriver driver;

    @Given("^Access WebDriverManager For Survey Form$")
    public void access_WebdriverManager() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }

    @Then("^Launch chrome browser for survey form$")
    public void launch_chrome_browser_for_survey_forms() throws IOException {
        // Launching sample website
        driver.get(getValueFromDataConfig("url"));
        // driver.get("https://www.onemindindia.com/home");
        driver.getWindowHandle();
        driver.manage().window().maximize();
    }

    @Then("^Enter Phone number for survey form$")
    public void enter_phone_number_for_survey_form() throws IOException {
        enterPhoneNumber(driver, getValueFromDataConfig("phone"));
    }

    @Then("^Then click countinue button$")
    public void then_Click_countinue_button() throws InterruptedException {
        clickCountinueButton(driver);
        Thread.sleep(3000);
    }

    @Then("^Wait action for \"([^\"]*)\" seconds$")
    public void wiat_time(int seconds) throws InterruptedException {
        Thread.sleep(seconds * 1000);
    }

    @Then("^Click Main Option$")
    public void click_Main_Options() {
        mainOptionButtonClick(driver);

    }

    @Then("^Verify User Details$")
    public void verify_user_Details() {
        getUserDetails(driver);
    }

    @Then("^Click Add Form Button$")
    public void click_add_Form_button() {
        clickAddFormPageButton(driver);
    }

    @Then("^Verify Add form Page$")
    public void verify_add_form_page() {
        verifyAddPageFormRedirect(driver);
    }

    @Then("^Enter form title name$")
    public void enter_form_title_name() {
        enterTextInFormTitle(driver);
    }

    @Then("^Enter form Subtitle name$")
    public void enter_form_Subtitle_name() {
        enterTextInFormSubTitle(driver);
    }

    @Then("^Click add button in survey builder form$")
    public void click_add_button_in_survey_builder_form() {
        clickAddButtonInSurveyBuilder(driver);
    }

    @Then("^Add text field$")
    public void Add_text_field() {
        addTextField(driver);
    }

    @Then("^Enter Question in text field$")
    public void enter_question_in_text_field() {
        enterQuestionInTextField(driver);
    }

    @Then("^Save survey$")
    public void save_Survey() {
        clickSaveSurveyButton(driver);
    }

    @Then("^Quit driver$")
    public void quit_driver() {
        driver.quit();
    }

}
