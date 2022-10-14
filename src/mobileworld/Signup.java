package mobileworld;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;





public class Signup{
   
 
   
         @Test(dataProvider = "Signup")
         public void testdata(String Fname,String Lname,String Email,String passwrd,String number,String date,String bio) throws InterruptedException
         {
        	 System.setProperty("webdriver.chrome.driver","C:/Users/karthikeyan.s/Downloads/chromedriver_win32/chromedriver.exe");
             WebDriver driver = new ChromeDriver();
             
             driver.get("https://qualicoach.org/mwapp/index.html");
             driver.manage().window().maximize();
             
             driver.findElement(By.cssSelector("button[type='submit']")).click();
             quit();
             driver.findElement(By.xpath("//a[normalize-space()='Sign up']")).click();
             quit();
             driver.findElement(By.cssSelector("#myName")).sendKeys(Fname);
             quit();
             
            driver.findElement(By.cssSelector("input[placeholder='Last Name']")).sendKeys(Lname);
            quit();
            driver.findElement(By.cssSelector("input[placeholder='Enter Email']")).sendKeys(Email);
            quit();
            driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(passwrd);
            quit();
            driver.findElement(By.xpath("//input[@type='date']")).sendKeys(date);
            quit();
            driver.findElement(By.xpath("//div[@class='col-md-2']//input[@name='gender']")).click();
            quit();
            
            driver.findElement(By.cssSelector("input[placeholder='91XXXXXXXXXX']")).sendKeys(number);
            quit();
            driver.findElement(By.xpath("//textarea[@placeholder='Short Bio']")).sendKeys(bio);
            quit();
            driver.findElement(By.xpath("//button[@type='submit']")).click();
            quit();
            driver.switchTo().alert().accept();
            quit();
            driver.close();
            driver.quit();
        
        
        
      
        
        
        
        
        
        
        
        int fname=Fname.length();
        int lname=Lname.length();
        int pass=passwrd.length(); 
        int num=number.length();
       
        //firstname
        
        if ((fname <= 3) || (fname >= 20)) {
        	Assert.assertEquals(fname, Fname);
        	
        	//Assert.assertEquals(true, fname);
        	System.out.println("InValid firstname");
        	
        }
        else {
        	System.out.println("valid firstname");
        }
          
     
        //lastname
        
        if ((lname <= 3) || (lname >= 20)) {
        	
        	Assert.assertEquals(false, lname);
        	System.out.println("Valid lasttname");
        	
        }
        else {
        	System.out.println("Inalid lastname");
        }
         
        //password

       if ((pass <= 3) || (pass >= 10)) {
       Assert.assertEquals(false, pass);
       System.out.println("Valid password");
       
       }
       else {
    	   System.out.println("Invalid password");
       }
       
       
     //mobile number
       if (num == 10){
        	
        	Assert.assertEquals(false, fname);
        	System.out.println("Valid mobile number");
        	
        }
        else {
        	System.out.println("Inalid mobile number");
        }
        
        /*  
        String EMAIL_REGEX = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
        Boolean b = Email.matches(EMAIL_REGEX);
        if(b) {
        System.out.println("Valid Email");
        }
        else {
       	 System.out.println("Invalid Email");
        }
   
        
        
        
       
       //bio textbox
       if(bio.isEmpty()) {
   		   System.out.println("Test not passed");
      	}else {
   		   System.out.println("Test passed");
      	}
       
         
         
             */
         
         
         
    }

         
         @DataProvider(name="Signup")
         public Object[][] getdata()
         {
           Object [][] data = new Object[4][7];
           
           
           //valid data- fname,lname,email,password,mobile no, DOB .
           data [0][0]="karthik";
           data [0][1]="EyanSp";
           data [0][2]="karthik@gmail.com";
           data [0][3]="karthik@1";
           data [0][4]="9080605436";
           data [0][5]="01/06/2000";
           data [0][6]="Welcome to Qualitest";
          
           //Invalid data - fname, lname, email, password, mobile no, DOB .
           //Less than 3 characters - fname, lname.
           data [1][0]="ka";
           data [1][1]="s";
           data [1][2]="karthik.gmail.com";
           data [1][3]="k1";
           data [1][4]="908060";
           data [1][5]="01/06/23456";
           data [1][6]="Welcome to Qualitest";
           
           
           //Invalid data - fname, lname, mobile no.
           //greater than 20 characters - fname, lname.
           data [2][0]="KarthikeyanskKarthikeyanskKarthikeyanskKarthikeyansk";
           data [2][1]="karthikeyanKarthikeyanskKarthikeyanskKarthikeyansk";
           data [2][2]="karthik@gmail.com";
           data [2][3]="karthik@1";
           data [2][4]="90806054367676544";
           data [2][5]="01/06/2000";
           data [2][6]="Welcome to Qualitest";
           
 
           //without data
           data [3][0]="";
           data [3][1]="";
           data [3][2]="";
           data [3][3]="";
           data [3][4]="";
           data [3][5]="";
           data [3][6]="";
           
           
             
           return data;
             
         }
         
         
         public void quit() throws InterruptedException {
        	 Thread.sleep(1000);
         }
      
     }



