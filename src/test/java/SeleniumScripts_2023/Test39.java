package SeleniumScripts_2023;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test39 {

	public static void main(String[] args) throws Exception{
		WebDriverManager.chromiumdriver().setup();
		RemoteWebDriver driver=new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		driver.switchTo().activeElement().sendKeys("rk",Keys.TAB);
		Thread.sleep(3000);
		driver.switchTo().activeElement().sendKeys("krish",Keys.TAB,Keys.TAB);
		Thread.sleep(3000);
		driver.switchTo().activeElement().click();
	}

}
