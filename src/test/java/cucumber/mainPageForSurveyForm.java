package cucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class mainPageForSurveyForm extends superClass {

        // By phCountinueButton = By.xpath("//button[normalize-space()='Continue']");
        // By mainOptionButton =
        // By.xpath("//button[@aria-haspopup='true']//mat-icon[@role='img']");
        By formListPage = By.xpath("//button[@routerlink='/forms/list']");
        By addFormPageButton = By.xpath("//button[@routerlink='/forms/builder/']");
        By toGetUserDetails = By.xpath("//body//div//mat-card-subtitle[1]");
        By verifyAddFormPageRedirection = By.xpath("//h2[normalize-space()='Survey builder']");
        By logout = By.xpath("//a[normalize-space()='Logout']");
        By formTitle = By.xpath(
                        "/html[1]/body[1]/app-root[1]/div[1]/app-layout[1]/app-form-builder[1]/div[1]/div[1]/form[1]/mat-form-field[1]/div[1]/div[1]/div[1]/input[1]");
        By formSubtitle = By.xpath(
                        "/html[1]/body[1]/app-root[1]/div[1]/app-layout[1]/app-form-builder[1]/div[1]/div[1]/form[1]/mat-form-field[2]/div[1]/div[1]/div[1]/input[1]");
        By surveyBuilderAddButton = By.xpath("//mat-icon[normalize-space()='add']");
        By countAddFields = By.xpath("//div[@class='cdk-overlay-container']//button");
        By addTextField = By.xpath("//div[@class='cdk-overlay-container']//button[1]");
        By addSelect = By.xpath("//div[@class='cdk-overlay-container']//button[2]");
        By addTextArea = By.xpath("//div[@class='cdk-overlay-container']//button[3]");
        By addPhonenumber = By.xpath("//div[@class='cdk-overlay-container']//button[4]");
        By addfileField = By.xpath("//div[@class='cdk-overlay-container']//button[5]");
        By enterQuestion = By.xpath("//input[@placeholder='Enter question']");
        By enterOptions = By.xpath("//mat-chip-list[@aria-label='Options']//div//input");
        By saveSurvey = By.xpath("//button[@type='submit']");
        By formNextButton = By.xpath("//mat-icon[normalize-space()='chevron_right']");

        // To enterQuestion
        By firstQuestionField = By.xpath(
                        "//mat-expansion-panel[1]//div//div//app-question//div//div//div//div//input[@placeholder='Enter question']");
        By secondQuestionField = By.xpath(
                        "//mat-expansion-panel[2]//div//div//app-question//div//div//div//div//input[@placeholder='Enter question']");
        By thirdQuestionField = By.xpath(
                        "//mat-expansion-panel[3]//div//div//app-question//div//div//div//div//input[@placeholder='Enter question']");
        By fourthQuestionField = By.xpath(
                        "//mat-expansion-panel[4]//div//div//app-question//div//div//div//div//input[@placeholder='Enter question']");
        By fivthQuestionField = By.xpath(
                        "//mat-expansion-panel[5]//div//div//app-question//div//div//div//div//input[@placeholder='Enter question']");

        // Required
        By oneRequiredField = By.xpath(
                        "/html/body/app-root/div/app-layout/app-form-builder/div/div/form/mat-accordion/mat-expansion-panel[1]/div/div/app-question/div/div[1]/mat-checkbox");
        By twoRequiredField = By.xpath(
                        "/html/body/app-root/div/app-layout/app-form-builder/div/div/form/mat-accordion/mat-expansion-panel[2]/div/div/app-question/div/div[1]/mat-checkbox");
        By threeRequiredField = By.xpath(
                        "/html/body/app-root/div/app-layout/app-form-builder/div/div/form/mat-accordion/mat-expansion-panel[3]/div/div/app-question/div/div[1]/mat-checkbox");
        By fourRequiredField = By.xpath(
                        "/html/body/app-root/div/app-layout/app-form-builder/div/div/form/mat-accordion/mat-expansion-panel[4]/div/div/app-question/div/div[1]/mat-checkbox");
        By fiveRequiredField = By.xpath(
                        "/html/body/app-root/div/app-layout/app-form-builder/div/div/form/mat-accordion/mat-expansion-panel[5]/div/div/app-question/div/div[1]/mat-checkbox");

        // DataEntry Address
        By countOfQuestions = By.xpath("//mat-step-header");

        WebDriverWait wait;
        String enteredFormTitle;
        String enteredSubFormTitle;
        int fieldCount;
        WebDriver driver;

        public void enterPhoneNumber(WebDriver driver, String phoneNumber) throws IOException {

                getwaitdriver(driver).until(ExpectedConditions.visibilityOfElementLocated(
                                getValueFromElementAddressConfig("signInForm.phoneNumberField")));
                driver.findElement(getValueFromElementAddressConfig("signInForm.phoneNumberField"))
                                .sendKeys(phoneNumber);
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

        public void clickFormListPageButton(WebDriver driver) {
                getwaitdriver(driver).until(ExpectedConditions.visibilityOfElementLocated(formListPage));
                driver.findElement(formListPage).click();

        }

        public void clickAddFormPageButton(WebDriver driver) {
                getwaitdriver(driver).until(ExpectedConditions.visibilityOfElementLocated(addFormPageButton));
                driver.findElement(addFormPageButton).click();

        }

        public void getUserDetails(WebDriver driver) {
                getwaitdriver(driver).until(ExpectedConditions.visibilityOfElementLocated(toGetUserDetails));
                System.out.println(driver.findElement(toGetUserDetails).getText());
        }

        public void verifyAddPageFormRedirect(WebDriver driver) {
                getwaitdriver(driver)
                                .until(ExpectedConditions.visibilityOfElementLocated(verifyAddFormPageRedirection));
                assertThat(driver.findElement(verifyAddFormPageRedirection).isDisplayed()).isTrue();

        }

        public void enterTextInFormTitle(WebDriver driver) {
                getwaitdriver(driver).until(ExpectedConditions.visibilityOfElementLocated(formTitle));
                driver.findElement(formTitle).click();
                enteredFormTitle = getAlphaNumericString(15);
                System.out.println(enteredFormTitle);
                driver.findElement(formTitle).sendKeys(enteredFormTitle);

        }

        public void enterTextInFormSubTitle(WebDriver driver) {
                getwaitdriver(driver).until(ExpectedConditions.visibilityOfElementLocated(formSubtitle));
                driver.findElement(formSubtitle).click();
                enteredSubFormTitle = getAlphaNumericString(15);
                System.out.println(enteredSubFormTitle);
                driver.findElement(formSubtitle).sendKeys(enteredSubFormTitle);

        }

        public void clickAddButtonInSurveyBuilder(WebDriver driver) {
                getwaitdriver(driver).until(ExpectedConditions.visibilityOfElementLocated(surveyBuilderAddButton));
                driver.findElement(surveyBuilderAddButton).click();

        }

        public void addTextField(WebDriver driver) {
                getwaitdriver(driver).until(ExpectedConditions.visibilityOfElementLocated(addTextField));
                driver.findElement(addTextField).click();

        }

        public void enterQuestionInTextField(WebDriver driver) {
                getwaitdriver(driver).until(ExpectedConditions.visibilityOfElementLocated(enterQuestion));
                driver.findElement(enterQuestion).sendKeys(getAlphaNumericString(10));
        }

        public void clickSaveSurveyButton(WebDriver driver) {
                getwaitdriver(driver).until(ExpectedConditions.visibilityOfElementLocated(saveSurvey));
                driver.findElement(saveSurvey).click();
        }

        public void clickSurveyFormForAddingResponseUsingFormName(WebDriver driver, String surveyFormName) {

                getwaitdriver(driver).until(ExpectedConditions.visibilityOfElementLocated(
                                By.xpath("//div[normalize-space()='" + enteredFormTitle + "']")));
                WebElement searchedFormName = driver
                                .findElement(By.xpath("//div[normalize-space()='" + enteredFormTitle + "']"));
                searchedFormName.click();
        }

        public void nextButtonInFormPage(WebDriver driver) {
                getwaitdriver(driver).until(ExpectedConditions.visibilityOfElementLocated(formNextButton));
                driver.findElement(formNextButton).click();

        }

        public void addFieldsAndQuestionValues(WebDriver driver) throws IOException, InterruptedException {

                List<WebElement> fields = driver.findElements(countAddFields);
                fieldCount = fields.size();
                // System.out.println(fieldCount);

                int numberofFieldTypes = 6;

                for (int startOfQuestionCount = 1; startOfQuestionCount <= numberofFieldTypes; startOfQuestionCount++) {
                        System.out.println(startOfQuestionCount);

                        // Click add button for adding fields
                        getwaitdriver(driver)
                                        .until(ExpectedConditions.visibilityOfElementLocated(surveyBuilderAddButton));
                        driver.findElement(surveyBuilderAddButton).click();
                        // Choose Field
                        getwaitdriver(driver).until(ExpectedConditions.visibilityOfElementLocated(
                                        By.xpath("//div[@class='cdk-overlay-container']//button[" + startOfQuestionCount
                                                        + "]")));
                        driver.findElement(By.xpath(
                                        "//div[@class='cdk-overlay-container']//button[" + startOfQuestionCount + "]"))
                                        .click();
                        // Enter question
                        getwaitdriver(driver).until(ExpectedConditions.visibilityOfElementLocated(
                                        By.xpath("//mat-expansion-panel[" + startOfQuestionCount
                                                        + "]//div//div//app-question//div//div//div//div//input[@placeholder='Enter question']")));
                        driver.findElement(By.xpath("//mat-expansion-panel[" + startOfQuestionCount
                                        + "]//div//div//app-question//div//div//div//div//input[@placeholder='Enter question']"))
                                        .sendKeys(getValueFromDataConfig(String.valueOf(startOfQuestionCount)));

                        System.out.println(getValueFromDataConfig(String.valueOf(startOfQuestionCount)));

                        // for selectInteger.parseInt(str)
                        if (startOfQuestionCount == Integer.parseInt(getValueFromDataConfig("index.selectoption"))) {
                                // First Option
                                getwaitdriver(driver)
                                                .until(ExpectedConditions.visibilityOfElementLocated(enterOptions));
                                driver.findElement(enterOptions)
                                                .sendKeys(getValueFromDataConfig("response.select.one"));
                                driver.findElement(enterOptions).sendKeys(Keys.ENTER);
                                Thread.sleep(1000);

                                // Second Option
                                getwaitdriver(driver)
                                                .until(ExpectedConditions.visibilityOfElementLocated(enterOptions));
                                driver.findElement(enterOptions)
                                                .sendKeys(getValueFromDataConfig("response.select.two"));
                                driver.findElement(enterOptions).sendKeys(Keys.ENTER);
                                Thread.sleep(1000);
                        }

                        if (startOfQuestionCount != 5 && startOfQuestionCount != 6) {
                                // twoRequiredField
                                getwaitdriver(driver).until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
                                                "/html/body/app-root/div/app-layout/app-form-builder/div/div/form/mat-accordion/mat-expansion-panel["
                                                                + startOfQuestionCount
                                                                + "]/div/div/app-question/div/div[1]/mat-checkbox")));
                                driver.findElement(By.xpath(
                                                "/html/body/app-root/div/app-layout/app-form-builder/div/div/form/mat-accordion/mat-expansion-panel["
                                                                + startOfQuestionCount
                                                                + "]/div/div/app-question/div/div[1]/mat-checkbox"))
                                                .click();
                        }

                        Thread.sleep(2000);

                }

        }

        public void verifySave(WebDriver driver) {
                getwaitdriver(driver).until(ExpectedConditions.visibilityOfElementLocated(
                                By.xpath("/html/body/app-root/div/app-layout/app-responses/div/h3")));
                System.out.println(
                                driver.findElement(By.xpath("/html/body/app-root/div/app-layout/app-responses/div/h3"))
                                                .getText());

        }

        public void toCheckStartPageOfDataEntry(WebDriver driver) throws InterruptedException {
                getwaitdriver(driver).until(ExpectedConditions.visibilityOfElementLocated(
                                By.xpath("//h2[normalize-space()='" + enteredFormTitle + "']")));
                Thread.sleep(2000);

                System.out.println(driver.findElement(By.xpath("//h2[normalize-space()='" + enteredFormTitle + "']"))
                                .getText());

                if (driver.findElement(By.xpath("//h2[normalize-space()='" + enteredFormTitle + "']"))
                                .getText() == enteredFormTitle) {
                        assertTrue(false);
                } else {
                        System.out.println("Valid Data Entry form");
                }

        }

}
