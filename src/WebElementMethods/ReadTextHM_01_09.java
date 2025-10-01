package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

//Write a script for demo application 
//Open the browser 
//Maximize the browser 
//Enter into dws site 
//After entering read the text of the community poll which is present inside


public class ReadTextHM_01_09 {

	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(3000);
		
		String poll = driver.findElement(By.className("poll-display-text")).getText();
		System.out.println(poll);
		
		Thread.sleep(3000);
		driver.close();
		
	}

}
