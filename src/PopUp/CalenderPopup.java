package PopUp;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CalenderPopup {
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeOptions options= new ChromeOptions();
		options.addArguments("--disabled-notifications");
		ChromeDriver driver= new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.easemytrip.com/");
		Thread.sleep(2000);
		driver.findElement(By.id("ddate")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("08/11/2025")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("divRtnCal")).click();
		Thread.sleep(2000);
		//driver.findElement(By.id("10/11/2025")).click();
		
		//To take return date after months
		for(;;) 
		{
			try 
			{
				driver.findElement(By.id("fst_3_01/07/2026")).click();
				break;
			}
		catch(Exception e)
		   {
			driver.findElement(By.id("img2Nex")).click();
			}
		Thread.sleep(2000);
	   }
		driver.findElement(By.className("srchBtnSe")).click();
	}
}
