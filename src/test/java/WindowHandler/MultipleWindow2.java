package WindowHandler;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleWindow2 {

	public static void main(String[] args) {
		WebDriverManager.chromiumdriver().setup();
		RemoteWebDriver driver=new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		driver.manage().deleteAllCookies();
		
		FluentWait<RemoteWebDriver> fwait=new FluentWait<RemoteWebDriver>(driver);
		fwait.withTimeout(Duration.ofSeconds(20));
		fwait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@id=\"login_Layer\"]"))).click();
		
		String parentwindow=driver.getWindowHandle();
		System.out.println("Parent Window Handle : "+parentwindow);
		
		Set<String> s=driver.getWindowHandles();
		System.out.println("Child Window Handle : "+s);
		
		Iterator<String> i1=s.iterator();
		
		while(i1.hasNext()) {
			
			String childwindow=i1.next();
			if(!parentwindow.equalsIgnoreCase(childwindow)) {
				driver.switchTo().window(childwindow);
				System.out.println(driver.switchTo().window(childwindow).getTitle());
				
//				WebElement text=driver.findElement(By.linkText("Register for free"));
//				System.out.println("Child Text: "+text.getText());
				driver.close();
			}
		}
		driver.switchTo().window(parentwindow);
		driver.close();

	}

}
