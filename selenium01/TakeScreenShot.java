package selenium01;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;

public class TakeScreenShot {

	public static void main(String[] args) throws IOException {
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		ChromeDriver driver=new ChromeDriver(opt);
		driver.get("https://dribbble.com/shots/21149486-Logo-design-Letter-S-Brand-identity");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		File source = driver.getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Users\\91824\\Downloads\\imgr.png");
		FileHandler.copy(source, dest);
	}

}
