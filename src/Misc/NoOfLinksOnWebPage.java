package Misc;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class NoOfLinksOnWebPage {

		public static void main(String[] args) throws InterruptedException, IOException {
			System.setProperty("webdriver.chrome.driver","E:\\Selenium Java\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://vctcpune.com/selenium/practice.html");
			Thread.sleep(1000);		

			List<WebElement>links=driver.findElements(By.tagName("a")); 
			
			System.out.println(links.size());
			
			Iterator<WebElement>it=links.iterator();
			while(it.hasNext())
			{
				System.out.println(it.next().getText());
			}
	}

}
