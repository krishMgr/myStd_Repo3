package SeleniumScripts_2023;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetAllLinks {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromiumdriver().setup();
		RemoteWebDriver driver=new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
		Thread.sleep(5000);
		
		//List<WebElement> list=driver.findElements(By.xpath("//a"));
		List<WebElement> list=driver.findElements(By.tagName("a"));
		System.out.println("Total links available----->"+list.size());
		int vlink=0;
		int ilink=0;
		

		for(WebElement e:list)
		{
			if(e.isDisplayed())
			{
				vlink=vlink+1;
				driver.executeScript("arguments[0].style.border='2px dotted green';",e);
			}
			else
			{
				ilink=ilink+1;
			}
		}
		Thread.sleep(5000);
		System.out.println("Visible links count is "+vlink);
		System.out.println("Invisible(hidden) links count is "+ilink);

	}

}
