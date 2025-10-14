package VerifyPage;

import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyDisplay {

	public static void main(String[] args) 
	{
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		
		
		
	}
.
}
