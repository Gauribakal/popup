package __Lecture;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Child_Popup {

	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\Testing\\Selenium\\ChromeDriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get("https://skpatro.github.io/demo/links/");
		
		
		//click on new tab from main page
		driver.findElement(By.xpath("//input[@name='NewTab']")).click();
		
		//get child window ID
		Set<String> allIds = driver.getWindowHandles();     //[mainPageId  childWindowID]
		ArrayList<String> al=new ArrayList<String>(allIds);  //[mainPageId(0) childWindowID(1)]
		
		String childWindowID = al.get(1);
		
		//switch to child window
		driver.switchTo().window(childWindowID);         //String windowID
		
		
		Thread.sleep(10000);
		
		//click training link from child window
		driver.findElement(By.xpath("(//span[text()='Training'])[1]")).click();
		
		
	}

}
