package assignment.java;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Java_Assign10 {
		
		WebDriver driver;
		
		@Test
		public void AA() throws Exception
		{
			Actions Act = new Actions(driver);  	
			WebElement Level1Element= driver.findElement(By.xpath("//li[@id='nav-menu-item-11254']/a[text()='WHAT WE DO']"));	
			Thread.sleep(2000);
			Act.moveToElement(Level1Element).build().perform();		
			System.out.println("Level 1 List-" +Level1Element.getText());
			
			
			
			WebElement Level2Element1= driver.findElement(By.xpath("//li[@id='nav-menu-item-11254']/ul/li[@id='nav-menu-item-13429']/a"));	
			Act.moveToElement(Level2Element1).build().perform();
			Thread.sleep(2000);  		
		    
			/*
			WebElement Level21Element1= driver.findElement(By.xpath("//li[@id='nav-menu-item-11254']/ul/li[@id='nav-menu-item-13429']/ul/li[1]"));
			WebElement Level21Element2= driver.findElement(By.xpath("//li[@id='nav-menu-item-11254']/ul/li[@id='nav-menu-item-13429']/ul/li[2]"));
			WebElement Level21Element3= driver.findElement(By.xpath("//li[@id='nav-menu-item-11254']/ul/li[@id='nav-menu-item-13429']/ul/li[3]"));
			WebElement Level21Element4= driver.findElement(By.xpath("//li[@id='nav-menu-item-11254']/ul/li[@id='nav-menu-item-13429']/ul/li[4]"));
			
			System.out.println("Level 2 List1-" +Level21Element1.getText());
		    System.out.println("Level 2 List2-" +Level21Element2.getText());
		    System.out.println("Level 2 List3-" +Level21Element3.getText());
		    System.out.println("Level 2 List4-" +Level21Element4.getText());
			*/
			
		 
		    
			List<WebElement> ff= driver.findElements(By.xpath("//li[@id='nav-menu-item-11254']/ul/li[@id='nav-menu-item-13429']/ul/li"));		    
		    for (int i =0; i<ff.size();i++) 
		    
		    {    	
		    	System.out.println(ff.get(i).getText());
		    	  	
		    }
			
			
			
		    WebElement Level2Element2= driver.findElement(By.xpath("//li[@id='nav-menu-item-11254']/ul/li[2]/a"));	
		    Act.moveToElement(Level2Element2).build().perform();
			Thread.sleep(2000);
		    

		    WebElement Level2Element3= driver.findElement(By.xpath("//li[@id='nav-menu-item-11254']/ul/li[3]/a"));
		    WebElement Level2Element4= driver.findElement(By.xpath("//li[@id='nav-menu-item-11254']/ul/li[4]/a"));	    
		    WebElement Level2Element5= driver.findElement(By.xpath("//li[@id='nav-menu-item-11254']/ul/li[5]/a"));
		    
		    System.out.println(Level2Element2.getText());
		    System.out.println(Level2Element3.getText());
		    System.out.println(Level2Element4.getText());
		    System.out.println(Level2Element5.getText());
		    
		    WebElement Level3Element1= driver.findElement(By.xpath("//li[@id='nav-menu-item-11254']/ul/li[1]/ul/li[1]")); 
		    WebElement Level3Element2= driver.findElement(By.xpath("//li[@id='nav-menu-item-11254']/ul/li[1]/ul/li[2]"));	    
		    WebElement Level3Element3= driver.findElement(By.xpath("//li[@id='nav-menu-item-11254']/ul/li[1]/ul/li[3]"));
		    WebElement Level3Element4= driver.findElement(By.xpath("//li[@id='nav-menu-item-11254']/ul/li[1]/ul/li[4]"));	
		    
		    System.out.println(Level3Element1.getText());	    
		    System.out.println(Level3Element2.getText());
		    System.out.println(Level3Element3.getText());
		    System.out.println(Level3Element4.getText());

		    
				
			Act.moveToElement(Level2Element2).build().perform();
			Thread.sleep(2000);  		
			Act.moveToElement(Level2Element3).build().perform();
			Thread.sleep(2000);
		    
			
			
		
		    
		    /*
		     * 
		     * 
		     *        
		    List<WebElement> ff=(List<WebElement>) driver.findElement(By.xpath("//li[@id='nav-menu-item-11254']/ul/li[1]/ul/"));
		    ff.size();
		    
		    for (int i =0; i<ff.size();i++) 
		    
		    {    	
		    	System.out.println(ff.get(i).getText());
		    	  	
		    }
		    
		    
		    WebElement Level3Element1= driver.findElement(By.xpath("//li[@id='nav-menu-item-11254']/ul/li[1]/ul/li[1]")); 
		    WebElement Level3Element2= driver.findElement(By.xpath("//li[@id='nav-menu-item-11254']/ul/li[1]/ul/li[2]"));	    
		    WebElement Level3Element3= driver.findElement(By.xpath("//li[@id='nav-menu-item-11254']/ul/li[1]/ul/li[3]"));
		    WebElement Level3Element4= driver.findElement(By.xpath("//li[@id='nav-menu-item-11254']/ul/li[1]/ul/li[4]"));	    

			    
		    Level2Element1.getText();
		    Level2Element2.getText();
		    Level2Element3.getText();
		    Level2Element4.getText();
		    Level2Element5.getText();
		    
		    
		    System.out.println(Level2Element1.getText());	    
		    System.out.println(Level2Element2.getText());
		    System.out.println(Level2Element3.getText());
		    System.out.println(Level2Element4.getText());
		    System.out.println(Level2Element5.getText());
		 */   
		    
		    
		    
		    
		   
		}

		@BeforeMethod
		public void setUp() throws InterruptedException
		{		
			System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\Java_Asssignment\\Driver\\geckodriver.exe");
			driver = new FirefoxDriver(); 
			driver.get("https://www.attra.com/");
			driver.manage().window().maximize();	
			driver.findElement(By.xpath("//button[text()='I agree']")).click();
			Thread.sleep(2000);  		
		    

		}
		
		@AfterMethod
		public void tearDown()
		{	
			driver.quit();
	    }
		
		
	}



		  


	    
	    
	
