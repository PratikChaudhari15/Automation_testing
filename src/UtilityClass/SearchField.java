package UtilityClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SearchField extends BaseClass {
	public static void main(String[] args) throws Exception {
		String passed_data = "Mobile";
		
		preConditions();
		Thread.sleep(2000);
		login();
		Thread.sleep(2000);
		WebElement field = driver.findElement(By.id("small-searchterms"));
		
		field.sendKeys(passed_data);
		Thread.sleep(2000);
		String current_data = field.getAttribute("value");
		if(passed_data.equals(current_data)) {
			System.out.println("Testcase pass");
		}
		else {
			postCondition1();
			throw new Exception("Data is not Found And TestCase is fail");
		}
		Thread.sleep(2000);
		logout();
		Thread.sleep(3000);
		postCondition2();
	}
}
