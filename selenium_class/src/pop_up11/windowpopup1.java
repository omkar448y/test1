package pop_up11;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowpopup1 
{
	
	public static void main(String[] args) 
	{
		
		        //to call setproperty method
				System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\browser\\chromedriver_win32\\chromedriver.exe");
				
				WebDriver driver=new ChromeDriver();
				//to call get method and open  application
				driver.get("https://skpatro.github.io/demo/links/");
				//to click on new tab
		driver.findElement(By.xpath("//input[@name='NewTab']")).click();
		//to provide the wait
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//we need to change focuse on seleniun main page to window pop up
		
		Set<String> m1=driver.getWindowHandles();
		
		ArrayList<String> n1=new ArrayList<String>(m1);
		String main =n1.get(0);
		String child=n1.get(1);
		
		
		
		//to call window mmethod and his accept child window id
		driver.switchTo().window(child);
	
		
		driver.findElement(By.xpath("(//span[text()='Training'])[1]")).click();
		
		
		
		
	}

}
