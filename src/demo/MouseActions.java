package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActions
{
	public static void main(String[] args) throws InterruptedException {
		
	

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");

	 WebDriver driver = new ChromeDriver();


	driver.navigate().to("https://demoqa.com/droppable/");

	Thread.sleep(5000);
	
	WebElement Source = driver.findElement(By.xpath("//div[@id='draggable']"));
	
	WebElement Dest = driver.findElement(By.xpath("//div[@id='droppable']"));
		
		Actions act = new Actions(driver);
		
		act.dragAndDrop(Source, Dest).perform();
		
		
		
		
		
		
		
		
		
		//act.moveToElement(SignIn).click().build().perform();
		
		//act.contextClick().perform();
		
		
		
		/*act.click();
		act.contextClick();
		act.moveToElement(Button).click().build().perform();
		
		act.build();
		act.perform();
		*/
		
		
		
		
	
	}
	
	
}
