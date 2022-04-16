package __Lecture;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildPopup_Switch_to_mainPage {

	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\Testing\\Selenium\\ChromeDriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get("https://skpatro.github.io/demo/links/");
		
		
		//click on new tab from main page
		driver.findElement(By.xpath("//input[@name='NewTab']")).click();
		
		//get child window id
		Set<String> allIDS = driver.getWindowHandles();
		ArrayList<String> al=new ArrayList<String>(allIDS);
		
		//switch to child window
		driver.switchTo().window(al.get(1));
		
		//click on training link from child window
		driver.findElement(By.xpath("(//span[text()='Training'])[1]")).click();
		
				
		Thread.sleep(3000);
		
		//switch to main page
		driver.switchTo().window(al.get(0));
		
		Thread.sleep(3000);
		
		//click on new window btn from main page
		driver.findElement(By.xpath("//input[@name='NewWindow']")).click();
		
	
		
	}
}
