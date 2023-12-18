package Launch_Browsers11;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webdriver_methods {
	
	public static void main(String args[]) 
	{
		
		
	System.setProperty("webdriver.chrome.driver",  "C:\\Selenium\\browser\\chromedriver_win32\\chromedriver.exe");	
		
	
	//To create object of Chromedriver class and give referance of webdriver interface
		WebDriver driver=new ChromeDriver();
		
		//to enter url in get method
		driver.get("https://www.amazon.in/ref=as_li_ss_tl?ie=UTF8&linkCode=ll2&tag=enin-edge-topsites-curate-ana-21&linkId=fbedcb44d04a4bae8eae32722a2f41c2&language=en_IN");
		
		
		
		
		
	}

}
