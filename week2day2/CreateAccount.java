package w2.week2day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) {
		
		
		ChromeOptions options =new ChromeOptions();
		options.addArguments("guest");
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("DemoCSR");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Accounts")).click();
		
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.name("accountName")).sendKeys("ABC");
		driver.findElement(By.className("inputBox")).sendKeys("Selenium Automation Tester.");
		
		WebElement industry = driver.findElement(By.name("industryEnumId")); 
		Select options1 = new Select(industry);
		options1.selectByValue("IND_SOFTWARE");
		
		WebElement ownership = driver.findElement(By.name("ownershipEnumId"));
		Select options2 = new Select(ownership);
		options2.selectByVisibleText("S-Corporation");
		
		WebElement source = driver.findElement(By.name("dataSourceId"));
		Select options3 = new Select(source);
		options3.selectByValue("LEAD_EMPLOYEE");
		
		WebElement marketingCampaign = driver.findElement(By.name("marketingCampaignId"));
		Select options4 = new Select(marketingCampaign);
		options4.selectByIndex(6);
		
		WebElement state = driver.findElement(By.name("generalStateProvinceGeoId"));
		Select options5 = new Select(state);
		options5.selectByValue("TX");
		
		driver.findElement(By.className("smallSubmit")).click();
		
		driver.close();
		
		
		
	}
	
	//
	//

}
