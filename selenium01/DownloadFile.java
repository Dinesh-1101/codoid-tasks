package selenium01;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DownloadFile {

	public static void main(String[] args) {
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		ChromeDriver driver=new ChromeDriver(opt);
		driver.get("https://www.leafground.com/file.xhtml;jsessionid=node0hmz11dco8gebts7jjbpgmpxz199736.node0");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.xpath("//span[text()='Download']")).click();
		File filelocation=new File("C:\\Users\\91824\\Downloads");
		File[] listFiles = filelocation.listFiles();
		for (File file : listFiles) {
			if (file.getName().contains("TestLeaf Logo")) {
				System.out.println("File Successfull Downloaded");
				break;
			}
		}
	}

}
