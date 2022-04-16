package __Lecture;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_popup {

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
		
		String text = driver.switchTo().alert().getText();       //get text from alert popup
		System.out.println(text);
		
		//driver.switchTo().alert().dismiss();            //click on Cancel btn
		
		driver.switchTo().alert().accept();          //click on OK btn
		
		Thread.sleep(2000);
		
		driver.switchTo().alert().accept();          //click on OK btn
		
		
		
		
	}
}
