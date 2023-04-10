package testNg;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTest {
	RemoteWebDriver driver;
	@Parameters({"Search","browser","searchable"})
	@Test
	void crossBrowser(String browser,String Search,String searchable) {
		switch (browser) {
		case "chrome":
			ChromeOptions opt=new ChromeOptions();
			opt.addArguments("--remote-allow-origins=*");
			driver=new ChromeDriver();
			break;
		case "firefox":
			FirefoxOptions opt2=new FirefoxOptions();
			
		
			driver=new FirefoxDriver();
			break;

		default:
			System.err.println("Something went wrong");
			break;
		}
		driver.get(Search);
		driver.findElement(By.name("q")).sendKeys("searchable");
		
	}

}
