package Dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

//Method 3: By Using JavaScriptExecutor Class
public class Method3 {

	public static void main(String[] args) {
		WebDriverManager.chromiumdriver().setup();
		RemoteWebDriver driver=new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("http://jsbin.com/osebed/2");
		
		 WebElement dropdownElement = driver.findElement(By.id("fruits"));
		 
		 JavascriptExecutor js=(JavascriptExecutor) driver;
		 String elementText = (String) js.executeScript("return arguments[0].innerText;", dropdownElement);
		 //String elementText = (String) js.executeScript("return arguments[0].innerText;", dropdownElement);

		 System.out.println(elementText);
		 driver.close();
	}

}
