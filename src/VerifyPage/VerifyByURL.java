package VerifyPage;

import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyByURL {

	public static void main(String[] args) {
		
		String expected_url="https://demowebshop.tricentis.com/";
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		String actual_url = driver.getCurrentUrl();
		System.out.println("Current Url : " + actual_url);
		if(expected_url.equals(actual_url))
		{
			System.out.println("I am in targeted PAge");
			System.out.println("ready to do Action");
		}
		else
		{
			System.out.println("i am not in tageted page");
			System.out.println("i am finding Some Defect");
		}
		driver.close();
	}

}
