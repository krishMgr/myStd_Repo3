package Frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test23 {

	public static void main(String[] args)throws Exception{
		WebDriverManager.chromiumdriver().setup();
		RemoteWebDriver driver=new ChromeDriver();

		driver.manage().window().maximize();
		
		
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_input_type_file");
		
		driver.switchTo().frame("iframeResult");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("(//input[@id='myfile'])[1]")).sendKeys("D:\\Charminar.jpg");
		//Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//input[@type=\"submit\"])[1]")).click();
		
		String actres="myfile=a.jpg";
		String expres=driver.findElement(By.xpath("//div[@class=\"w3-container w3-large w3-border\"]")).getText();
		System.out.println(expres);
		driver.switchTo().defaultContent();
	
		driver.close();
		}

}
