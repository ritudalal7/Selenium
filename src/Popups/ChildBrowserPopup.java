package Popups;

import java.sql.Driver;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\Selenium Java\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://skpatro.github.io/demo/links");
		Thread.sleep(2000);
		
		String mainPageID=driver.getWindowHandle();  //D OF MAIN PAGE
		System.out.println(mainPageID);
		System.out.println("===========================");
		
		//to open child window
		
		driver.findElement(By.name("New Tab")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.name("New Window")).click();
		Thread.sleep(2000);
		
		//to handle multiple windows/to get multiple ids
		
		Set<String>allPageIDs=driver.getWindowHandles();	
		
		Iterator<String> it=allPageIDs.iterator();
		
		//while(it.hasNext())
		//{
		//	System.out.println(it.next());
		//}
		String mainPageId=it.next();//will return main page it
		String childPageId=it.next();//will return child page id
		
		//to switch focus to child window
		
		driver.switchTo().window(childPageId);//changing focus from main page to child page
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("Selenium");
	//	driver.close();//will close only current focus tab
	//	driver.quit();//will close all tabs/pages opened by selenium
		
		driver.switchTo().window(mainPageId);
		WebElement myElement=driver.findElement(By.xpath("//p[text()='Click below to open link in new tab']"));
		
		System.out.println(myElement.getText());
		
		
		
		
		
		
		
		
		
	}

}
