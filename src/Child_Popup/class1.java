package Child_Popup;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class class1 {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\Testing\\Selenium\\ChromeDriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://skpatro.github.io/demo/links/");
		
		driver.findElement(By.xpath("//input[@value='New Tab']")).click();
		
		Set<String> allid = driver.getWindowHandles();
	       ArrayList<String> al = new ArrayList<String>(allid);
	       
	       
	      String childwindowID = al.get(1);
	      driver.switchTo().window(childwindowID);
	      Thread.sleep(1000);
	      
	      driver.findElement(By.xpath("(//span[@class='menu-text'])[22]")).click();
	}
}
