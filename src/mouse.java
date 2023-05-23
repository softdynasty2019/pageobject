import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class mouse {

	public static void main(String[] args) {

		System.setProperty("webdrive.chrome.driver",
				"C:\\Users\\Md Manunur Rashid\\Desktop\\Selenium\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.com/");
		
		Actions a=new Actions(driver);
		
		a.moveToElement(driver.findElement(By.id("nav-link-accountList-nav-line-1"))).build().perform();
		
		
		a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("iphone").build().perform();
		
		//a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).sendKeys("iphone").build().perform();
		
		a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).contextClick().build().perform();
		
		
		//jhkjhjhkjhkjhhou
		//Employee from Bangladesh
		

	}

}
