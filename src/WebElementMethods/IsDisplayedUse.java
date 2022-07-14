package WebElementMethods;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayedUse {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Java\\chromedriver.exe");
	      WebDriver driver=new ChromeDriver();
	   //   driver.manage().window().maximize();
	      driver.get("https://vctcpune.com/selenium/practice.html");
	      
	      Thread.sleep(1000);
	      
	      WebElement hide=driver.findElement(By.id("hide-txtbox"));
	      WebElement show=driver.findElement(By.id("show-txtbox"));
	      WebElement textbox=driver.findElement(By.name("show-hide"));
	      
	      if(textbox.isDisplayed())
	      {
	    	  System.out.println("Thankyou text box is diplayed");
	      }
	      else
	      {
	    	  System.out.println("cant find text box");
	      }
	      hide.click();
	      if(textbox.isDisplayed())
	      {
	    	  System.out.println("Thankyou text box is displayed");
	      }
	      else
	      {
	    	  System.out.println("cant find text box");
	      }
	      
         

	}

}
//not run on website