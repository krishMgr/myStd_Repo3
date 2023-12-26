package SeleniumScripts_2023;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test45 {

	public static void main(String[] args) {
		WebDriverManager.chromiumdriver().setup();
		RemoteWebDriver driver=new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.espncricinfo.com/series/icc-men-s-t20-world-cup-2022-23-1298134/points-table-standings");
		driver.manage().deleteAllCookies();
		
		//Get all tables in Page
		List<WebElement> tables=driver.findElements(By.xpath("//table/tbody"));
		System.out.println("Total no: of Tables-----> "+tables.size());
		System.out.println("*********************************************");
		
		//Goto each table and get all rows
		for(int i=0;i<tables.size();i++)
		{
			List<WebElement> rows=tables.get(i).findElements(By.xpath("child::tr"));
			System.out.println(rows.size()+" rows in table-"+i);
			System.out.println("---------------");
			
			//collect all cols in each row
			for(int j=0;j<rows.size();j++)
			{
				List<WebElement> cols=rows.get(j).findElements(By.xpath("child::td"));
				System.out.println(cols.size()+" cols in row-"+j);
				
				//Goto each col to get value
				for(int k=0;k<cols.size();k++)
				{
					System.out.print(cols.get(k).getText()+", ");
				}
				System.out.println();
			}
		}
		driver.close();
	}

}
