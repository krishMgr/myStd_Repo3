package Screenshots;

import java.io.File;

import javax.imageio.ImageIO;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class AshotExample {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromiumdriver().setup();
		RemoteWebDriver driver=new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://selectorshub.com/shadow-dom-in-iframe/");
		Thread.sleep(3000);
		
		// Create an Ashot object and call takeScreenshot() method 
		//if you just want the screenshot for the screen size page.
		
		//Screenshot screenshot = new AShot().takeScreenshot(driver);

		/*
		 But if you want a screenshot of the page bigger then the screen size,
		  call the shootingStrategy() method before calling takeScreenshot() method to set up the policy.
		  Then call a method takeScreenshot() passing the webdriver
		 */
		Screenshot screenshot1 = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);

		ImageIO.write(screenshot1.getImage(), "jpg", new File("./SeleniumScreenshots/s1.jpg"));
		
		System.out.println("Screenshot is captured");
		driver.close();
			

	}

}
