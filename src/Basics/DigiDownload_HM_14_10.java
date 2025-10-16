package Basics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DigiDownload_HM_14_10 {

//	•	Open the browser
//	•	Maximize browser
//	•	Enter into the DWS home page
//	•	Click digital downloads
//	•	After clicking Digital Download 
//	•	Add all the products inside the shopping cart
//	•	After adding remove the products which is having higitest price
//	•	After removing the products 
//	•	Verify the product is successfully remove is not from cart
//	•	Close the browser
	
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.navigate().to("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Digital downloads")).click();
		
		List<WebElement> input =driver.findElements(By.xpath("//div[@class='product-grid']/div/div/div[2]/div[3]/div[2]/input"));
		for(WebElement web : input)
		{
			web.click();
			Thread.sleep(2000);
		}
		driver.findElement(By.className("ico-cart")).click();
		Thread.sleep(2000);
		
		 // ✅ Step 3: Collect all product prices
        List<WebElement> priceElements = driver.findElements(By.xpath("//span[@class='product-unit-price']"));
        List<Double> prices = new ArrayList<>();

        for (WebElement p : priceElements) {
            String text = p.getText().replace("$", "").trim();
            prices.add(Double.parseDouble(text));
        }

        System.out.println("All Prices in Cart: " + prices);

        // ✅ Step 4: Find the maximum price
        double maxPrice = Collections.max(prices);
        System.out.println("Highest Price: " + maxPrice);
        Thread.sleep(2000);
        // ✅ Step 5: Remove the product having highest price
        // Get all rows of products
        List<WebElement> rows = driver.findElements(By.xpath("//tr[@class='cart-item-row']"));
        Thread.sleep(2000);
        for (WebElement row : rows) {
            String priceText = row.findElement(By.xpath(".//span[@class='product-unit-price']")).getText().replace("$", "").trim();
            double currentPrice = Double.parseDouble(priceText);

            if (currentPrice == maxPrice) {
                // Click the remove checkbox and update the cart
                row.findElement(By.xpath(".//input[@name='removefromcart']")).click();
                Thread.sleep(2000);
                driver.findElement(By.name("updatecart")).click();
                Thread.sleep(2000);
                System.out.println("Removed product with price: $" + currentPrice);
                break;
            }
            Thread.sleep(3000);
		
		driver.close();
	}
	}
}

