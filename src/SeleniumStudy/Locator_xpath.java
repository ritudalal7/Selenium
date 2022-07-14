package SeleniumStudy;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_xpath {


	public static void main(String[] args)
	{
		
    System.setProperty("webdriver.chrome.driver", "E:\\\\Selenium Java\\\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://vctcpune.com/selenium/practice.html");
	driver.findElement(By.xpath("//input[@value='Radio3']")).click();
	driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("Hi Ritu");
//	driver.findElement(By.xpath(//h2[contains(text(),'Velocity Corporate');
	
	
	
	
	}

}
