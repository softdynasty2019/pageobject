import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class test {

	 public WebDriver driver;

	@BeforeClass
	public void openBrowser() {

		System.setProperty("webdrive.chrome.driver","C:\\Users\\Md Manunur Rashid\\Desktop\\Selenium\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
	
		driver = new ChromeDriver(options);
		}

	@Test
	public void OperURl() throws IOException  {
		
		driver.get("https://www.amazon.com/");
		
		Actions a=new Actions(driver);
		
		a.moveToElement(driver.findElement(By.id("nav-link-accountList-nav-line-1"))).build().perform();
		
		
		a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("iphone").build().perform();
		
		//a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).sendKeys("iphone").build().perform();
		
		a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).contextClick().build().perform();
		

	}
	
	
	
	
	
	@AfterClass
	public void screenshoot() throws IOException {
DateFormat df = new SimpleDateFormat("yyyyMMdd_HHmmss");
        
		
		Date date = new Date();
		
		
        String dfp = df.format(date);

	
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		FileUtils.copyFile(src, new File("C:\\Users\\Md Manunur Rashid\\Desktop\\Screenshoot\\"+dfp+"_tareq.png"));
		

		
	}
	
	
	

}



