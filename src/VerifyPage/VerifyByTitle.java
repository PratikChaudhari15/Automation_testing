package VerifyPage;

import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyByTitle {

	public static void main(String[] args) throws Exception {
		
		String expected_title="Demo Web Shop";
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		String actual_title = driver.getTitle();
		System.out.println("Current title : " + actual_title);
		if(expected_title.equals(actual_title))
		{
			System.out.println("I am in targeted PAge");
			System.out.println("ready to do Action");
		}
		else
		{
			System.out.println("i am not in tageted page");
			driver.close();
			throw new Exception("I am Finding Defect");
		}
		driver.close();
	}
}
