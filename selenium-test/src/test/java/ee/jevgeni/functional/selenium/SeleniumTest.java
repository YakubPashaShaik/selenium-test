package ee.jevgeni.functional.selenium;

import java.io.File;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * 
 * @author Jevgeni Marenkov
 * 
 */

public class SeleniumTest {
	private WebDriver driver;
	private String baseUrl;
	private StringBuffer verificationErrors = new StringBuffer();

	@Before
	public void setUp() throws Exception {
		FirefoxBinary binary = new FirefoxBinary(new File(
				"C://Program Files (x86)//Mozilla Firefox//firefox.exe"));
		driver = new FirefoxDriver(binary, null);
		baseUrl = "http://jevgenimarenkov.blogspot.com";
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Test
	public void testJUnitWebDrivver() throws Exception {
		driver.get(baseUrl + "/");
		driver.findElement(By.cssSelector("a.profile-name-link")).click();
		assertEquals("On Blogger since September 2010",
				driver.findElement(By.cssSelector("p.sidebar-item.item-key"))
						.getText());
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
		String verificationErrorString = verificationErrors.toString();
		if (!"".equals(verificationErrorString)) {
			fail(verificationErrorString);
		}
	}

}
