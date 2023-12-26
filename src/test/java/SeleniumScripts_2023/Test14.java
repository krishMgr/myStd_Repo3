package SeleniumScripts_2023;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test14 {

	public static void main(String[] args) throws Exception{
		

		WebDriverManager.chromiumdriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		
		Thread.sleep(3000);
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/html/default.asp");
		driver.manage().deleteAllCookies();
		driver.findElement(By.linkText("Try it Yourself »")).click();
		
		Set<String> whs=driver.getWindowHandles();
		System.out.println(whs);
		
		Thread.sleep(3000);
		//Switch to 2nd tab
		List<String> l= new ArrayList<String>(whs);
		driver.switchTo().window(l.get(1));
		driver.close();
		
		Thread.sleep(3000);
		//Switch back to 1st window
		driver.switchTo().window(l.get(0));
		driver.close();

	}

}
