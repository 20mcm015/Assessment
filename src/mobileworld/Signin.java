package mobileworld;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

public class Signin {
@Test(priority=1)

	public void sin1() throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/Users/karthikeyan.s/Downloads/chromedriver_win32/chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		Landingpage landingpage = new Landingpage(driver);
		landingpage.goTo();
		landingpage.loginApplication("karthik", "karthik123");
		driver.findElement(By.xpath("//a[@type='submit']")).click();
		
		

	}

@Test(priority=2)
//max 20 characters in username textfeild and max 10 characters in password testfeild
public void sin2() throws InterruptedException {
	// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver", "C:/Users/karthikeyan.s/Downloads/chromedriver_win32/chromedriver.exe");
	WebDriver driver =  new ChromeDriver();
	Landingpage landingpage = new Landingpage(driver);
	landingpage.goTo();
	landingpage.loginApplication("karthikeyankarthikeyankarthikeyan", "karthikeyan123");
	driver.findElement(By.xpath("//a[@type='submit']")).click();
	

}

@Test(priority=3)
//less than 3 characters in username textfeild and less than 3 characters in password testfeild
public void sin3() throws InterruptedException {
	// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver", "C:/Users/karthikeyan.s/Downloads/chromedriver_win32/chromedriver.exe");
	WebDriver driver =  new ChromeDriver();
	Landingpage landingpage = new Landingpage(driver);
	landingpage.goTo();
	landingpage.loginApplication("ka", "k1");
	driver.findElement(By.xpath("//a[@type='submit']")).click();


}
@Test(priority=4)
//without data
public void sin4() throws InterruptedException {
	// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver", "C:/Users/karthikeyan.s/Downloads/chromedriver_win32/chromedriver.exe");
	WebDriver driver =  new ChromeDriver();
	Landingpage landingpage = new Landingpage(driver);
	landingpage.goTo();
	landingpage.loginApplication("", "");
	driver.findElement(By.xpath("//a[@type='submit']")).click();
	

}

	
			
	
}