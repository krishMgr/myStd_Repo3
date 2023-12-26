package Alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test31 {

	public static void main(String[] args) throws Exception{
		WebDriverManager.chromiumdriver().setup();
		RemoteWebDriver driver=new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.javatpoint.com/oprweb/test.jsp?filename=javascript-alert1");
		Thread.sleep(3000);
		driver.switchTo().frame("iframewrapper");
		driver.findElement(By.xpath("//input[@value=\"Click me\"]")).click();
		
		Alert al=driver.switchTo().alert();
		String alertmsg=driver.switchTo().alert().getText();
		System.out.println("Message in alert box: "+alertmsg);
		Thread.sleep(3000);
		al.accept();
		driver.switchTo().defaultContent();
		driver.close();
	}

}
