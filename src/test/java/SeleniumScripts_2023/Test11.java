package SeleniumScripts_2023;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test11 {

	public static void main(String[] args) throws Exception{
		
		WebDriverManager.chromiumdriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		
		Thread.sleep(3000);
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com");
		driver.manage().deleteAllCookies();
		
		String curl=driver.getCurrentUrl();
		String ps=driver.getPageSource();
		
		System.out.println("Current URL is "+curl);
		System.out.println("Pagesource is "+ps);
		
		if(curl.startsWith("https")) {
			System.out.println("Secured Site");
		}
		else if(curl.startsWith("http"))
		{
			System.out.println("Un-Secured Site");
		}
		
		driver.close();

	}

}
