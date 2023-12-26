package SeleniumScripts_2023;

import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test5 {

	public static void main(String[] args) throws Exception {
	
		WebDriver driver=WebDriverManager.chromiumdriver().create();
		
		Thread.sleep(5000);
		driver.get("https://www.google.com/");
		System.out.println("Site Launched and closed");

	}

}
