package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Example1 {
  @Test
  public void Test1() throws InterruptedException {
	  
	    System.setProperty("webdriver.chrome.driver","E:\\Selenium Java\\chromedriver.exe");
	    //WebDriver.manage().window().maximize();
		WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com");
		Thread.sleep(1000);		
		
		Reporter.log("YOLO(You only live once)",true);
		System.out.println("Itry till die");
		
  }
}