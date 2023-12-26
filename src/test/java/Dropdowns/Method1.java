package Dropdowns;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

//Method 1: By Storing All the Options in List and Iterating Through It

public class Method1 {

	public static void main(String[] args) {
		WebDriverManager.chromiumdriver().setup();
		RemoteWebDriver driver=new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("http://jsbin.com/osebed/2");
		driver.manage().deleteAllCookies();
		
		 WebElement dropdownElement = driver.findElement(By.id("fruits"));
		 List<WebElement> options=dropdownElement.findElements(By.tagName("option"));
		 System.out.println("Total size: "+options.size());
		 System.out.println("******************************************");
		 for(WebElement opt:options) {
			 
			/* if(opt.getText().equals("Apple")) {
				opt.click();
				break;
				 
			 } */
			 System.out.println(opt.getText());
		 }
		 
		 driver.close();

	}

}
