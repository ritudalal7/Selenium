package Actions;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsEg1 {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","E:\\Selenium Java\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		Thread.sleep(1000);	
		
		WebElement seleniumButton=driver.findElement(By.linkText("Selenium"));
		
	//	seleniumButton.click();  // ---->using webelement method
		
		//How to click using action class
		//create object of actions class and pass driver object
		
		Actions act=new Actions(driver);
		
		///////using one of the required actions complete the process//////
		
	//	act.moveToElement(seleniumButton).perform();
	//	act.click().perform();
		
	//act.moveToElement(seleniumButton).click().build().perform();
		
	// act.click(seleniumButton).perform();
		
		//////How to right click(contextClick)using actions class//////
		
		WebElement rightClickButton=driver.findElement(By.xpath("//span[text()='right click me']"));
		
		//act.moveToElement(rightClickButton).contextClick().build().perform();
		
		//act.contextClick(rightClickButton).perform();		
		
		
	////// how to double click using actions class	///////////
		
		WebElement doubleClickButton=driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		
	//	act.moveToElement(doubleClickButton).doubleClick().build().perform();
		
		act.doubleClick(doubleClickButton).perform();
		
		
		
		
		
		
		
		
		
		

	}

}
