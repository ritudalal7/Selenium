package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeyUse {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "E:\\\\Selenium Java\\\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://vctcpune.com/selenium/practice.html");
			
			driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("velocity");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@id='autocomplete']")).clear();
			//Thread.sleep(5000);

			//driver.findElement(By.xpath("//input[@value='Radio2']")).click();
	}
	

}
