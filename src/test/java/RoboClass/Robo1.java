package RoboClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Robo1 {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromiumdriver().setup();
		RemoteWebDriver driver=new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://sourceforge.net/auth/");
		driver.manage().deleteAllCookies();
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@placeholder=\"Username\"]")).sendKeys("Rama");
		Robot r= new Robot();
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
		//driver.findElement(By.xpath("//input[@placeholder=\"Password\"]")).sendKeys("rk");

	}

}
