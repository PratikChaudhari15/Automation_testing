package Basics;

import org.openqa.selenium.chrome.ChromeDriver;

public class Ecom {
	public static void main( String []args)
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.close();
	}
}
