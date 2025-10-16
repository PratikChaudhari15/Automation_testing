package VerifyPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyDisplay {

	public static void main(String[] args) throws Exception
	{
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		
		WebElement register = driver.findElement(By.className("ico-register"));
		if(register.isDisplayed())
		{
			register.click();
			System.out.println("pass");
		}
		else
		{
			driver.close();
			throw new Exception("Register is Not Displayed and Testcase is failed");
		}

		driver.close();	
	}
}
