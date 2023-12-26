package SeleniumScripts_2023;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test9 {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromiumdriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		
		Thread.sleep(3000);
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com");
		driver.manage().deleteAllCookies();
		String title=driver.getTitle();
		System.out.println("Title of the page is:  " +title);
		driver.quit();

	}

}
