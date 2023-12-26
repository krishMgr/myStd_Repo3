package Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test26 {

	public static void main(String[] args) throws Exception{
		WebDriverManager.chromiumdriver().setup();
		RemoteWebDriver driver=new ChromeDriver();

		driver.manage().window().maximize();
		
		
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_form_submit");
		Thread.sleep(5000);
		driver.switchTo().frame(1);
		driver.findElement(By.name("fname")).clear();
		driver.findElement(By.name("fname")).sendKeys("rama");
		driver.findElement(By.name("lname")).clear();
		driver.findElement(By.name("lname")).sendKeys("rao");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
		driver.switchTo().defaultContent();
	
		//driver.close();
		}

}
