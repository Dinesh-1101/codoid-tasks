package selenium01;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MultipleWebElement {

	public static void main(String[] args) {
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		ChromeDriver driver=new ChromeDriver(opt);
		driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=58355126069&hvpone=&hvptwo=&hvadid=610644601173&hvpos=&hvnetw=g&hvrand=4736360225448978234&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9061981&hvtargid=kwd-10573980&hydadcr=14453_2316415");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		List<WebElement> findElements = driver.findElements(By.id("searchDropdownBox"));
		for (WebElement webElement : findElements) {
			System.out.println(webElement.getText());
		}
	}

}

