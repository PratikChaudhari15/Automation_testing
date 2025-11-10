package PopUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class agoda_app_Date_HM {
		public static void main(String[] args) throws InterruptedException {
			ChromeOptions options = new ChromeOptions();
	        options.addArguments("--disable-notifications");
	        ChromeDriver driver = new ChromeDriver(options);
	        driver.manage().window().maximize();

	        driver.get("https://www.agoda.com/");
	        Thread.sleep(4000);
	       
	        driver.findElement(By.xpath("//div[contains(@data-selenium,'checkInBox')]")).click();
	        Thread.sleep(2000);

	        try {
	        	driver.findElement(By.xpath("//button[@aria-label='Previous Month']")).click();
	            Thread.sleep(1000);
	        } catch (Exception e) {
	            System.out.println("today date not found in current month calendar");
	        }

	        Thread.sleep(2000);

	        for (;;) {
	            try {
	            	driver.findElement(By.xpath("//div[contains(@class,'DayPicker-NavButton--next')]")).click();

	                break; 
	            } catch (Exception e) {
	                driver.findElement(By.xpath("//button[@aria-label='Next Month']")).click();
	                Thread.sleep(1000);
	            }
	        }
	        Thread.sleep(2000);
	        driver.close();
		
	}

}
