package week2.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeCheckbox {

	public static void main(String[] args) {
		
		 
		   //   1. Download and set the path 	 
		      WebDriverManager.chromedriver().setup();
		      ChromeDriver driver = new ChromeDriver();
		 	  // 2.. Launch URL "http://www.leafground.com/"
		 	 driver.get("http://www.leafground.com/");
		 	driver.manage().window().maximize();
		 	 //  2. Click on CheckBox
		 	 driver.findElement(By.linkText("Checkbox")).click();
		 	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 	 
		 	// 3. Select the Options for Select the languages that you know?
		 	  driver.findElement(By.xpath("//input[@type='checkbox'[2]]")).click();
		 	 //  4. Confirm Selenium is Checked 
		 	  
		 	 // 5.  DeSelect IamSelected CheckBox
		 	
		 	 // 6. Select all the checkBoxes Available in (Select all below checkBoxes) 
		 

	}

}
