package stepDefinitions;

import java.io.IOException;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.junit.runner.RunWith;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import cucumber.mainPageForAnnaHelpLine;
import io.cucumber.junit.Cucumber;
import io.github.bonigarcia.wdm.WebDriverManager;

@RunWith(Cucumber.class)
public class annaHelpLineStepDefs extends mainPageForAnnaHelpLine {

    WebDriver driver;
    public static final String USERNAME = "bavithiranramesh_78dSm4";
    public static final String AUTOMATE_KEY = "reJ3DTPjYxNPkgq8u5XP";
    public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";

    @Given("^Access WebDriverManager For AnnaHelpLine$")
    public void access_WebdriverManager() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        // driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }

    @Given("Access Grid")
    public void grid_console() throws MalformedURLException {
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setBrowserName("chrome");
        cap.setPlatform(Platform.WINDOWS);
        ChromeOptions op = new ChromeOptions();
        op.setHeadless(true);
        op.merge(cap);
        String huburl = "http://192.168.0.164:4444/wd/hub";
        driver = new RemoteWebDriver(new URL(huburl), op);
    }

    @Given("^Access BrowserStack For AnnaHelpLine$")
    public void access_BrowserStack() throws IOException {
        Hashtable<String, String> capsHashtable = new Hashtable<String, String>();
        capsHashtable.put("browser", "chrome");
        capsHashtable.put("browser_version", "latest");
        capsHashtable.put("os", "Windows");
        capsHashtable.put("os_version", "10");
        capsHashtable.put("build", "AnnaHelpLine-browserstack-build-1");
        capsHashtable.put("name", "Thread 1" + getcurrrentDateAndTime());

        // Execute caps
        String key;
        DesiredCapabilities caps = new DesiredCapabilities();
        // Iterate over the hashtable and set the capabilities
        Set<String> keys = capsHashtable.keySet();
        Iterator<String> itr = keys.iterator();
        while (itr.hasNext()) {
            key = itr.next();
            caps.setCapability(key, capsHashtable.get(key));
        }

        driver = new RemoteWebDriver(new URL(URL), caps);

        driver.get(getValueFromDataConfig("Stage.url.annaHelpLine"));
        // driver.get("https://www.onemindindia.com/home");
        driver.getWindowHandle();
        driver.manage().window().maximize();
    }

    @Then("^Launch chrome browser for AnnaHelpLine$")
    public void launch_chrome_browser_for_survey_forms() throws IOException {
        // Launching sample website
        driver.get(getValueFromDataConfig("Stage.url.annaHelpLine"));
        // driver.get("https://www.onemindindia.com/home");
        driver.getWindowHandle();
        driver.manage().window().maximize();
    }

    @Then("^Launch chrome browser for \"([^\"]*)\" AnnaHelpLine$")
    public void launch_chrome_browser_for_something_annahelpline(String env) throws Throwable {
        // Launching sample website
        driver.get(getValueFromDataConfig(env));
        // driver.get("https://www.onemindindia.com/home");
        driver.getWindowHandle();
        driver.manage().window().maximize();
    }

    @Then("^Click Login for AnnaHelpLine$")
    public void click_Login_for_annaHelpLine() throws IOException {
        clickLoginButton(driver);
    }

    @Then("^Enter Phone number for AnnaHelpLine$")
    public void enter_phone_number_for_survey_form() throws IOException {
        enterPhoneNumber(driver, getValueFromDataConfig("phoneNumber"));
    }

    @Then("^Enter otp$")
    public void enter_otp() throws IOException {
        enterOtp(driver, getValueFromDataConfig("otp"));

    }

    @Then("^Then click countinue button AnnaHelpLine$")
    public void then_Click_countinue_button() throws InterruptedException, IOException {
        clickCountinueButton(driver);
        Thread.sleep(3000);
    }

    @Then("^Wait action for \"([^\"]*)\" seconds AnnaHelpLine$")
    public void wiat_time(int seconds) throws InterruptedException {
        Thread.sleep(seconds * 1000);
    }

    @Then("Click new Complaint")
    public void click_new_complaint() throws IOException, InterruptedException {
        clickNextInSplashScreen(driver);
        // Write code here that turns the phrase above into concrete actions
        clickNewComplaintButton(driver);
    }

    @Then("^choose issue location$")
    public void choose_issue_location() throws Throwable {
        chooseIssueLocation(driver);
    }

    @Then("^choose issue street$")
    public void choose_issue_street() throws Throwable {
        chooseIssueStreet(driver);
    }

    @Then("^enter Address$")
    public void enter_address() throws Throwable {
        enterAddress(driver);
    }

    @Then("^choose issue category$")
    public void choose_issue_category() throws Throwable {
        chooseIssueCategory(driver);
    }

    @Then("^choose issue$")
    public void choose_issue() throws Throwable {
        chooseIssue(driver);
    }

    @Then("^choose specific issue$")
    public void choose_specific_issue() throws Throwable {
        chooseSpecificIssue(driver);
    }

    @Then("select issue location")
    public void select_issue_location() throws IOException, InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        selectLocation(driver);
    }

    @Then("select issue Street")
    public void select_issue_street() throws IOException, InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        selectStreet(driver);
    }

    @Then("select issue issueCategory")
    public void select_issue_issue_category() throws IOException {
        // Write code here that turns the phrase above into concrete actions
        selectIssueCategory(driver);
    }

    @Then("select issue issue")
    public void select_issue_issue() throws IOException {
        // Write code here that turns the phrase above into concrete actions
        selectIssue(driver);
    }

    @Then("select specific issue")
    public void select_specific_issue() throws IOException {
        // Write code here that turns the phrase above into concrete actions
        selectSpecificIssue(driver);
    }

    @Then("^enter issue details$")
    public void enter_issue_details() throws Throwable {
        enterIssueDetails(driver);
    }

    @Then("click submit")
    public void click_submit() throws IOException {
        // Write code here that turns the phrase above into concrete actions
        clickSubmit(driver);
    }

    @Then("Verify complaint creation")
    public void verify_complaint_creation() throws Exception {
        complaintCreationVerification(driver);
        getListOfComplaintCards(driver);
    }

    @Then("Quit Browser")
    public void quit_browser() {
        quitBrowser(driver);
    }

}
