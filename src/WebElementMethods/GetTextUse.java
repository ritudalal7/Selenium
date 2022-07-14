package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class GetTextUse {

	public static void main(String[] args) throws InterruptedException {
 
	      System.setProperty("webdriver.chrome.driver", "E:\\Selenium Java\\chromedriver.exe");
	      WebDriver driver=new ChromeDriver();
	      
	      driver.get("https://vctcpune.com/selenium/practice.html");
	      
	      Thread.sleep(1000);
	      
	      //1.
	      
	      System.out.println(driver.findElement(By.xpath("//a[text()='Velocity Corporate Training Center']")).getText());	      

	      //2.
	      String text=driver.findElement(By.xpath("//a[text()='Velocity Corporate Training Center']")).getText();	      
          System.out.println(text);
          
          //3.
          WebElement element=driver.findElement(By.xpath("//a[text()='Velocity Corporate Training Center']"));	      
          System.out.println(element.getText());
          
          
          
	
	}

}
