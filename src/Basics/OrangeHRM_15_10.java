package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRM_15_10 {

//	•	Open the browswe
//	•	Maximize the browser
//	•	Enter into OrangeHRM page
//	•	Perform login
//	•	After performing login 
//	•	Pass admin inside the searchfield 
//	•	Verify the wheather the admin is displayed in the page or not
//	•	After thet perform logout
//	•	After performing logout close the broswer
	
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		driver.findElement(By.name("username")).sendKeys("Admin");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("admin123");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".oxd-button.oxd-button--medium.oxd-button--main.orangehrm-login-button")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.cssSelector(".oxd-input.oxd-input--active")).sendKeys("admin");
		
		driver.findElement(By.className("oxd-main-menu-item")).click();
		
		if(driver.findElement(By.xpath("//span[text()='Admin']")).isDisplayed()) {

			System.out.println("Admin is present testscript is pass");

			}else

			{

			System.out.println("Admin is not present testscript is failed");

			}


			Thread.sleep(3000);
		
		driver.findElement(By.className("oxd-userdropdown-tab")).click();
		Thread.sleep(1000);
		driver.findElement(By.className("oxd-userdropdown-link")).click();
		
		Thread.sleep(3000);
		driver.close();
		
	}

}
