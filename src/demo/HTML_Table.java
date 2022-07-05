package demo;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HTML_Table 
{
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");

		 WebDriver driver = new ChromeDriver();
		 
		 driver.manage().window().maximize();

		driver.navigate().to("https://www.w3schools.com/html/html_tables.asp");

		Thread.sleep(7000);
		
		List <WebElement> tableData=driver.findElements(By.xpath("//table[@id=\"customers\"]//tr//td"));
	
		
		for (int i =0; i<tableData.size(); i++)
			{
				WebElement td = tableData.get(i);
			
				
				String text =td.getText();
			
				System.out.println(text);
			}
}   
	
	
	
}
