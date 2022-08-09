package appTest;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Registration {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver","chromedriver");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
	
		WebElement SignUp = driver.findElement(By.xpath("//a[text()='Create new account']"));
		SignUp.click();
		
		//Select day
		WebElement Day = driver.findElement(By.id("day"));
	
		Select ddDay = new Select(Day);
		ddDay.selectByVisibleText("15");
		
		//Select month
		List <WebElement> Months = driver.findElements(By.xpath("//select[@id='month']/option"));
		for (WebElement month: Months) {
			System.out.println(month.getText());
		}
		
		//Select year
		WebElement SelYear = driver.findElement(By.xpath("//select[@id='year']/option[@selected='1']"));
			System.out.println("Selected year is " + SelYear.getText());

		
		//Dynamic xpath for gender
		String GenVal = "Male";
		WebElement DynamicGen = driver.findElement(By.xpath("//label[text()='" + GenVal + "']/following-sibling::input"));
		DynamicGen.click();
	}

}
