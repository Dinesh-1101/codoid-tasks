package selenium01;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandleFrames {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		ChromeDriver driver=new ChromeDriver(opt);
		driver.get("https://leafground.com/frame.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement frame = driver.findElement(By.tagName("iframe"));
		driver.switchTo().frame(frame);
		driver.findElement(By.xpath("(//button[text()='Click Me'])[1]")).click();
		driver.switchTo().defaultContent();
		//Nested Frames From Here
		WebElement frame1 = driver.findElement(By.tagName("iframe"));
		driver.switchTo().frame(2);
		WebElement frame2 = driver.findElement(By.id("frame2"));
		driver.switchTo().frame(0);//.frame(frame2);
		driver.findElement(By.id("Click")).click();
		Thread.sleep(4000);
		driver.close();
		
		

	}

}
