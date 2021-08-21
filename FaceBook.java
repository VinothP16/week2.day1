package week2.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBook {

	public static void main(String[] args) {
		// Step 1: Download and set the path 
		WebDriverManager.chromedriver().setup();
		// Step 2: Launch the chromebrowser
		ChromeDriver driver = new ChromeDriver();
		// Step 3: Load the URL https://en-gb.facebook.com/
		driver.get("https://en-gb.facebook.com");
		// Step 4: Maximise the window
		driver.manage().window().maximize();
		// Step 5: Add implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// Step 6: Click on Create New Account button
		driver.findElement(By.linkText("Create New Account")).click();
		// Step 7: Enter the first name
		driver.findElement(By.name("firstname")).sendKeys("Vinoth");
		// Step 8: Enter the last name
		driver.findElement(By.name("lastname")).sendKeys("Prabh");
		// Step 9: Enter the mobile number
		driver.findElement(By.name("reg_email__")).sendKeys("999999999");
		// Step 10: Enter the password
		driver.findElement(By.name("reg_passwd__")).sendKeys("Pra@12345");
		// Step 11: Handle all the three drop downs
		driver.findElement(By.id("day")).sendKeys("20;");
		driver.findElement(By.id("month")).sendKeys("Aug");
		driver.findElement(By.id("year")).sendKeys("1980");
		// Step 12: Select the radio button "Female"
		driver.findElement(By.className("_58mt")).click();
		 //  ( A normal click will do for this step) 

	}

}
