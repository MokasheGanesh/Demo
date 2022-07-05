package demo;




import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class TestClass 
{
	
	public static void main(String[] args) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
//		driver.get("https://chromedriver.chromium.org/downloads");
//		
//		Thread.sleep(3000);
		
		driver.navigate().to("https://www.facebook.com");
		
		Thread.sleep(3000);
		
		WebElement Button = driver.findElement(By.xpath("//a[text()='Create New Account']"));
		
	//	Button.click();
		
		
	//gender.sendKeys("text");
		
		String Actualtext = Button.getText();  // to get the text present on the element 
		
		String expected= "Expected text";
		
		System.out.println(Actualtext);
		
	
		if (Actualtext.equals(expected))
		{
			System.out.println(" Test case is Passed");
		}
		else {
			
			System.out.println(" Test case is Failed");
		}
		
		
		String ActualValue = Button.getAttribute("placeholder");  // to get the attribute value of the given attribute 
		
		
		
	}

}
