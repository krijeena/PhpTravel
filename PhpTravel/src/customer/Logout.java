package customer;

import org.openqa.selenium.By;

import org.testng.annotations.Test;

public class Logout extends Setup{
	
	@Test
	public static void out() {
		
		driver.findElement(By.xpath("//a[@class='py-2 fadeout btn btn-outline-dark w-100 d-block mb-2 waves-effect']")).click();
		
		 

     }
		
	}


