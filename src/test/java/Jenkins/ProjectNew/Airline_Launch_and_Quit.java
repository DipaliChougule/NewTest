package Jenkins.ProjectNew;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class Airline_Launch_and_Quit 
{
    WebDriver driver;
	@BeforeMethod
	public void launch()
	{
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/s?k=flight+ticket+booking+online+amazon&adgrpid=57989285205&ext_vrnc=hi&gclid=EAIaIQobChMI4d_I8PPshQMVkWwPAh3NwgYGEAAYASAAEgLHM_D_BwE&hvadid=590474248044&hvdev=c&hvlocphy=9050498&hvnetw=g&hvqmt=b&hvrand=15971996280985017320&hvtargid=kwd-1397416659064&hydadcr=15293_2267882&tag=googinhydr1-21&ref=pd_sl_7qup00rl3y_b");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	
	
	@AfterMethod
	public void quit()
	{
		//driver.close();
	}
}

