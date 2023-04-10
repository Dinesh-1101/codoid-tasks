package selenium01;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class MenuaAndSubMenu {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		ChromeDriver driver=new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.com/");
		//identify menu
		WebElement drag = driver.findElement(By.xpath("//span[text()='Hello, sign in']"));
		Actions builder = new Actions(driver);
		builder.moveToElement(drag).perform();
		Thread.sleep(3000);
		//locate sub-menu element
		WebElement ele=driver.findElement(By.xpath("//*[text()='Create a List']"));
		//move to element and click
		builder.moveToElement(ele).click().perform();
		System.out.println("Page navigated to: " +driver.getTitle());
		driver.quit();
	}

}


