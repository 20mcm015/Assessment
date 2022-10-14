package mobileworld;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
public class Sign_inScript {
   
	@Test(dataProvider="Signin") 
    public void signin(String username,String Password) throws Exception
    {



   
        System.setProperty("webdriver.chrome.driver","C:/Users/karthikeyan.s/Downloads/chromedriver_win32/chromedriver.exe");
         WebDriver driver = new ChromeDriver();
          
            Signinpom page=new Signinpom(driver);
        
            page.goTo();
            driver.manage().window().maximize();
            page.signinbutton().click();
            System.out.println("click the signin button");
            Thread.sleep(2000);
            WebElement user_name = driver.findElement(By.xpath("//label[@for='username']"));
        	user_name.isDisplayed();
            System.out.println("enter the username");
            page.uname().sendKeys(username);
            Thread.sleep(2000);
            WebElement Pass = driver.findElement(By.xpath("//label[@for='password']"));
        	Pass.isDisplayed();
            System.out.println("enter the password");
            page.pwd().sendKeys(Password);
            Thread.sleep(2000);
            WebElement Remember_me = driver.findElement(By.xpath("//label[@for='remember-me']"));
            Remember_me.isDisplayed();
            Thread.sleep(2000);
            page.Remember_click.isDisplayed();
            page.Remember_click.click();
        
            driver.findElement(By.xpath("//a[@type='submit']")).click();
            driver.close();
            int uname=username.length();
            int pass=Password.length(); 
            
            
            //Username
            
            if ((uname <= 3) || (uname >= 20)) {
            	
            	Assert.assertEquals(true, uname);
            	System.out.println("Invalid Username");
            	
            }
           
           
            else {
            	System.out.println("Valid Username");
            }
              
         

           //password 
            
           if ((pass <= 3) || (pass >= 10)) {
           Assert.assertEquals(true, pass);
           System.out.println("Inalid password");
           
           }
           else {
        	   System.out.println("Valid password");
           }
           
          
          
            
            driver.quit();
        }
    @DataProvider(name="Signin")
    public Object[][] getdata()
    {
      Object [][] data=new Object[6][2];
      
      
      //username and password - vaild data
      data [0][0]="karthik";
      data [0][1]="karthik@1";
      
      //username and password - less than 3 characters
      data [1][0]="ka";
      data [1][1]="k@";
      
      
      //username and password - greater than 10 characters
      data [2][0]="Karthikeyansk";
      data [2][1]="karthikeyan@12345.";
      
      
      //email and password - vaild data
      
      data [3][0]="karthik@gmail.com";
      data [3][1]="karthik@1";
      
      
      //invalid email id
      data [4][0]="karthikeyan.gmail.com";
      data [4][1]="karthik@1";
      
      
      //without data
      data [5][0]="";
      data [5][1]="";
      
      return data;
        
    }
}
