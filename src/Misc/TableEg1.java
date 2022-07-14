package Misc;

import java.io.IOException;
import java.util .Iterator;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableEg1 {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","E:\\Selenium Java\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(1000);	
		
		//how to find no of rows in table
		
		List<WebElement>rows=driver.findElements(By.xpath("//table//tr"));
		int totalNumOfRows=rows.size();
		System.out.println("Total no of rows in table "+totalNumOfRows);
		
		//how to find no of columns  in table
		
		List<WebElement>columns= driver.findElements(By.xpath("//table//tr[1]//th"));
		int totalNumOfColumns=columns.size();
		System.out.println("Total no of columns are "+totalNumOfColumns);
		
		//how to read no of headers
		
		for(WebElement header:columns)
		{
			
			System.out.println(header.getText()+"");
			
		}
		//How to read all rows from table
		
		List<WebElement>allrowsData=driver.findElements(By.xpath("//table//tr"));
		
		Iterator<WebElement>it=allrowsData.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next().getText()+"");
			System.out.println();
		}
	}

}
