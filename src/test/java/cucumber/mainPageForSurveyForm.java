package cucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.assertj.core.api.Assertions.assertThat;

public class mainPageForSurveyForm extends superClass {

    By phoneNumberField = By.xpath("//input[@title='Please enter a valid Phone Number']");
    By phCountinueButton = By.xpath("//button[normalize-space()='Continue']");
    By mainOptionButton = By.xpath("//button[@aria-haspopup='true']//mat-icon[@role='img']");
    By formListPage = By.xpath("//button[@routerlink='/forms/list']");
    By addFormPageButton = By.xpath("//button[@routerlink='/forms/builder/']");
    By toGetUserDetails = By.xpath("//body//div//mat-card-subtitle[1]");
    By verifyAddFormPageRedirection = By.xpath("//h2[normalize-space()='Survey builder']");
    By logout = By.xpath("//a[normalize-space()='Logout']");
    By formTitle = By.xpath("//label[@class=\"mat-form-field-label ng-tns-c68-17 mat-empty mat-form-field-empty ng-star-inserted\"]");
    By formSubtitle = By.xpath("//label[@class=\"mat-form-field-label ng-tns-c68-18 mat-empty mat-form-field-empty ng-star-inserted\"]");
    By surveyBuilderAddButton = By.xpath("//mat-icon[@aria-label='Text icon']");
    By addTextField = By.xpath("//div[@class='cdk-overlay-container']//button[1]");
    By addSelect = By.xpath("//div[@class='cdk-overlay-container']//button[2]");
    By addTextArea = By.xpath("//div[@class='cdk-overlay-container']//button[3]");
    By addPhonenumber = By.xpath("//div[@class='cdk-overlay-container']//button[4]");
    By enterQuestion = By.xpath("//input[@placeholder='Enter question']");
    By saveSurvey = By.xpath("//input[@placeholder='Enter question']");

    WebDriverWait wait;

    public void enterPhoneNumber(WebDriver driver, String phoneNumber) {
        getwaitdriver(driver).until(ExpectedConditions.visibilityOfElementLocated(phoneNumberField));
        driver.findElement(phoneNumberField).sendKeys(phoneNumber);
    }

    public void mainOptionButtonClick(WebDriver driver) {
        getwaitdriver(driver).until(ExpectedConditions.visibilityOfElementLocated(mainOptionButton));
        driver.findElement(mainOptionButton).click();

    }

    public void clickCountinueButton(WebDriver driver) {
        getwaitdriver(driver).until(ExpectedConditions.visibilityOfElementLocated(phCountinueButton));
        driver.findElement(phCountinueButton).click();
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
        getwaitdriver(driver).until(ExpectedConditions.visibilityOfElementLocated(verifyAddFormPageRedirection));
        assertThat(driver.findElement(verifyAddFormPageRedirection).isDisplayed()).isTrue();

    }

    public void enterTextInFormTitle(WebDriver driver) {
        getwaitdriver(driver).until(ExpectedConditions.visibilityOfElementLocated(formTitle));
        driver.findElement(formTitle).click();
        driver.findElement(formTitle).sendKeys(getAlphaNumericString(15));

    }

    public void enterTextInFormSubTitle(WebDriver driver) {
        getwaitdriver(driver).until(ExpectedConditions.visibilityOfElementLocated(formSubtitle));
        driver.findElement(formSubtitle).click();
        driver.findElement(formSubtitle).sendKeys(getAlphaNumericString(15));

    }

    public void clickAddButtonInSurveyBuilder(WebDriver driver){
        getwaitdriver(driver).until(ExpectedConditions.visibilityOfElementLocated(surveyBuilderAddButton));
        driver.findElement(surveyBuilderAddButton).click();

    }

    public void addTextField(WebDriver driver){
        getwaitdriver(driver).until(ExpectedConditions.visibilityOfElementLocated(addTextField));
        driver.findElement(addTextField).click();

    }

    public void enterQuestionInTextField(WebDriver driver){
        getwaitdriver(driver).until(ExpectedConditions.visibilityOfElementLocated(enterQuestion));
        driver.findElement(enterQuestion).sendKeys(getAlphaNumericString(10));
    }

    public void clickSaveSurveyButton(WebDriver driver){
        getwaitdriver(driver).until(ExpectedConditions.visibilityOfElementLocated(saveSurvey));
        driver.findElement(saveSurvey).click();

    }



}
