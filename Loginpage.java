package seleniumSample;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Loginpage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("Login page Screen --> Pass ");
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		System.out.println("Sales Manager screen -- Pass");
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		String title = "My Home | opentaps CRM";
		String homeTitle = driver.getTitle();
		
		if (title.equals(homeTitle)) {
			System.out.println("Home Page");
			
		}
		else
			System.out.println("Not Home Page");
		
		
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Vino");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Prabhu");
	    WebElement drop1 = driver.findElement(By.id("createLeadForm_dataSourceId"));
	    Select drop = new Select(drop1);
	    drop.selectByIndex(4);
	    driver.findElement(By.className("smallSubmit")).click();
	   String userTxt = driver.findElement(By.className("basic-form")).getText();
	   System.out.println("Get the result : " + userTxt);  
	
		
				
		
		
		
	
	
	
	}

}
