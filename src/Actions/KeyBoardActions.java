package Actions;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardActions {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","E:\\Selenium Java\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(2000);	
		
		//Find Element
		
		WebElement textBox=driver.findElement(By.id("autocomplete"));
		
	//	textBox.sendKeys("Good Morning");  //-->using web element methods
		
		//////How to send key using Actions class//////
		
	//Create object of actions class and pass driver object
		
		Actions act=new Actions(driver);
		
	//using sendkeys method of actions class perform sendkeys task
		
	//	act.sendKeys(textBox,"Good Morning").perform();
		
	//How to handle drop down using Action class
		
		WebElement dropDown=driver.findElement(By.name("dropdown-class-example"));
		
	//using actions class method handle  drop down
		
		act.click(dropDown).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		
		

	}

}
