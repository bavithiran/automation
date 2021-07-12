package stepDefinitions;

import java.io.FileReader;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.ExcelPageTest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.junit.Cucumber;
import io.github.bonigarcia.wdm.WebDriverManager;

@RunWith(Cucumber.class)
public class stepDefs {

	WebDriver driver;

	@Given("^Access WebDriverManager$")
	public void access_WebdriverManager() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}

	@Given("^TestFrameWork$")
	public void TestFrameWork() throws Exception {

		System.out.println("Launching Test.............");
		// Launch_NewstuckApp();

	}

	@Given("^Read Excel$")
	public void Read_Excel() throws Exception {

		FileReader reader = new FileReader("./src/test/resources/configExcel.properties");

		Properties p = new Properties();
		p.load(reader);

		String excelFilePath = p.getProperty("excelFilePath");
		String sheetName = p.getProperty("sheetName");
		String totalColsString = p.getProperty("totalCols");
		int totalCols = Integer.parseInt(totalColsString);

		String[][] exceldata = ExcelPageTest.readExcelInto2DArray(excelFilePath, sheetName, totalCols);
		System.out.println(Arrays.deepToString(exceldata));
	}

	@Given("^Find all the links in the HomePage$")
	public void find_all_the_links_in_the_homepage() {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		// Launching sample website
		driver.get("https://www.onemindindia.com/home");
		driver.manage().window().maximize();

		// Get list of web-elements with tagName - a
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));

		// Traversing through the list and printing its text along with link address
		for (WebElement link : allLinks) {
			System.out.println(link.getText() + " - " + link.getAttribute("href"));
		}

		// Commenting driver.quit() for user to easily verify the links
		// driver.quit();
		driver.quit();

	}

	@Given("^Search for a text in Homewebpage$")
	public void search_for_a_text_in_Homewebpage() {

		// Launching sample website
		driver.get("https://stageomistrg.z30.web.core.windows.net/home");
		// driver.get("https://www.onemindindia.com/home");
		driver.getWindowHandle();
		driver.manage().window().maximize();
		if (driver.getPageSource().contains("One Mind India") || driver.getPageSource().contains("OMI")
				|| driver.getPageSource().contains("OneMind India")
				|| driver.getPageSource().contains("OneMindIndia")) {

			// Click xyz
			System.out.println("Text Found");
		}

		else {
			// Click abc
			System.out.println("Can't able to find text");
		}
		driver.close();

	}

	@Given("^Search word in AboutUsPage$")
	public void search_aboutUsPage() {
		// Launching sample website
		driver.get("https://stageomistrg.z30.web.core.windows.net/aboutUs");
		driver.manage().window().maximize();
		if (driver.getPageSource().contains("One Mind India") || driver.getPageSource().contains("OMI")
				|| driver.getPageSource().contains("OneMind India")
				|| driver.getPageSource().contains("OneMindIndia")) {

			// Click xyz
			System.out.println("Text Found");
		}

		else {
			// Click abc
			System.out.println("Can't able to find text");
		}
		driver.close();

	}

	@Given("^Search word in OurPortfolios$")
	public void search_OurPortfolios() {
		// Launching sample website
		driver.get("https://stageomistrg.z30.web.core.windows.net/products");
		driver.manage().window().maximize();
		if (driver.getPageSource().contains("One Mind India") || driver.getPageSource().contains("OMI")
				|| driver.getPageSource().contains("OneMind India")
				|| driver.getPageSource().contains("OneMindIndia")) {

			// Click xyz
			System.out.println("Text Found");
		}

		else {
			// Click abc
			System.out.println("Can't able to find text");
		}
		driver.close();

	}

	@Given("^Search word in LifeAtPro$")
	public void search_LifeAtPro() {
		// Launching sample website
		driver.get("https://stageomistrg.z30.web.core.windows.net/lifePRO");
		driver.manage().window().maximize();
		if (driver.getPageSource().contains("One Mind India") || driver.getPageSource().contains("OMI")
				|| driver.getPageSource().contains("OneMind India")
				|| driver.getPageSource().contains("OneMindIndia")) {

			// Click xyz
			System.out.println("Text Found");
		}

		else {
			// Click abc
			System.out.println("Can't able to find text");
		}
		driver.close();

	}

	@Given("^Search word in Careers$")
	public void search_Careers() {

		// Launching sample website
		driver.get("https://stageomistrg.z30.web.core.windows.net/careers");
		driver.manage().window().maximize();
		if (driver.getPageSource().contains("One Mind India") || driver.getPageSource().contains("OMI")
				|| driver.getPageSource().contains("OneMind India")
				|| driver.getPageSource().contains("OneMindIndia")) {

			// Click xyz
			System.out.println("Text Found");
		}

		else {
			// Click abc
			System.out.println("Can't able to find text");
		}
		driver.quit();

	}

	@Then("^Quit browser$")
	public void quit_browser() {

	}

}
