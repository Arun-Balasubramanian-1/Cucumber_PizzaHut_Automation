package stepdefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	
	@Before
	public void startup() {
		WebDriverManager.firefoxdriver().setup();
		FirefoxOptions ffopt = new FirefoxOptions()
			    .addPreference("dom.webnotifications.enabled", false)
			    .addPreference("geo.enabled", false)
			    .addPreference("geo.provider.use_corelocation", false)
			    .addPreference("geo.prompt.testing", false)
			    .addPreference("geo.prompt.testing.allow", false);
		driver = new FirefoxDriver(ffopt);
		driver.manage().timeouts().implicitlyWait(4000L, TimeUnit.MILLISECONDS);
		driver.manage().window().maximize();
	}
	
	@After
	public void cleanup() {
	//	driver.quit();
	}
}


