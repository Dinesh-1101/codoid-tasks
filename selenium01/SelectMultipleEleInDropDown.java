package selenium01;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class SelectMultipleEleInDropDown {

	public static void main(String[] args) {
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		ChromeDriver driver=new ChromeDriver(opt);
		driver.get("https://theautomationzone.blogspot.com/2020/07/basic-dropdown.html?m=1");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement findElement = driver.findElement(By.id("cars"));
		Select dd=new Select(findElement);
		dd.selectByIndex(0);
		dd.selectByIndex(3);
		dd.selectByIndex(2);
		List<WebElement> allSelectedOptions = dd.getAllSelectedOptions();
		for (WebElement webElement : allSelectedOptions) {
			System.out.println(webElement.getText());
		}
	}

}
