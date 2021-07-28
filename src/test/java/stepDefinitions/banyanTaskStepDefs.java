package stepDefinitions;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import cucumber.mainPageForBanyan;
import io.cucumber.junit.Cucumber;
import io.github.bonigarcia.wdm.WebDriverManager;

@RunWith(Cucumber.class)
public class banyanTaskStepDefs extends mainPageForBanyan {

    WebDriver driver;
    
    @Given("^Access WebDriverManager For BanyanTask$")
    public void access_WebdriverManager() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }

    @Then("^Launch chrome browser for BanyanTask$")
    public void launch_chrome_browser_for_survey_forms() throws IOException {
        // Launching sample website
        driver.get(getValueFromDataConfig("Stage.url.Banyan"));
        // driver.get("https://www.onemindindia.com/home");
        driver.getWindowHandle();
        driver.manage().window().maximize();
    }

    @Then("^Click Login button for BanyanTask$")
    public void click_login_button() throws IOException {
        clickLoginBanyan(driver);
    }

    @Then("^Click chat tab for BanayanTask$")
    public void click_chat_tab() throws IOException{
        clickChatTabBanyan(driver);

    }

    @Then("^Click user in BanayanTask$")
    public void click_user_BanyanTask() throws IOException{
        clickChatUser(driver);
    }

    @Then("^Type a message$")
    public void type_a_message() throws IOException{
        typeMessage(driver);
    }

    @Then("^Click send button for BanyanTask$")
    public void click_send_button() throws IOException{
        clickSendButtonBanyan(driver);
    }

    @Then("Send message multiple times")
    public void send_message_multiple_times() throws IOException{
        sendMessageMultipleTimes(driver);
    }
}
