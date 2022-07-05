package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUp_Down
{
	
		public static void main(String[] args) throws InterruptedException {
			
		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");

		 WebDriver driver = new ChromeDriver();
		 
		 driver.manage().window().maximize();

		driver.navigate().to("https://jqueryui.com/position/");

		Thread.sleep(5000);
		
		WebElement element = driver.findElement(By.xpath("//a[text()='Widget Factory']"));
		
	
		
		JavascriptExecutor  js= (JavascriptExecutor)driver;
		
		js.executeScript("window.scrollBy(0,800)");  //Scroll Down
		
		Thread.sleep(5000);
		
		js.executeScript("window.scrollBy(0,-300)");  //Scroll Up
		
		js.executeScript("window.scrollBy(500,0)");   // Scroll Right
		
		js.executeScript("window.scrollBy(-500,0)");   // Scroll Left
		
	
		
		
		
		
		js.executeScript("arguments[0].scrollIntoView(true);", element);
			
		
		/*Hidden Division Popup
		 * Alert Popup
		 * Child Browser popup
		 * File Upload  popup
		 * File Download popup
		 --
		 */
		
		
	}

}
