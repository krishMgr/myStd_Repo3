package SeleniumScripts_2023;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo1 {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromiumdriver().driverVersion("117.0.5938.89").arch64().setup();
		
		RemoteWebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.com/gift-cards/b/?ie=UTF8&node=2238192011&ref_=nav_cs_gc");
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//span[@class='a-size-base a-color-base'])[7]")).click();

	}

}
