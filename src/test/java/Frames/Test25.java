package Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test25 {

	public static void main(String[] args) throws Exception{
		WebDriverManager.chromiumdriver().setup();
		RemoteWebDriver driver=new ChromeDriver();

		driver.manage().window().maximize();
		
		
		driver.get("http://www.maths.surrey.ac.uk/explore/nigelspages/frame2.htm");
		Thread.sleep(5000);
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//a[normalize-space()='Background']")).click();
		driver.switchTo().defaultContent();
		
		Thread.sleep(3000);
		driver.switchTo().frame(1);
		driver.findElement(By.xpath("//textarea[@name=\"suggestions\"]")).sendKeys("selenium");
		driver.findElement(By.name("reset")).click();
		driver.switchTo().defaultContent();
		
		Thread.sleep(5000);
		driver.switchTo().frame(2);
		driver.findElement(By.xpath("(//a[normalize-space()='TRY CODING'])[1]")).click();
		driver.switchTo().defaultContent();
	
		driver.close();
		}

}
