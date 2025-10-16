package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTextField_15_10 {

	public static void main(String[] args) throws Exception {
		String data = "Selenium";
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demowebshop.tricentis.com/");
		Thread.sleep(3000);
		WebElement searchField = driver.findElement(By.id("small-searchterms"));
		searchField.sendKeys(data);
		String currentData = searchField.getAttribute("value");
		if(data.equals(currentData))
		{
			System.out.println("both Are equal and testCase is pass");
		}
		else {
			driver.close();
			throw new Exception("both are not equal and Test case is failed");
		}
		driver.close();
		
	}

}
