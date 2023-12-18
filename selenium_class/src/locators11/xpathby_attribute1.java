package locators11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathby_attribute1 
{
	
	public static void main(String args[]) 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\browser\\chromedriver_win32\\chromedriver.exe" );
	
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fref%3Dnav_custrec_signin%3Fie%3DUTF8%26linkCode%3Dll2%26tag%3Denin-edge-topsites-curate-ana-21%26linkId%3Dfbedcb44d04a4bae8eae32722a2f41c2%26language%3Den_IN&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
		
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("9309813989");
		
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Omkar@123");
		
		driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
		
	}
	
	
	
	
	

}
