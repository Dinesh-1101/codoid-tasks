package testNg;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import selenium.DataUtills;

public class DataProvider extends DataUtills {
//	@org.testng.annotations.DataProvider  (name="array")
//	public String[][] provider(){
//		String[][] data=new String[2][2];
//		data[0][0]="Demosalesmanager";
//		data[0][1]="crmsfa";
//		data[1][0]="Demosalesmanager";
//		data[1][1]="crmsfa";
//		return data;
//		
//	}
	@Test(dataProvider="array")
/*	also use dataprovierclass to inherit another class 
 * that is
 * @Test(dataProvider="array",dataProviderClass = DataUtills.class)*/
//	public void speaker(String userName,String Pass) {
	public void speaker(String []data) {
		System.out.println("email== "+data[0]);
		System.out.println("email== "+data[1]);
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		ChromeDriver driver=new ChromeDriver(opt);
		driver.get("http://leaftaps.com/opentaps/contro l/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys(data[0]);
		driver.findElement(By.id("password")).sendKeys(data[1]);
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.quit();
}
}