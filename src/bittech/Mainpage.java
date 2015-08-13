package bittech;




import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Mainpage 

{
	ChromeDriver driver;
	
	
	public Mainpage(ChromeDriver x)
	{
		 driver=x;
		
		 
	}
	public SHOES clickMan()
	{
		driver.findElement(By.xpath(".//*[@id='main-nav-men']/div/div[4]/ul[1]/li[1]/a")).click();
		return new SHOES(driver);
	}
	 
	
	
}
