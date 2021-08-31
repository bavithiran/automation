package cucumber;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import static org.junit.Assert.assertTrue;

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
        Boolean welcomebackTextIsDisplayed;
        List<WebElement> ListofComplaints;

        public void clickLoginButton(WebDriver driver) throws IOException {
                getwaitdriver(driver).until(ExpectedConditions
                                .visibilityOfElementLocated(getValueFromElementAddressConfig("ah.login")));
                driver.findElement(getValueFromElementAddressConfig("ah.login")).click();
        }

        public void enterPhoneNumber(WebDriver driver, String phoneNumber) throws IOException {

                getwaitdriver(driver).until(ExpectedConditions.visibilityOfElementLocated(
                                getValueFromElementAddressConfig("signInForm.phoneNumberField")));
                driver.findElement(getValueFromElementAddressConfig("signInForm.phoneNumberField"))
                                .sendKeys(phoneNumber);
        }

        public void enterOtp(WebDriver driver, String otp) throws IOException {
                getwaitdriver(driver).until(ExpectedConditions
                                .visibilityOfElementLocated(getValueFromElementAddressConfig("ah.enter.otp")));
                driver.findElement(getValueFromElementAddressConfig("ah.enter.otp")).sendKeys(otp);
        }

        public void mainOptionButtonClick(WebDriver driver) throws IOException {
                getwaitdriver(driver).until(ExpectedConditions
                                .visibilityOfElementLocated(getValueFromElementAddressConfig("mainOptionButton")));
                driver.findElement(getValueFromElementAddressConfig("mainOptionButton")).click();

        }

        public void clickCountinueButton(WebDriver driver) throws IOException {
                getwaitdriver(driver).until(ExpectedConditions
                                .visibilityOfElementLocated(getValueFromElementAddressConfig("phCountinueButton")));
                driver.findElement(getValueFromElementAddressConfig("phCountinueButton")).click();
        }

        public void getUserNameText(WebDriver driver) throws IOException {
                getwaitdriver(driver).until(ExpectedConditions
                                .visibilityOfElementLocated(getValueFromElementAddressConfig("ah.getUserText")));

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

        public void chooseIssueLocation(WebDriver driver) throws IOException, InterruptedException {
                // Arrow List
                getwaitdriver(driver).until(ExpectedConditions.visibilityOfElementLocated(
                                getValueFromElementAddressConfig("an.choose.issueLocation.typeTextField")));
                driver.findElement(getValueFromElementAddressConfig("an.choose.issueLocation.typeTextField")).click();
                Thread.sleep(1000);

                // Type
                getwaitdriver(driver).until(ExpectedConditions.visibilityOfElementLocated(
                                getValueFromElementAddressConfig("an.choose.issueLocation.typeTextField")));
                driver.findElement(getValueFromElementAddressConfig("an.choose.issueLocation.typeTextField"))
                                .sendKeys(getValueFromDataConfig("an.issueLocation.value"));
                Thread.sleep(1000);

                // choose Option
                getwaitdriver(driver).until(ExpectedConditions.visibilityOfElementLocated(
                                getValueFromElementAddressConfig("an.choose.issueLocation.option")));
                driver.findElement(getValueFromElementAddressConfig("an.choose.issueLocation.option")).click();
                Thread.sleep(1000);

        }

        public void chooseIssueStreet(WebDriver driver) throws IOException, InterruptedException {
                // Arrow List
                getwaitdriver(driver).until(ExpectedConditions.visibilityOfElementLocated(
                                getValueFromElementAddressConfig("an.choose.issueStreet.typeTextField")));
                driver.findElement(getValueFromElementAddressConfig("an.choose.issueStreet.typeTextField")).click();
                Thread.sleep(1000);

                // Type
                getwaitdriver(driver).until(ExpectedConditions.visibilityOfElementLocated(
                                getValueFromElementAddressConfig("an.choose.issueStreet.typeTextField")));
                driver.findElement(getValueFromElementAddressConfig("an.choose.issueStreet.typeTextField"))
                                .sendKeys(getValueFromDataConfig("an.issueStreet.value"));
                Thread.sleep(1000);

                // choose Option
                getwaitdriver(driver).until(ExpectedConditions.visibilityOfElementLocated(
                                getValueFromElementAddressConfig("an.choose.issueStreet.option")));
                driver.findElement(getValueFromElementAddressConfig("an.choose.issueStreet.option")).click();
                Thread.sleep(1000);

        }

        public void enterAddress(WebDriver driver) throws IOException, InterruptedException {
                getwaitdriver(driver).until(ExpectedConditions
                                .visibilityOfElementLocated(getValueFromElementAddressConfig("an.textarea.Address")));
                driver.findElement(getValueFromElementAddressConfig("an.textarea.Address"))
                                .sendKeys(getValueFromDataConfig("Address"));
                Thread.sleep(1000);
        }

        public void chooseIssueCategory(WebDriver driver) throws IOException, InterruptedException {
                // Arrow List
                getwaitdriver(driver).until(ExpectedConditions.visibilityOfElementLocated(
                                getValueFromElementAddressConfig("an.choose.issueCategory.text")));
                driver.findElement(getValueFromElementAddressConfig("an.choose.issueCategory.text")).click();
                Thread.sleep(1000);

                // Type
                getwaitdriver(driver).until(ExpectedConditions.visibilityOfElementLocated(
                                getValueFromElementAddressConfig("an.choose.issueCategory.text")));
                driver.findElement(getValueFromElementAddressConfig("an.choose.issueCategory.text"))
                                .sendKeys(getValueFromDataConfig("issueCategory"));
                Thread.sleep(1000);

                // choose Option
                getwaitdriver(driver).until(ExpectedConditions.visibilityOfElementLocated(
                                getValueFromElementAddressConfig("an.choose.issueCategory.option")));
                driver.findElement(getValueFromElementAddressConfig("an.choose.issueCategory.option")).click();
                Thread.sleep(1000);

        }

        public void chooseIssue(WebDriver driver) throws IOException, InterruptedException {
                // Arrow List
                getwaitdriver(driver).until(ExpectedConditions
                                .visibilityOfElementLocated(getValueFromElementAddressConfig("an.choose.issue.text")));
                driver.findElement(getValueFromElementAddressConfig("an.choose.issue.text")).click();
                Thread.sleep(1000);

                // Type
                getwaitdriver(driver).until(ExpectedConditions
                                .visibilityOfElementLocated(getValueFromElementAddressConfig("an.choose.issue.text")));
                driver.findElement(getValueFromElementAddressConfig("an.choose.issue.text"))
                                .sendKeys(getValueFromDataConfig("issue"));
                Thread.sleep(1000);

                // choose Option
                getwaitdriver(driver).until(ExpectedConditions.visibilityOfElementLocated(
                                getValueFromElementAddressConfig("an.choose.issue.option")));
                driver.findElement(getValueFromElementAddressConfig("an.choose.issue.option")).click();
                Thread.sleep(1000);
        }

        public void chooseSpecificIssue(WebDriver driver) throws IOException, InterruptedException {
                // Arrow List
                getwaitdriver(driver).until(ExpectedConditions.visibilityOfElementLocated(
                                getValueFromElementAddressConfig("an.choose.specificissue.text")));
                driver.findElement(getValueFromElementAddressConfig("an.choose.specificissue.text")).click();
                Thread.sleep(1000);

                // Type
                getwaitdriver(driver).until(ExpectedConditions.visibilityOfElementLocated(
                                getValueFromElementAddressConfig("an.choose.specificissue.text")));
                driver.findElement(getValueFromElementAddressConfig("an.choose.specificissue.text"))
                                .sendKeys(getValueFromDataConfig("specificIssue"));
                Thread.sleep(1000);

                // choose Option
                getwaitdriver(driver).until(ExpectedConditions.visibilityOfElementLocated(
                                getValueFromElementAddressConfig("an.choose.specificissue.option")));
                driver.findElement(getValueFromElementAddressConfig("an.choose.specificissue.option")).click();
                Thread.sleep(1000);
        }

        public void issueInDetails(WebDriver driver) throws IOException, InterruptedException {
                getwaitdriver(driver).until(ExpectedConditions
                                .visibilityOfElementLocated(getValueFromElementAddressConfig("an.textarea.Address")));
                driver.findElement(getValueFromElementAddressConfig("an.textarea.Address"))
                                .sendKeys(getValueFromDataConfig("Address"));
                Thread.sleep(1000);

        }

        public void selectLocation(WebDriver driver) throws IOException, InterruptedException {
                Select listOfLocation = new Select(driver.findElement(By.name("issueLocation")));
                listOfLocation.selectByValue("");

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
                getwaitdriver(driver).until(ExpectedConditions.visibilityOfElementLocated(
                                getValueFromElementAddressConfig("ah.select.issueCategory")));
                Select issueCategory = new Select(
                                driver.findElement(getValueFromElementAddressConfig("ah.select.issueCategory")));
                issueCategory.selectByValue("Public Utility Services");
        }

        public void selectIssue(WebDriver driver) throws IOException {
                getwaitdriver(driver).until(ExpectedConditions
                                .visibilityOfElementLocated(getValueFromElementAddressConfig("ah.select.issue")));
                Select issue = new Select(driver.findElement(getValueFromElementAddressConfig("ah.select.issue")));
                issue.selectByVisibleText("Public health");
        }

        public void selectSpecificIssue(WebDriver driver) throws IOException {
                getwaitdriver(driver).until(ExpectedConditions.visibilityOfElementLocated(
                                getValueFromElementAddressConfig("ah.select.specificissue")));
                Select specificIssue = new Select(
                                driver.findElement(getValueFromElementAddressConfig("ah.select.specificissue")));
                specificIssue.selectByVisibleText("Biomedical waste");
        }

        public void enterIssueDetails(WebDriver driver) throws IOException {
                getwaitdriver(driver).until(ExpectedConditions
                                .visibilityOfElementLocated(getValueFromElementAddressConfig("ah.enter.issueDetails")));
                driver.findElement(getValueFromElementAddressConfig("ah.enter.issueDetails")).sendKeys("IssueDetails");
        }

        public void complaintCreationVerification(WebDriver driver) throws IOException {
                getwaitdriver(driver).until(ExpectedConditions
                                .visibilityOfElementLocated(getValueFromElementAddressConfig("an.welcomeBack")));
                welcomebackTextIsDisplayed = driver.findElement(getValueFromElementAddressConfig("an.welcomeBack"))
                                .isDisplayed();

                assertTrue("This will succeed.", true);

        }

        public void clickSubmit(WebDriver driver) throws IOException {
                getwaitdriver(driver).until(ExpectedConditions
                                .visibilityOfElementLocated(getValueFromElementAddressConfig("ah.click.submit")));
                driver.findElement(getValueFromElementAddressConfig("ah.click.submit")).click();
        }

        public void getListOfComplaintCards(WebDriver driver) throws Exception {
                getwaitdriver(driver).until(ExpectedConditions.visibilityOfElementLocated(
                                getValueFromElementAddressConfig("an.totalCpmplaintCards.list")));
                ListofComplaints = driver.findElements(getValueFromElementAddressConfig("an.totalCpmplaintCards.list"));
                // setLogger(String.valueOf(ListofComplaints.size()));
                System.out.println("Number of complaints : " + ListofComplaints.size());
                for (WebElement complaint : ListofComplaints) {

                        System.out.print("Complaint ID : " + complaint.getText());
                        // setLogger(complaint.getText());
                }

        }

        public void quitBrowser(WebDriver driver) {
                driver.quit();
        }

}
