package Demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practical {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\Chrome1\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");

		WebElement searchTextbox = driver.findElement(By.id("twotabsearchtextbox"));
		searchTextbox.sendKeys("iphone 13");
		
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		List<WebElement> products = driver.findElements(By.xpath("//div[@class='sg-col sg-col-4-of-12 sg-col-8-of-16 sg-col-12-of-20 s-list-col-right']"));
		
		
		Thread.sleep(4000);
		for(int i=0;i<products.size();i++)
		{
		  String expStr = products.get(i).getText();
		  if(expStr.contains("Apple iPhone 13 (128GB) - Pink"))
				  {		
		               
		//	  products.get(i).click();
			  driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']")).get(i).click();
			  break;
			 
				  }
		
		}
		String text= driver.findElement(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']")).getText();
		System.out.println(text);
Thread.sleep(2000);
        Set<String> IDs=driver.getWindowHandles();
        
        ArrayList<String> al=new ArrayList<String>(IDs);
        
        //to get main page ID
             String MainpageID=al.get(0);
             System.out.println(MainpageID);
             
         //To get window pop-up ID
              String  ChildwindowID=al.get(1);
              System.out.println(ChildwindowID);
  
 
  //shift focus of selenium on window pop-up
        driver.switchTo().window(ChildwindowID);
		
		
		
		
		WebElement addToCartButton = driver.findElement(By.xpath("//input[@id='add-to-cart-button']"));
		addToCartButton.click();
		
		WebElement cartButton = driver.findElement(By.cssSelector("#nav-cart-count-container"));
		cartButton.click();
		
		WebElement cartItem = driver.findElement(By.xpath("(//span[text()='Apple iPhone 13 (128GB) - Pink'])[1]"));
		
		System.out.println(cartItem.getText());
		
		
		
		
		
		
		Thread.sleep(2000);
		driver.close();
	}

}
