package cucumber;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class superClass {

    public WebDriverWait wait;
    String returnValue;
    public Actions action;

    public WebDriverWait getwaitdriver(WebDriver driver) {
        if (wait == null) {
            wait = new WebDriverWait(driver, 30);
            return wait;
        } else {
            return wait;
        }
    }

    public Actions getActionDriver(WebDriver driver){
        if (action == null) {
            action =  new Actions(driver);
            return action;
        } else {
            return action;
        }
        
    }

    public String getValueFromDataConfig(String value) throws IOException {

        FileReader reader = new FileReader("./src/test/resources/Data.properties");

        Properties p = new Properties();
        p.load(reader);

        returnValue = p.getProperty(value);
        return returnValue;

    }

    public By getValueFromElementAddressConfig(String value) throws IOException {
        FileReader reader = new FileReader("./src/test/resources/elementAddress.properties");

        Properties p = new Properties();
        p.load(reader);

        returnValue = p.getProperty(value);

        By elementByAddress = By.xpath(returnValue);

        //WebElement elementAddress = driver.findElement(By.xpath(returnValue));
        return elementByAddress;

    }

    public static String getAlphaNumericString(int n) {

        // chose a Character random from this String
        String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" + "0123456789" + "abcdefghijklmnopqrstuvxyz";

        // create StringBuffer size of AlphaNumericString
        StringBuilder sb = new StringBuilder(n);

        for (int i = 0; i < n; i++) {

            // generate a random number between
            // 0 to AlphaNumericString variable length
            int index = (int) (AlphaNumericString.length() * Math.random());

            // add Character one by one in end of sb
            sb.append(AlphaNumericString.charAt(index));
        }

        return sb.toString();
    }

}
