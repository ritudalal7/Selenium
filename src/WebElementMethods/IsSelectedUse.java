package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class IsSelectedUse {

		public static void main(String[] args) throws InterruptedException {
			
			System.setProperty("webdriver.chrome.driver", "E:\\Selenium Java\\chromedriver.exe");
		      WebDriver driver=new ChromeDriver();
		      driver.manage().window().maximize();
		      driver.get("https://vctcpune.com/selenium/practice.html");
		      
		      Thread.sleep(1000);
		      WebElement checkBox1=driver.findElement(By.name("checkBoxOption1"));
		      //checkBox.click();
		      if(checkBox1.isSelected())
		      {
		    	  System.out.println("CheckBox is already selected");
		      }
		      else
		      {
		    	  checkBox1.click();
		    	  System.out.println("CheckBox is now selected");
		      }

	}

}
