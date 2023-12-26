package Dropdowns;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownExample {

	public static void main(String[] args) {
		WebDriverManager.chromiumdriver().setup();
		RemoteWebDriver driver=new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("http://jsbin.com/osebed/2");
		driver.manage().deleteAllCookies();

        // Locate the dropdown element by its id
       // WebElement dropdownElement = driver.findElement(By.id("fruits"));

        // Create a Select object around the dropdown element
        Select select = new Select(driver.findElement(By.id("fruits")));

        // Use the select object to interact with the dropdown
        //  can select options by index, value, or visible text
        //select.selectByValue("grape");
        select.selectByIndex(2);
        

        // Get the selected option
        WebElement selectedOption = select.getFirstSelectedOption();
        System.out.println("Selected option: " + selectedOption.getText());
        System.out.println("***************************");
        
        List<WebElement> options=select.getOptions();
        System.out.println("Total size in dd: "+options.size());
        System.out.println("***************************");
    
        // Loop through the options and print their text values
        for (WebElement option : options) {
            System.out.println(option.getText());
        }
        System.out.println("***************************");
        // can also use getWrappedElement to get the original WebElement
        WebElement wrappedElement = select.getWrappedElement();
        System.out.println("Wrapped element tag name: " + wrappedElement.getTagName());

        // Close the browser
        driver.close();
	}
}
