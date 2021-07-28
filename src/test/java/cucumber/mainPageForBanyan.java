package cucumber;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class mainPageForBanyan extends superClass {
    WebDriverWait wait;
    WebDriver driver;

    public void clickLoginBanyan(WebDriver driver) throws IOException {
        getwaitdriver(driver)
                .until(ExpectedConditions.visibilityOfElementLocated(getValueFromElementAddressConfig("banyan.login")));
        driver.findElement(getValueFromElementAddressConfig("banyan.login")).click();
    }

    public void clickChatTabBanyan(WebDriver driver) throws IOException {
        getwaitdriver(driver).until(
                ExpectedConditions.visibilityOfElementLocated(getValueFromElementAddressConfig("banyan.tab.chat")));
        driver.findElement(getValueFromElementAddressConfig("banyan.tab.chat")).click();
    }

    public void clickChatUser(WebDriver driver) throws IOException {
        getwaitdriver(driver).until(
                ExpectedConditions.visibilityOfElementLocated(getValueFromElementAddressConfig("banyan.chat.user")));
        driver.findElement(getValueFromElementAddressConfig("banyan.chat.user")).click();
    }

    public void typeMessage(WebDriver driver) throws IOException {
        getwaitdriver(driver).until(ExpectedConditions
                .visibilityOfElementLocated(getValueFromElementAddressConfig("banyan.chat.typeamessage")));
        driver.findElement(getValueFromElementAddressConfig("banyan.chat.typeamessage"))
                .sendKeys("This is a test message");

    }

    public void clickSendButtonBanyan(WebDriver driver) throws IOException {
        getwaitdriver(driver).until(
                ExpectedConditions.visibilityOfElementLocated(getValueFromElementAddressConfig("banyan.chat.send")));
        driver.findElement(getValueFromElementAddressConfig("banyan.chat.send")).click();
    }

    public void sendMessageMultipleTimes(WebDriver driver) throws IOException {
        for (int i = 0; i < 1000; i++) {
            getwaitdriver(driver).until(ExpectedConditions
                    .visibilityOfElementLocated(getValueFromElementAddressConfig("banyan.chat.typeamessage")));
            driver.findElement(getValueFromElementAddressConfig("banyan.chat.typeamessage"))
                    .sendKeys("This is a test message for times :" + i);

            getwaitdriver(driver).until(ExpectedConditions
                    .visibilityOfElementLocated(getValueFromElementAddressConfig("banyan.chat.send")));
            driver.findElement(getValueFromElementAddressConfig("banyan.chat.send")).click();

        }
    }

}
