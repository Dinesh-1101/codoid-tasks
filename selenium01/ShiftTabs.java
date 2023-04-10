package selenium01;

import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ShiftTabs {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		ChromeDriver driver=new ChromeDriver(opt);
		driver.get("https://www.tutorialspoint.com/about/about_careers.htm");
		// wait of 5 seconds
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		// Keys.Chord string
		String clickl = Keys.chord(Keys.CONTROL,Keys.ENTER);
		// open the link in new tab, Keys.Chord string passed to sendKeys
		driver.findElement(By.xpath("//*[text()='Terms of Use']")).sendKeys(clickl);
		Thread.sleep(1000);
		// hold all window handles in array list
		ArrayList<String> newTb = new ArrayList<String>(driver.getWindowHandles());
		//switch to new tab
		driver.switchTo().window(newTb.get(1));
		System.out.println("Page title of new tab: " + driver.getTitle());
		//switch to parent window
		driver.switchTo().window(newTb.get(0));
		System.out.println("Page title of parent window: " + driver.getTitle());
		driver.quit();
	}

}


