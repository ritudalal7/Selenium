package Popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUp {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\Selenium Java\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts");
		Thread.sleep(2000);
		
		driver.findElement(By.id("alertButton")).click();
		
		//1.to handle alert pop up we need to switch selenium focus from main 
		
		Alert alt = driver.switchTo().alert();
		
	//2. alert is an interface which containd abstract method like;
		//1.Accept() method --use to click on button
	    //2.dismiss() method --		use to click on cancel button
        //3.getText method--use to get text present in a alert popup
		
		System.out.println(alt.getText());
		alt.accept();
	//	alt.dismiss();
		
		
		
		

 }
}
