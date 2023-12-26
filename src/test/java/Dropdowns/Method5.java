package Dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Method5 {

	public static void main(String[] args) throws Exception {
		// Method 5: By Using Actions Class
		
		WebDriverManager.chromiumdriver().setup();
		RemoteWebDriver driver=new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("http://jsbin.com/osebed/2");
		driver.manage().deleteAllCookies();
		
		 WebElement dropdownElement = driver.findElement(By.id("fruits"));
		 WebElement ele=driver.findElement(By.xpath("//option[@value=\"apple\"]"));
		 
		 Actions ac=new Actions(driver);
		 ac.moveToElement(ele).pause(5000).click().build().perform();
		 System.out.println("Clicked Item is: "+ele.getText());
		 	 
		 
		 Thread.sleep(3000);
		 driver.close();

	}

}
