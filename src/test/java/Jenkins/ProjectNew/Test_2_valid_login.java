package Jenkins.ProjectNew;

import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Test;

import DDT_package.Excelsheet_Program;


public class Test_2_valid_login extends Airline_Launch_and_Quit
{
	@Test(groups="Test_2_valid_login")
	public void test2() throws InterruptedException, EncryptedDocumentException, IOException
	{
		Excelsheet_Program.excelsheet_data_fetching();
		String s1=driver.getTitle();
		System.out.println(s1);
		
		Airline_signUp_Page sign_up=new Airline_signUp_Page(driver);
		sign_up.book_flight_tickets_link();
		sign_up.email_id();
		sign_up.continue_button();
		sign_up.pass();
		//sign_up.submit();
		
		//String s2=driver.getTitle();
	//	System.out.println(s2);
		
	//	Assert.assertNotEquals(s1, driver.getTitle(), "failed bcs both the titles are same");			
		//Assert.assertSame(s2,"Flight Bookings on Amazon");
		
		
	}
}

