package ShadowElements;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test32 {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromiumdriver().setup();
		RemoteWebDriver driver=new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://selectorshub.com/shadow-dom-in-iframe/");
		Thread.sleep(3000);
		
		driver.switchTo().frame("pact");
		WebElement ShadowHostElement=driver.findElement(By.id("snacktime"));
		SearchContext ShadowRootElement=ShadowHostElement.getShadowRoot();
		WebElement targetelement=ShadowRootElement.findElement(By.className("food"));
		try {
			targetelement.click();
		}
		catch(JavascriptException e)
		{
			driver.executeScript("arguments[0].click();", targetelement);
		}
		driver.switchTo().defaultContent();
		System.out.println("***************Clicked Testers Food link***************");
		
	}

}
