package cucumber;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class superClass {

    public WebDriverWait wait;
    String returnValue;

    public WebDriverWait getwaitdriver(WebDriver driver) {
        if (wait == null) {
            wait = new WebDriverWait(driver, 30);
            return wait;
        } else {
            return wait;
        }
    }

    public String getValueFromDataConfig(String value) throws IOException {

        FileReader reader = new FileReader("./src/test/resources/Data.properties");

        Properties p = new Properties();
        p.load(reader);

        returnValue = p.getProperty(value);
        return returnValue;

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
