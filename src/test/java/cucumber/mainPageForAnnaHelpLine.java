package cucumber;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class mainPageForAnnaHelpLine extends superClass {
    WebDriverWait wait;
    WebDriver driver;
    List<WebElement> ListOfLocation;

    public void clickLoginButton(WebDriver driver) throws IOException {
        getwaitdriver(driver)
                .until(ExpectedConditions.visibilityOfElementLocated(getValueFromElementAddressConfig("ah.login")));
        driver.findElement(getValueFromElementAddressConfig("ah.login")).click();
    }

    public void enterPhoneNumber(WebDriver driver, String phoneNumber) throws IOException {

        getwaitdriver(driver).until(ExpectedConditions
                .visibilityOfElementLocated(getValueFromElementAddressConfig("signInForm.phoneNumberField")));
        driver.findElement(getValueFromElementAddressConfig("signInForm.phoneNumberField")).sendKeys(phoneNumber);
    }

    public void enterOtp(WebDriver driver, String otp) throws IOException {
        getwaitdriver(driver)
                .until(ExpectedConditions.visibilityOfElementLocated(getValueFromElementAddressConfig("ah.enter.otp")));
        driver.findElement(getValueFromElementAddressConfig("ah.enter.otp")).sendKeys(otp);
    }

    public void mainOptionButtonClick(WebDriver driver) throws IOException {
        getwaitdriver(driver).until(
                ExpectedConditions.visibilityOfElementLocated(getValueFromElementAddressConfig("mainOptionButton")));
        driver.findElement(getValueFromElementAddressConfig("mainOptionButton")).click();

    }

    public void clickCountinueButton(WebDriver driver) throws IOException {
        getwaitdriver(driver).until(
                ExpectedConditions.visibilityOfElementLocated(getValueFromElementAddressConfig("phCountinueButton")));
        driver.findElement(getValueFromElementAddressConfig("phCountinueButton")).click();
    }

    public void getUserNameText(WebDriver driver) throws IOException {
        getwaitdriver(driver).until(
                ExpectedConditions.visibilityOfElementLocated(getValueFromElementAddressConfig("ah.getUserText")));

        System.out.println(driver.findElement(getValueFromElementAddressConfig("ah.getUserText")).getText());
    }

    public void clickNextInSplashScreen(WebDriver driver) throws IOException {
        getwaitdriver(driver).until(ExpectedConditions
                .visibilityOfElementLocated(getValueFromElementAddressConfig("ah.next.splashScreen")));
        driver.findElement(getValueFromElementAddressConfig("ah.next.splashScreen")).click();
    }

    public void clickNewComplaintButton(WebDriver driver) throws IOException, InterruptedException {
        getwaitdriver(driver).until(ExpectedConditions
                .visibilityOfElementLocated(getValueFromElementAddressConfig("ah.clickNewComplaint")));
        driver.findElement(getValueFromElementAddressConfig("ah.clickNewComplaint")).click();
        Thread.sleep(2000);

    }

    public void selectLocation(WebDriver driver) throws IOException, InterruptedException {
        Select listOfLocation = new Select(driver.findElement(By.name("issueLocation")));
        listOfLocation.selectByIndex(2);

    }

    public void selectStreet(WebDriver driver) throws IOException, InterruptedException {
        getwaitdriver(driver).until(ExpectedConditions
                .visibilityOfElementLocated(getValueFromElementAddressConfig("ah.select.issueStreet")));
        driver.findElement(getValueFromElementAddressConfig("ah.select.issueStreet")).click();

        getwaitdriver(driver).until(ExpectedConditions.visibilityOfElementLocated(
                getValueFromElementAddressConfig("ah.select.issueStreet.option.Krishnappa")));
        driver.findElement(getValueFromElementAddressConfig("ah.select.issueStreet.option.Krishnappa")).click();

        getwaitdriver(driver).until(ExpectedConditions
                .visibilityOfElementLocated(getValueFromElementAddressConfig("ah.select.issueStreet")));
        driver.findElement(getValueFromElementAddressConfig("ah.select.issueStreet")).click();

        Thread.sleep(2000);

        // Select street = new
        // Select(driver.findElement(getValueFromElementAddressConfig("ah.select.issueStreet")));
        // street.selectByValue("Krishnappa Street");
    }

    public void selectIssueCategory(WebDriver driver) throws IOException {
        getwaitdriver(driver).until(ExpectedConditions
                .visibilityOfElementLocated(getValueFromElementAddressConfig("ah.select.issueCategory")));
        Select issueCategory = new Select(
                driver.findElement(getValueFromElementAddressConfig("ah.select.issueCategory")));
        issueCategory.selectByValue("Public Utility Services");
    }

    public void selectIssue(WebDriver driver) throws IOException {
        getwaitdriver(driver).until(
                ExpectedConditions.visibilityOfElementLocated(getValueFromElementAddressConfig("ah.select.issue")));
        Select issue = new Select(driver.findElement(getValueFromElementAddressConfig("ah.select.issue")));
        issue.selectByVisibleText("Public health");
    }

    public void selectSpecificIssue(WebDriver driver) throws IOException {
        getwaitdriver(driver).until(ExpectedConditions
                .visibilityOfElementLocated(getValueFromElementAddressConfig("ah.select.specificissue")));
        Select specificIssue = new Select(
                driver.findElement(getValueFromElementAddressConfig("ah.select.specificissue")));
        specificIssue.selectByVisibleText("Biomedical waste");
    }

    public void enterIssueDetails(WebDriver driver) throws IOException {
        getwaitdriver(driver).until(ExpectedConditions
                .visibilityOfElementLocated(getValueFromElementAddressConfig("ah.enter.issueDetails")));
        driver.findElement(getValueFromElementAddressConfig("ah.enter.issueDetails")).sendKeys("IssueDetails");
    }

    public void clickSubmit(WebDriver driver) throws IOException {
        getwaitdriver(driver).until(
                ExpectedConditions.visibilityOfElementLocated(getValueFromElementAddressConfig("ah.click.submit")));
        driver.findElement(getValueFromElementAddressConfig("ah.click.submit")).click();
    }

}
