package EasemyTrip.EaseMyTRip;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


import com.abc.Objectfiles.FromToDestination;

public class EaseMyTrip 
{
	static ChromeDriver driver;
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeOptions options = new ChromeOptions();
		options.addArguments("disable-notifications");
		driver=new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get("https://www.easemytrip.com");
		driver.manage().window().maximize();
	
		
		FromToDestination fromToDes=new FromToDestination(driver);
		
		fromToDes.FromClickingFrom();
		
		fromToDes.FromTypinginFrom();
	
		fromToDes.FromSelectingInFrom();
		
		fromToDes.FromTypingTo();
	    
		fromToDes.FromSelectingTo();
		
		fromToDes.SelectingandClickingddate();
		
		fromToDes.FromDropDown();
		
		fromToDes.FromChild();
		
		fromToDes.FromChild1();
		
		fromToDes.FromInfant();
		
		fromToDes.FromDone();
		
		fromToDes.FromSearch();
	}
}
