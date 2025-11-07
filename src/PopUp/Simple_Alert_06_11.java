package PopUp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import UtilityClass.BaseClass;
public class Simple_Alert_06_11 extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
		preConditions();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='Search']")).click();
		Thread.sleep(2000);
		Alert alt = driver.switchTo().alert();
		alt.accept();
		
		postCondition2();
	}
}
