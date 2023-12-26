package SeleniumScripts_2023;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DynamicXpath {

	public static void main(String[] args) throws Exception{
		WebDriverManager.chromiumdriver().driverVersion("117.0.5938.89").arch64().setup();
		
		RemoteWebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		//driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://www.google.com/");
		
		driver.findElement(By.name("q")).sendKeys("java");
		
		
		FluentWait<RemoteWebDriver> fwait=new FluentWait<RemoteWebDriver>(driver);
		fwait.withTimeout(Duration.ofSeconds(20));
		fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[normalize-space()='java']")));
		
		List<WebElement> list=driver.findElements(By.xpath("//span[normalize-space()='java']"));
		System.out.println("Total number of Suggestions:--->"+ list.size());
		
		driver.close();

	}

}
