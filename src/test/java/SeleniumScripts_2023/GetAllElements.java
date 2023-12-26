package SeleniumScripts_2023;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetAllElements {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromiumdriver().setup();
		RemoteWebDriver driver=new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
		Thread.sleep(5000);
		
		List<WebElement> list=driver.findElements(By.xpath("//*"));
		System.out.println("Total elements available----->"+list.size());
		int vec=0;
		int iec=0;
		

		for(WebElement e:list)
		{
			if(e.isDisplayed())
			{
				vec=vec+1;
				driver.executeScript("arguments[0].style.border='2px dotted yellow';",e);
			}
			else
			{
				iec=iec+1;
			}
		}
		Thread.sleep(5000);
		System.out.println("Visible elements count is "+vec);
		System.out.println("Invisible(hidden) elements count is "+iec);

	}

}
