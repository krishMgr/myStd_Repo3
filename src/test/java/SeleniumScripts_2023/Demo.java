package SeleniumScripts_2023;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo {

	public static void main(String[] args) throws Exception{
		
		//WebDriverManager.chromiumdriver().setup();
		WebDriverManager.chromiumdriver().driverVersion("117.0.5938.89").arch64().setup();
		/*ChromeOptions options=new ChromeOptions();
		options.setBinary("C:\\Users\\Krishna\\Downloads\\chrome-win64");*/
				
		RemoteWebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		//long st=System.currentTimeMillis();
		//driver.get("https://www.flipkart.com");
		
		driver.get("https://www.flipkart.com/mobile-phones-store?fm=neo%2Fmerchandising&iid=M_348d8685-eba3-4309-ba9b-4410790256a8_1_372UD5BXDFYS_MC.ZRQ4DKH28K8J&otracker=hp_rich_navigation_2_1.navigationCard.RICH_NAVIGATION_Mobiles_ZRQ4DKH28K8J&otracker1=hp_rich_navigation_PINNED_neo%2Fmerchandising_NA_NAV_EXPANDABLE_navigationCard_cc_2_L0_view-all&cid=ZRQ4DKH28K8J");
		//long et=System.currentTimeMillis();
		Thread.sleep(4000);
		//driver.findElement(By.xpath("(//div[@class='_3879cV'])[4]")).click();
		
		//Scroll vertically
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,800)");
		
		Thread.sleep(4000);
		//driver.findElement(By.xpath("//img[@alt='VIVO']")).click();
		
		driver.findElement(By.xpath("(//div[@class='_3879cV'])[4]")).click();
		
	/*	//driver.manage().deleteAllCookies();
		System.out.println("Site Launched");
		//System.out.println(et-st);
		Thread.sleep(4000);	
		
		//close banner
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		System.out.println("Close banner");
		//click mobiles
		Thread.sleep(4000);	
		driver.findElement(By.xpath("(//div[text()='Mobiles'])/parent::a")).click();
		System.out.println("Mobiles clicked");
		
		//img[@alt='Electronics']
		
        
	} */
}}
