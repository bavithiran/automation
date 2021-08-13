package cucumber;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class mainPageForBanyan extends superClass {
        WebDriverWait wait;
        WebDriver driver;

        public void clickLoginBanyan(WebDriver driver) throws IOException {
                getwaitdriver(driver).until(ExpectedConditions
                                .visibilityOfElementLocated(getValueFromElementAddressConfig("banyan.login")));
                driver.findElement(getValueFromElementAddressConfig("banyan.login")).click();
        }

        public void clickChatTabBanyan(WebDriver driver) throws IOException {
                getwaitdriver(driver).until(ExpectedConditions
                                .visibilityOfElementLocated(getValueFromElementAddressConfig("banyan.tab.chat")));
                driver.findElement(getValueFromElementAddressConfig("banyan.tab.chat")).click();
        }

        public void clickChatUser(WebDriver driver) throws IOException {
                getwaitdriver(driver).until(ExpectedConditions
                                .visibilityOfElementLocated(getValueFromElementAddressConfig("banyan.chat.user")));
                driver.findElement(getValueFromElementAddressConfig("banyan.chat.user")).click();
        }

        public void typeMessage(WebDriver driver) throws IOException {
                getwaitdriver(driver).until(ExpectedConditions.visibilityOfElementLocated(
                                getValueFromElementAddressConfig("banyan.chat.typeamessage")));
                driver.findElement(getValueFromElementAddressConfig("banyan.chat.typeamessage"))
                                .sendKeys("This is a test message");

        }

        public void clickSendButtonBanyan(WebDriver driver) throws IOException {
                getwaitdriver(driver).until(ExpectedConditions
                                .visibilityOfElementLocated(getValueFromElementAddressConfig("banyan.chat.send")));
                driver.findElement(getValueFromElementAddressConfig("banyan.chat.send")).click();
        }

        public void sendMessageMultipleTimes(WebDriver driver) throws IOException {
                for (int i = 0; i < 10; i++) {
                        getwaitdriver(driver).until(ExpectedConditions.visibilityOfElementLocated(
                                        getValueFromElementAddressConfig("banyan.chat.typeamessage")));
                        driver.findElement(getValueFromElementAddressConfig("banyan.chat.typeamessage"))
                                        .sendKeys("This is a test message for times :" + i);

                        getwaitdriver(driver).until(ExpectedConditions.visibilityOfElementLocated(
                                        getValueFromElementAddressConfig("banyan.chat.send")));
                        driver.findElement(getValueFromElementAddressConfig("banyan.chat.send")).click();

                }
        }

        public void clickEventTabBanyan(WebDriver driver) throws IOException {
                getwaitdriver(driver).until(ExpectedConditions
                                .visibilityOfElementLocated(getValueFromElementAddressConfig("banyan.tab.event")));
                driver.findElement(getValueFromElementAddressConfig("banyan.tab.event")).click();
        }

        public void eventCreation(WebDriver driver) throws IOException, InterruptedException {

                // Move to event tab
                getwaitdriver(driver).until(ExpectedConditions
                                .visibilityOfElementLocated(getValueFromElementAddressConfig("banyan.tab.event")));
                driver.findElement(getValueFromElementAddressConfig("banyan.tab.event")).click();

                // Click add for event creation page
                getwaitdriver(driver).until(ExpectedConditions
                                .visibilityOfElementLocated(getValueFromElementAddressConfig("banyan.eventpage.add")));
                driver.findElement(getValueFromElementAddressConfig("banyan.eventpage.add")).click();

                // Enter title for event creation page
                getwaitdriver(driver).until(ExpectedConditions.visibilityOfElementLocated(
                                getValueFromElementAddressConfig("banyan.eventCreation.title")));
                driver.findElement(getValueFromElementAddressConfig("banyan.eventCreation.title")).sendKeys("Enter title");

                // Enter location for event creation page
                getwaitdriver(driver).until(ExpectedConditions.visibilityOfElementLocated(
                                getValueFromElementAddressConfig("banyan.eventCreation.location")));
                driver.findElement(getValueFromElementAddressConfig("banyan.eventCreation.location")).sendKeys("Enter location");

                // Enter details for event creation page
                getwaitdriver(driver).until(ExpectedConditions.visibilityOfElementLocated(
                                getValueFromElementAddressConfig("banyan.eventCreation.details")));
                driver.findElement(getValueFromElementAddressConfig("banyan.eventCreation.details")).sendKeys("Enter details");

                // Click add for participant add
                getwaitdriver(driver).until(ExpectedConditions.visibilityOfElementLocated(
                                getValueFromElementAddressConfig("banyan.eventCreationPage.button.addParticipant")));
                driver.findElement(getValueFromElementAddressConfig("banyan.eventCreationPage.button.addParticipant"))
                                .click();

                // Get list of users
                getwaitdriver(driver).until(ExpectedConditions.visibilityOfElementLocated(
                                getValueFromElementAddressConfig("banyan.event.listOfUser")));

                List<WebElement> users = driver
                                .findElements(getValueFromElementAddressConfig("banyan.event.listOfUser"));

                for (WebElement Singleuser : users) {
                        // Singleuser.getText();
                        System.out.println(Singleuser.getText());

                }

                // Participant select
                getwaitdriver(driver).until(ExpectedConditions.visibilityOfElementLocated(
                                getValueFromElementAddressConfig("banyan.ParticipantSelect.bavithiranRamesh")));
                driver.findElement(getValueFromElementAddressConfig("banyan.ParticipantSelect.bavithiranRamesh"))
                                .click();

                                Thread.sleep(2000);

                // Click add guest
                getwaitdriver(driver).until(ExpectedConditions.visibilityOfElementLocated(
                                getValueFromElementAddressConfig("banyan.eventCreation.AddGuestTitle")));
                driver.findElement(getValueFromElementAddressConfig("banyan.eventCreation.AddGuestTitle"))
                                .click();

                // Click save icon
                getwaitdriver(driver).until(ExpectedConditions.visibilityOfElementLocated(
                                getValueFromElementAddressConfig("banyan.eventCreation.saveIcon")));
                driver.findElement(getValueFromElementAddressConfig("banyan.eventCreation.saveIcon")).click();

        }

}
