package w2.week2day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookRegistration {

	
	public static void main(String[] args) {
	
		ChromeDriver driver = new ChromeDriver();   //Launch Browser
		driver.get("https://en-gb.facebook.com/");		//Load URl
		driver.manage().window().maximize();                //Maximize the window
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //Set Implicit Wait
		
		driver.findElement(By.linkText("Create new account")).click(); //Click on Create New Account button
		driver.findElement(By.name("firstname")).sendKeys("Delphine");
		driver.findElement(By.name("lastname")).sendKeys("Bosco");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("delphinemedo@gmail.com");
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("Passwod@123");
		driver.findElement(By.xpath("//input[@value='1']")).click();
		
		WebElement day = driver.findElement(By.id("day"));
		Select options=new Select(day);
		options.selectByValue("1");
		
		WebElement month = driver.findElement(By.id("month"));
		Select options1=new Select(month);
		options1.selectByVisibleText("Jun");
		
		WebElement year = driver.findElement(By.id("year"));
		Select options2=new Select(year);
		options2.selectByVisibleText("1998");
		
		
		
		
	}

}
