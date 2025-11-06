package UtilityClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class registerLink_verify extends BaseClass {
	public static void main(String[] args) throws InterruptedException {
		preConditions();
		Thread.sleep(2000);
//		login();
//		Thread.sleep(2000);
		WebElement registerLink = driver.findElement(By.className("ico-register"));
		if (registerLink.isDisplayed()) {
            System.out.println("Regiser link is displayed on the home page.");
        } else {
            System.out.println("Register link is NOT displayed on the home page.");
        }
//		Thread.sleep(2000);
//		logout();
		Thread.sleep(3000);
		postCondition2();
	}
}
