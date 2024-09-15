package customer;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Bookings extends Setup {
	
	
	@Test
	public static void MyBookings() throws InterruptedException {
		
		driver.findElement(By.xpath("(//a[@class='py-2 btn btn-outline-dark w-100 d-block fadeout waves-effect'])[1]")).click();
		
		driver.findElement(By.xpath("(//input[@type='search'])[1]")).sendKeys("Maya stern");
		
		Thread.sleep(5000);
		
		
	}
	
	

}
