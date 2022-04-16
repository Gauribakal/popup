package __Lecture;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Alert_popup2 {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\Testing\\Selenium\\ChromeDriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		
		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("abc");
		
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		
		Thread.sleep(2000);
		
		//switch to alert
		Alert alt = driver.switchTo().alert();
		
		String text = alt.getText();     //use to get text present in alert popup
		System.out.println(text);
		
		//alt.dismiss();            //use to click on cancel btn
		
		alt.accept();             //use to click on OK btn
		
		Thread.sleep(2000);
		
		alt.accept();         //use to click on OK btn
			
	}

}
