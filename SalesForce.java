package week2.day1;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesForce {

	public static void main(String[] args) {
		// Step 1: Download and set the path 
		WebDriverManager.chromedriver().setup();
		// Step 2: Launch the chromebrowser
		ChromeDriver driver = new ChromeDriver();
		// Step 3: Load the URL 
		           https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk
	  driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");  	   
		// Step 4: Maximise the window
	  driver.manage().window().maximize();        	   
		// Step 5: Add implicit wait
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// Step 6: Fill in all the text boxes
	  driver.findElement(By.name("UserFirstName")).sendKeys("First Name");
	  driver.findElement(By.name("UserLastName")).sendKeys("Last Name");
	  driver.findElement(By.name("UserEmail")).sendKeys("Work@test.com");
	  driver.findElement(By.name("CompanyName")).sendKeys("Comp Name");
	  driver.findElement(By.name("UserPhone")).sendKeys("9898989898");
		// Step 7: Handle all the dropdowns
		WebElement title = driver.findElement(By.name("UserTitle"));  
		Select tit = new Select(title);
		tit.selectByIndex(5);
	//	System.out.println("Job tile :" + tit);
		// Step 8: Click the check box
		WebElement comp = driver.findElement(By.name("CompanyEmployees"));	      
		Select com = new Select(comp);
				com.selectByIndex(3);
				WebElement coun = driver.findElement(By.name("CompanyCountry"));
				Select cou = new Select(coun);
				cou.selectByIndex(12);
		// Step 9: Close the browser
				driver.close();
		// *Note: No need click Start my freeTrial
	}

}
