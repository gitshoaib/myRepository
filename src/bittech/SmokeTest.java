package bittech;

import org.junit.Test;

public class SmokeTest extends BaseTest
{
	//FirefoxDriver driver;
	Homepage hp;
	Mainpage ma;
	
	@Test
	public void bangla()
	
	{
		hp=new Homepage(driver);
		hp.get();
		ma=hp.clickman();
		   //(new Manpage return)
				
	}

}
