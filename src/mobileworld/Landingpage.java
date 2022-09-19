package mobileworld;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Landingpage {
	
	WebDriver driver;
	public Landingpage(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	//Page factory
	
	//sign_up
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement signin;
	
	@FindBy(xpath="//a[normalize-space()='Sign up']")
	WebElement signup;
	
	@FindBy(xpath="//input[@id='myName']")
	WebElement fname;
	
	@FindBy(xpath="//input[@placeholder='Last Name']")
	WebElement lname;
	
	@FindBy(xpath="//input[@placeholder='Enter Email']")
	WebElement email;
	
	@FindBy(xpath="//input[@placeholder='Password']")
	WebElement pass;
	
	@FindBy(xpath="//input[@type='date']")
	WebElement cal;
	
	@FindBy(xpath="//div[@class='col-md-2']//input[@name='gender']")
	WebElement radio;
	
	@FindBy(xpath="//input[@placeholder='91XXXXXXXXXX']")
	WebElement mobile;
	
	@FindBy(xpath="//textarea[@placeholder='Short Bio']")
	WebElement bio;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement register;
	
	@FindBy(xpath="//button[@type='Submit']")
	WebElement rlogin;
	
	
	//sign_in 
	
	@FindBy(xpath="//input[@id='username']")
	WebElement name;
	
	@FindBy(xpath="//input[@id='password']")
	WebElement pwd;
	
	@FindBy(xpath="//a[@type='submit']")
	WebElement login;
	
	
	/*
	//mobile_page
	
	@FindBy(xpath="//a[normalize-space()='Home']")
	WebElement m_home;
	
	@FindBy(xpath="//a[normalize-space()='All Mobiles']")
	WebElement allmobile;
	
	@FindBy(xpath="//input[@id='myInput']")
	WebElement search;
	
	@FindBy(xpath="//a[normalize-space()='All Mobiles']")
	WebElement order;
	
	@FindBy(xpath="//input[@id='myInput']")
	WebElement scroll;
	
	@FindBy(xpath="//a[@id='navbarDropdown']")
	WebElement support;

	@FindBy(xpath="//a[@class='dropdown-item waves-effect waves-light'][normalize-space()='Order']")
	WebElement order_page;
	
	
	@FindBy(xpath="//a[@class='dropdown-item waves-effect waves-light'][normalize-space()='Contact Us']")
	WebElement contact;
	
	@FindBy(xpath="//a[normalize-space()='Mobiles']")
	WebElement omobile;
	

	@FindBy(xpath="//a[normalize-space()='Home']")
	WebElement f_home;
	
	
	
	*/
	
	public void goTo()
	{
		driver.get("https://mobileworld.banyanpro.com/");
	}
	
	public void scroll(){
		WebElement flag = driver.findElement(By.xpath("//a[normalize-space()='Mobiles']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();",flag);
	}
	
	public void thread() throws InterruptedException
	{
		Thread.sleep(1000);
	}
	
	public void qt() throws InterruptedException
	{
		driver.close();
	}
	
	public void signupApplication(String finame,String liname,String mail,String passw,String cala,String mob,String info) throws InterruptedException
	{
		signin.click();
		signup.click();
		thread();
		fname.sendKeys(finame);
		thread();
		lname.sendKeys(liname);
		thread();
		email.sendKeys(mail);
		thread();
		pass.sendKeys(passw);
		thread();
		cal.sendKeys(cala);
		thread();
		radio.click();
		mobile.sendKeys(mob);
		thread();
		bio.sendKeys(info);
		thread();
		register.click();
		thread();
		driver.switchTo().alert().accept();
		rlogin.click();
		qt();
		
		
		
	}
	
	public void loginApplication(String username,String password) throws InterruptedException
	{
		signin.click();
		thread();
		name.sendKeys(username);
		thread();
		pwd.sendKeys(password);
		thread();
		login.click();
		qt();
		
		
		
	}
	
	
	/*
	public void mobilepage(String searchbox) throws InterruptedException
	{
		allmobile.click();
		thread();
		m_home.click();
		thread();
		allmobile.click();
		thread();
		support.click();
		thread();
		//order_page.click();
		//thread();
		//scroll();
		//omobile.click();
		//thread();
		allmobile.click();
		thread();
		contact.click();
		thread();
		f_home.click();
		thread();
		allmobile.click();
		qt();
	
		
		
		
	} 
	*/
	
	
	
}
