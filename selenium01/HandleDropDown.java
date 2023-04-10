package selenium01;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class HandleDropDown {

	public static void main(String[] args) {
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		ChromeDriver driver=new ChromeDriver(opt);
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		driver.findElement(By.name("firstname")).sendKeys("abc");
		driver.findElement(By.name("lastname")).sendKeys("xyz");
		driver.findElement(By.name("reg_email__")).sendKeys("xyz@gmail.com");
		driver.findElement(By.xpath("(//input[@type='text'])[5]")).sendKeys("xyz@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("9791119021");
		WebElement birthday=driver.findElement(By.name("birthday_day"));
		Select dob=new Select(birthday);
		dob.selectByVisibleText("1");
		WebElement birthMonth=driver.findElement(By.id("month"));
		Select mob=new Select(birthMonth);
		mob.selectByVisibleText("Oct");
		WebElement birthYear=driver.findElement(By.name("birthday_year"));
		Select yob=new Select(birthYear);
		yob.selectByVisibleText("2001");
		driver.findElement(By.name("sex")).click();
		driver.findElement(By.name("websubmit")).click();

	}

}
