package pop_up11;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class window_popup {
	public static void main(String[] args) throws InterruptedException, IOException
	{
		
		//to call setproperty method
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\browser\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		//to call get method and open  application
		driver.get("https://skpatro.github.io/demo/links/");
		
	//to click on new tab
		driver.findElement(By.xpath("//input[@name='NewTab']")).click();
		
		
		//to provide wait
		//Thread.sleep(5000);
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//to call getwindowhandles method to idenntify ID of Window pop ups and main page
		
		Set<String> n1=driver.getWindowHandles();
		//to use array use because index structure 
		ArrayList<String> m1=new ArrayList<String>(n1);
		
		
		//to call get method and pass index
		
	    String MAINPAGE=m1.get(0);
		System.out.println(MAINPAGE);
		
	    String childpage=m1.get(1);	
		System.out.println(childpage);
		
		
		
		//to change focuse main page to window pop up
		driver.switchTo().window(childpage);
		
		//to click on traning element
		driver.findElement(By.xpath("//span[text()='Training']")).click();
		Thread.sleep(3000);
		//to focuse back on main page again
		driver.switchTo().window(MAINPAGE);

}
}