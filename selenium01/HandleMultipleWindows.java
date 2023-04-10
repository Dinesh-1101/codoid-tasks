package selenium01;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandleMultipleWindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		ChromeDriver driver=new ChromeDriver(opt);
		driver.get("https://letcode.in/windows");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.findElement(By.id("multi")).click();
		System.out.println("Initial Parent Window "+driver.getCurrentUrl());
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> list=new ArrayList<String>(windowHandles);
		driver.switchTo().window(list.get(1));
		System.out.println("Child Window "+driver.getCurrentUrl());
		driver.switchTo().window(list.get(0));
		System.out.println("Again Parent Window "+driver.getCurrentUrl());
		
//		FirefoxOptions opt3=new FirefoxOptions();
//		opt3.addArguments("--remote-allow-origins=*");
//		FirefoxDriver driver=new FirefoxDriver(opt3);
//		
//		ChromeOptions opt=new ChromeOptions();
//		opt.addArguments("--remote-allow-origins=*");
//		ChromeDriver driver=new ChromeDriver(opt);

	}

}
