package SeleniumScripts_2023;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test17 {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromiumdriver().setup();
		RemoteWebDriver driver=new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("http://gmail.com");
		Thread.sleep(3000);
		//driver.manage().deleteAllCookies();
		
		driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("ktest5806@gmail.com");
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//span[@class='VfPpkd-vQzf8d'])[2]")).click();
		//driver.findElement(By.xpath("(//span[text()='Next'])/parent::button")).click();
		
		
	}

}
