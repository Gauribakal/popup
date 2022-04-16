package __Lecture;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class hidden_Popup {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\Testing\\Selenium\\ChromeDriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();	
		
		Thread.sleep(2000);
		//click on close button
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		Thread.sleep(2000);
		
		//click on login button
		driver.findElement(By.xpath("//a[text()='Login']")).click();
		
		Thread.sleep(2000);
		//enter UN
		driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("abc");
		
	}

}
