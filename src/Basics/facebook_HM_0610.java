package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook_HM_0610 {

//	•	Open the browser
//	•	Maximazie browser
//	•	Enter into facebook landing page
//	•	After entring click creste new acc button
//	•	Fill all the details of Signup page 
//	•	Close the browser

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(@id,'u_0_0_')]")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[contains(@id,'u_0_8_')]")).sendKeys("Pratik");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[contains(@id,'u_0_a_')]")).sendKeys("Chaudhari");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//select[contains(@id,'day')]")).sendKeys("15");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//select[contains(@id,'month')]")).sendKeys("Apr");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//select[contains(@id,'year')]")).sendKeys("2003");
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("input[name='sex'][value='2']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[contains(@id,'u_0_h_')]")).sendKeys("9235348326"); 
		Thread.sleep(2000);
		
		driver.findElement(By.id("password_step_input")).sendKeys("Pratik@1536");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[contains(@id,'u_0_n_')]")).click(); 
		
		Thread.sleep(7000);
		driver.close();
	}

}
