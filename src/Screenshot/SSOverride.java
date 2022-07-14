package Screenshot;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org. openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class SSOverride {

		public static void main(String[] args) throws InterruptedException, IOException {
			System.setProperty("webdriver.chrome.driver","E:\\Selenium Java\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://vctcpune.com/selenium/practice.html");
			Thread.sleep(1000);		
		File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    String str=RandomString.make(4);
		File destination=new File("E:\\Screenshot\\Testscreenshot"+str+".png");
		FileHandler.copy(source, destination);
	}

}
