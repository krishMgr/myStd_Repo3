package SeleniumScripts_2023;

import java.util.Scanner;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test6CrossbrowserTesting {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Browser name");
		String bn=sc.nextLine();
		sc.close();
		
		RemoteWebDriver driver=null;
		
		if(bn.equals("Chrome")) {
			WebDriverManager.chromiumdriver().setup();
			driver=new ChromeDriver();
			
			System.out.println("Opens Chrome browser");
		}
		
		else if(bn.equals("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			System.out.println("Opens FF browser");
		}
		
		else if(bn.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
			System.out.println("Opens edge browser");
		}
		
		else {
			
			System.out.println("Please enter correct browser name");
			System.exit(0);
		}
		
	}

}
