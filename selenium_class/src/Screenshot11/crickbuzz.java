package Screenshot11;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class crickbuzz {


public static void main(String args[]) throws InterruptedException, IOException 
{
	
System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\browser\\chromedriver_win32\\chromedriver.exe");
WebDriver driver=new ChromeDriver();

driver.get("https://www.cricbuzz.com/");
//wait
Thread.sleep(2000);
//find out path of drop down 
WebElement p1=driver.findElement(By.xpath("//div[@class='cb-subnav cb-hm-mnu-itm feature-button cursor-pointer']"));
//create object of select class
Select h1=new Select(p1);
List<WebElement> m1=h1.getOptions();

//for each loop

for(WebElement allprint:m1)
{
	
System.out.println(allprint.getText());
}

        // File screen= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        File p2=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE)	;	   
          System.out.println(p2); 		   
            File n1=new File("C:\\Users\\Omkar\\OneDrive\\Desktop\\screenshot\\sample3.jpg");   
            FileHandler.copy(p2, n1);
FileHandler.copy(p2,n1);
}
	
}
