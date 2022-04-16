package Child_Popup;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class class3 {

	
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\Testing\\Selenium\\ChromeDriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://skpatro.github.io/demo/links/");
		
		driver.findElement(By.xpath("//input[@value='New Tab']")).click();
		
		Set<String> allid = driver.getWindowHandles();
		ArrayList<String> al = new ArrayList<String>(allid);
		
		String childwindowid = al.get(1);
		
		driver.switchTo().window(childwindowid);
		
		driver.findElement(By.xpath("\"(//span[text()='Training'])[1]\"")).click();
	}
}
