package Alert_Popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class class1 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\Testing\\Selenium\\ChromeDriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("abc");
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		String text = driver.switchTo().alert().getText();
		System.out.println(text);
		
		driver.switchTo().alert().accept();
		
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
	}
}
