package customer;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Setup {

	
	public static String url="https://phptravels.net/";
	public static ChromeDriver driver;
	
	
	@BeforeSuite
	public static void browser() {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		
	}
	
	@BeforeClass
	public static void Login() {
		
		driver.findElement(By.xpath("//a[@class='bg-light nav-link dropdown-toggle btn btn-outline-secondary px-0 ps-3 text-center d-flex align-items-center justify-content-center gap-2 border waves-effect']")).click();
		driver.findElement(By.xpath("(//a[@class='dropdown-item fadeout waves-effect'])[5]")).click();
		
		driver.findElement(By.id("email")).sendKeys("user@phptravels.com");
		driver.findElement(By.id("password")).sendKeys("demouser");
		driver.findElement(By.id("rememberchb")).click();
		driver.findElement(By.xpath("//button[@id='submitBTN']")).click();
		
		}
	
	@AfterSuite
	public static void close() throws InterruptedException {
		
		Thread.sleep(5000);
		driver.close();
		
	}
}