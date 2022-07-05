package popups;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import demo.ListBox;



public class AlertPoup {
	
	
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");

		 WebDriver driver = new ChromeDriver();
		 
		 driver.manage().window().maximize();

		driver.navigate().to("https://www.w3schools.com/js/js_popup.asp");

		Thread.sleep(2000);
		
		
		
//		WebElement alert = driver.findElement(By.xpath("(//a[contains(text(),'Try it Yourself')])[1]"));
//		WebElement confirm = driver.findElement(By.xpath("(//a[contains(text(),'Try it Yourself')])[2]"));
//		WebElement Prompt = driver.findElement(By.xpath("(//a[contains(text(),'Try it Yourself')])[3]"));
//		WebElement LineBreaks = driver.findElement(By.xpath("(//a[contains(text(),'Try it Yourself')])[4]"));
	
//		alert.click();
//		Thread.sleep(1000);
//		confirm.click();
//		Thread.sleep(1000);
//		Prompt.click();
//		Thread.sleep(1000);
//		LineBreaks.click();
		
		List<WebElement> button = driver.findElements(By.xpath("(//a[contains(text(),'Try it Yourself')])"));
		
		for (int i = 0; i< button.size();i++)
		button.get(i).click();
		
		
		
		
		String main= driver.getWindowHandle(); 
		//System.out.println(main);
		
	ArrayList<String> addr = new ArrayList<String>(driver.getWindowHandles());	
	
	driver.switchTo().window(addr.get(4));
	
	Thread.sleep(2000);
	
	driver.switchTo().frame("iframeResult");
	
	
	WebElement TryButton = driver.findElement(By.xpath("//button[contains(text(),'Try it')]"));
	
	TryButton.click();
		
	//driver.switchTo().parentFrame();	
	//driver.switchTo().defaultContent();
		
	

	
	
		
	}
	
	
	

}



//WebElement submit = driver.findElement(By.name("submit"));
//submit.click();
//Thread.sleep(3000);
//

//Alert alt = driver.switchTo().alert();
//String msg = alt.getText();
//System.out.println(msg);


//alt.accept();  // ok, submit, accept, confirm
//alt.dismiss(); // cancel, close
//alt.sendKeys("");  // Input
//alt.getText();   // Alert text
