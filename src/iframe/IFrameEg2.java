package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrameEg2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\Selenium Java\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		
		driver.get("https://skpatro.github.io/demo/iframes");
		driver.manage().window().maximize();

		//Thread.sleep(5000);
		String text=driver.findElement(By.linkText("Pavilion")).getText();
		System.out.println(text);
		
	 //   driver.switchTo().frame("Frame1");//changing focus from main page to frame 1

		
		//driver.switchTo().frame(0);
	    String text1=driver.findElement(By.linkText("Blogger")).getText();
		System.out.println(text1);
		
		driver.switchTo().frame(0);
		Thread.sleep(2000);

		
		String text2=driver.findElement(By.id("Frametext")).getText();
		System.out.println(text2);
		
		String title=driver.switchTo().defaultContent().getTitle();
		System.out.println("Now focus should be on main page"+title);
		driver.close();

		
 }

	private static Object defaultContent() {
		// TODO Auto-generated method stub
		return null;
	}

}