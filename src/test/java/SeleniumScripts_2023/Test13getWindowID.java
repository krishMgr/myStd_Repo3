package SeleniumScripts_2023;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test13getWindowID {

	public static void main(String[] args) throws Exception {
		
		
		WebDriverManager.chromiumdriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		
		Thread.sleep(3000);
		driver.manage().window().maximize();
		driver.get("http://www.sentia.in");
		driver.manage().deleteAllCookies();
		
		String wh=driver.getWindowHandle();
		System.out.println("Window Handle ID "+wh);
		driver.close();
		

	}

}
