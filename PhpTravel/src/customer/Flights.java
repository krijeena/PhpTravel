package customer;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Flights extends Setup {


	@Test
	public static void Flight() throws InterruptedException {
		
		driver.findElement(By.xpath("(//a[@class='nav-link fadeout  waves-effect'])[1]")).click();
		
//		driver.findElement(By.id("one-way")).click();
//		driver.findElement(By.id("round-trip")).click();
	
//	new 	driver.findElement(By.xpath("(//input[@class='form-check-input m-0'])[1]")).click(); 

//		Select fType=new Select(driver.findElement(By.xpath("//select[@class='flight_type form-select form-select-sm px-3']")));
		Select fType=new Select(driver.findElement(By.xpath("//select[@class='flight_type form-select form-select-sm px-3 rounded-2 border']")));
		fType.selectByValue("economy_premium");
		Thread.sleep(2000);

		driver.findElement(By.xpath("(//span[@class='select2-selection select2-selection--single'])[1]")).click();
//	Ber	driver.findElement(By.xpath("(//div[@class='d-flex align-items-center p-2 to--insert overflow-hidden'])[3]")).click();
		driver.findElement(By.xpath("(//div[@class='d-flex align-items-center p-2 to--insert overflow-hidden'])[2]")).click();
		

		driver.findElement(By.xpath("(//span[@class='select2-selection select2-selection--single'])[2]")).click();
//	NY	driver.findElement(By.xpath("(//div[@class='d-flex align-items-center p-2 to--insert overflow-hidden'])[4]")).click();
		driver.findElement(By.xpath("(//div[@class='d-flex align-items-center p-2 to--insert overflow-hidden'])[3]")).click();
		
		
//		String desireMonth="October 2024";
//		String desireDay="10";
//		driver.findElement(By.id("departure")).click();
//	
		
//		while(true)
//		{
//		
//		String text=driver.findElement(By.xpath("(//th[@class='switch'])[1]")).getText();
//		
//			if(text.equals("October 2024"))
//				
//			{
//				break;
//			}
//			else
//			{
//				driver.findElement(By.xpath("(//th[@class='next'])[1]")).click();
//				
//			}
//			
//			driver.findElement(By.xpath("//td[@class='day '][contains(text(),'11')]")).click();
//			Thread.sleep(2000);
//		
//		}

//			driver.findElement(By.id("return_date")).click();
//			
//			while(true)
//			{
//			
//			String text=driver.findElement(By.xpath("(//th[@class='switch'])[4]")).getText();
//			
//				if(text.equals("December 2024"))
//					
//				{
//					break;
//				}
//				else
//				{
//					driver.findElement(By.xpath("(//th[@class='next'])[4]")).click();
//					
//				}
//				
//				driver.findElement(By.xpath("//td[@class='day '][contains(text(),'25')]")).click();

				
//			}
			

			
			driver.findElement(By.xpath("//button[@id='flights-search']")).click();
			Thread.sleep(2000);
			
			
		}
	@AfterClass
	public static void book() throws InterruptedException {

		
		driver.findElement(By.xpath("(//input[@class='form-check-input filter'])[1]")).click();
		WebElement slider=driver.findElement(By.xpath("//span[@class='irs-handle from']"));
		Thread.sleep(5000);
		WebElement slider1=driver.findElement(By.xpath("//span[@class='irs-handle to']"));
		
		Actions slide=new Actions(driver);
		
		slide.dragAndDropBy(slider, 20, 0).perform();
		slide.dragAndDropBy(slider1, -40, 0).perform();
		
			
		driver.findElement(By.xpath("(//input[@class='form-check-input filter'])[5]")).click();
//		driver.findElement(By.xpath("(//input[@class='form-check-input filter'])[6]")).click();
		
		driver.findElement(By.xpath("(//button[@role='button'])[2]")).click();
		
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
	
	
}

		@AfterTest
		public static void info() throws InterruptedException  {
			
			
			Select gen=new Select(driver.findElement(By.xpath("//select[@name='title_1']")));
			gen.selectByValue("Mrs");
			
			driver.findElement(By.name("first_name_1")).sendKeys("sherlock");
			driver.findElement(By.name("last_name_1")).sendKeys("Holmes");
			
//			JavascriptExecutor js =(JavascriptExecutor)driver;
//			WebElement nan=driver.findElement(By.xpath("//select[@name='nationality_1']"));
//			js.executeScript("arguments[0].scrollIntoView();",nan);

			Select nation=new Select(driver.findElement(By.xpath("//select[@name='nationality_1']")));
			nation.selectByValue("US");
			
			Select mnth=new Select(driver.findElement(By.xpath("//select[@name='dob_month_1']")));
			mnth.selectByValue("3");
			
			Select day=new Select(driver.findElement(By.xpath("//select[@name='dob_day_1']")));
			day.selectByValue("04");
			
			Select year=new Select(driver.findElement(By.xpath("//select[@name='dob_year_1']")));
			year.selectByValue("1990");
			
			
			driver.findElement(By.name("passport_1")).sendKeys("147033381369");
			Select i_month=new Select(driver.findElement(By.xpath("//select[@name='passport_issuance_month_1']")));
			i_month.selectByValue("2");
			
			Select i_day=new Select(driver.findElement(By.xpath("//select[@name='passport_issuance_day_1']")));
			i_day.selectByValue("05");
			
			Select i_year=new Select(driver.findElement(By.xpath("//select[@name='passport_issuance_year_1']")));
			i_year.selectByValue("2018");
			
			Select e_month=new Select(driver.findElement(By.xpath("//select[@name='passport_month_expiry_1']")));
			e_month.selectByValue("2");
				
			Select e_day=new Select(driver.findElement(By.xpath("//select[@name='passport_day_expiry_1']")));
			e_day.selectByValue("04");
			
			Select e_year=new Select(driver.findElement(By.xpath("//select[@name='passport_year_expiry_1']")));
			e_year.selectByValue("2028");
			
			Thread.sleep(5000);
				
			JavascriptExecutor js =(JavascriptExecutor)driver;
		//	WebElement nan=driver.findElement(By.xpath("(//input[@class='form-check-input mx-auto'])[6]"));
//			js.executeScript("arguments[0].scrollIntoView();",nan);
			js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
			
			Thread.sleep(2000);
			
			
			WebDriverWait fyp = new WebDriverWait(driver, Duration.ofSeconds(5));
			WebElement abc = fyp.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@id='pills-home-tab'])[2]")));
			abc.click();
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//input[@class='form-check-input']")).click();
			
			Thread.sleep(2000);
			
			
			driver.findElement(By.xpath("//button[@class='btn btn-primary w-100 btn-lg book waves-effect']")).click();
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//input[@class='btn btn-success w-100']")).click();
		
			Thread.sleep(2000);
			
			
			driver.findElement(By.xpath("//div[@class='btn-front']")).click();
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//a[@class='yes']")).click();

		}
	
	
	}
	
	

