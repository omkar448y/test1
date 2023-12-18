package webelements11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webelements {
	
	public static void main(String args[]) 
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\browser\\chromedriver_win32\\chromedriver.exe" );
		
		
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C550525805682%7Ce%7Cfb%20%27%7C&placement=&creative=550525805682&keyword=fb%20%27&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696221592%26matchtype%3De%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-431331344637%26loc_physical_ms%3D9062114%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=Cj0KCQjw6pOTBhCTARIsAHF23fJvraAwOux6jdkc3ocVUGVsvQa-ZKYtidfNjGHum_cGgqJMkJCJWUEaAqXaEALw_wcB");
		
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("omkar");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("yadav");

		String s2=driver.findElement(By.xpath("//div[@class='mbs _52lq _9bp_ fsl fwb fcb']")).getText();
		System.out.println(s2);
		
		
		boolean s3=driver.findElement(By.xpath("(//button[text()='Sign Up'])[1]")).isEnabled();
		System.out.println(s3);
		
		boolean s4=driver.findElement(By.xpath("//label[text()='Female']")).isSelected();
		System.out.println(s4);
		
		
		boolean s5=driver.findElement(By.xpath("//img[@class='fb_logo _registrationPage__fbLogo img']")).isDisplayed();
		System.out.println(s5);
		
	}

}
