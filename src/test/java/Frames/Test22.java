package Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test22 {

	public static void main(String[] args)throws Exception{
		WebDriverManager.chromiumdriver().setup();
		RemoteWebDriver driver=new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/iframe");
		driver.manage().deleteAllCookies();
		
		driver.switchTo().frame("mce_0_ifr");
		//String x=driver.findElement(By.xpath("//body[@class=\"mce-content-body \"]/child::p")).getText();
		
		String x=driver.findElement(By.tagName("p")).getText();
		System.out.println("Text present in the box is :"+x);
		driver.switchTo().defaultContent();
		
		Thread.sleep(2000);
		driver.close();
		}

}
