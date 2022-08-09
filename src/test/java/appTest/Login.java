package appTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","chromedriver");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
	
		//Add email
		WebElement UserName = driver.findElement(By.xpath("//input[@id='email']"));
		UserName.sendKeys("Abc@xys.com");
		
		//Add password
		WebElement Password = driver.findElement(By.xpath("//input[@id='pass']"));
		Password.sendKeys("Abc1234!");
		
		//Click button to login
		WebElement LoginBtn = driver.findElement(By.xpath("//button[@name='login']"));
		LoginBtn.click();

	}

}
