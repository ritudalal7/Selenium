package WebDriverMethods;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	
	public class WebDriverMethodUse {

	
	public static void main(String[] args) 
	{
    System.setProperty("webdriver.chrome.driver","E:\\Selenium Java\\chromedriver.exe");
    
    WebDriver driver=new ChromeDriver();
    
		//1.get-->to enter url in browser or to open an application.
      driver.get("https://www.google.co.in/");
       
       //2.close-->to close the current tab of the browser opened by selenium tool.
     //  driver.close();
		
       //3.quit:to close the all tab of the browser opened by selenium tool.
      // driver.quit();
		
       //4.maximize / minimize--> used to maximize and minimize the browser
       
       driver.manage().window().maximize();
     //  driver.manage().window().minimize();
       
       
       //5.navigate-->tthis method is use to open an application,move fprward...
       
       driver.navigate().to("https://www.google.com");
       driver.navigate().back();
       driver.navigate().forward();
       driver.navigate().refresh();
       
     //  6.getTitle->  thus method is use to take title of webpage ,return type is string
       
       System.out.println(driver.getTitle());
       String title=driver.getTitle();
       System.out.println(title);

    //7.getUrl--->this method is use to get url of webpage ,retirn type is string
       
       System.out.println(driver.getCurrentUrl());

       
	}

}