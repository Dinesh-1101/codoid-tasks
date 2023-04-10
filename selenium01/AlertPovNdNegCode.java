package selenium01;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AlertPovNdNegCode {

	public static void main(String[] args) {
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		ChromeDriver driver=new ChromeDriver(opt);
		driver.get("https://leafground.com/alert.xhtml;jsessionid=node0em80u7tr0ni0j6ottfcdulu9410236.node0");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[text()='Show']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		driver.findElement(By.xpath("//span[text()='Delete']")).click();
	    driver.findElement(By.xpath("//span[text()='Yes']")).click();	
		driver.findElement(By.xpath("(//span[text()='Show'])[5]")).click();
		Alert alert2 = driver.switchTo().alert();
		System.out.println(alert2.getText());
		alert2.sendKeys("This is dinesh from washermenpet");
		alert.accept();
		driver.quit();
	}

}
