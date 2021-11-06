package nov_1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testing_Form {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Sofyware Learning\\Selinium\\Browser\\New Version 1\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// Launch url
		driver.get("https://docs.google.com/forms/d/e/1FAIpQLSfMg_28-vXIFUelAAc7mv-HIJZsl7CIol6I31757vNm3r8Zjg/viewform");
		
		// Maximize the browser view
				driver.manage().window().maximize();
				
		//To Delay execution for 5 sec. as to view the maximize browser
			        Thread.sleep(5000);
		
		//Get title of the page
			  String title = driver.getTitle();      
			  if("Testing Form".equals(title)) {
				  // Pass
				  System.out.println("verification is success");
				  System.out.println("Page title contains:" + title);
			  }
			  else {
				  // Fail
				  System.out.println("Verification is Failed");
				  System.out.println("Page title doesn't contains:" + title);
			  }
			  
		 // Click DropDown
			  driver.findElement(By.xpath("(//div[@role='presentation']) [4]")).click();
			  Thread.sleep(5000);
			  
		// Click Option
			  driver.findElement(By.xpath("(//span[@class ='quantumWizMenuPaperselectContent exportContent']) [10]")).click();
			  Thread.sleep(5000);
			  
		// Click next
			  driver.findElement(By.xpath("//span[text()='Next']")).click();
			  
		// Click Yes	
			  driver.findElement(By.xpath("(//div[@class='appsMaterialWizToggleRadiogroupOffRadio exportOuterCircle']) [1]")).click();
			  
		// Set date
			 WebElement date = driver.findElement(By.xpath("//input[@type='date']"));
			 // Please enter today date numbers
			 date.sendKeys("08112021"); 
			 Thread.sleep(5000);
			 
		// Click Next
			 driver.findElement(By.xpath("(//span[@class='appsMaterialWizButtonPaperbuttonContent exportButtonContent'])[3]")).click();
			 Thread.sleep(5000);
			 
		// Click Yes
			 driver.findElement(By.xpath("(//div[@class='appsMaterialWizToggleRadiogroupOffRadio exportOuterCircle'])[1]")).click();
			 
		// Click Next
			 driver.findElement(By.xpath("//span[text()='Next']")).click();
			 
		// Enter Your Wakeup Time
			 driver.findElement(By.xpath("(//input[@class='quantumWizTextinputPaperinputInput exportInput'])[1]")).sendKeys("08");
			 Thread.sleep(3000);
			 WebElement text = driver.findElement(By.xpath("(//input[@class='quantumWizTextinputPaperinputInput exportInput'])[2]"));
			 text.sendKeys("00");
			 Thread.sleep(5000);
			 
		// Enter Your Bed Time	 
			 text.sendKeys(Keys.TAB);
			 Thread.sleep(5000);
			 driver.findElement(By.xpath("(//input[@class='quantumWizTextinputPaperinputInput exportInput'])[3]")).sendKeys("12");
			 driver.findElement(By.xpath("(//input[@max='59'])[2]")).sendKeys("30");
			 
		// Click Next
			 driver.findElement(By.xpath("//span[text()='Next']")).click();
			 
		// Enter Tell something about State
			 driver.findElement(By.xpath("(//textarea[@dir='auto'])[1]")).sendKeys("I Love My State");
			 Thread.sleep(3000);
			 
		// Enter What you most like from this state
			 driver.findElement(By.xpath("(//textarea[@data-initial-dir='auto'])[2]")).sendKeys("I like Chidambaram moorthy cafe food");
			 Thread.sleep(3000);
			 
		// Click Submit
			 driver.findElement(By.xpath("//span[text()='Submit']")).click();
			 Thread.sleep(15000);
			 
		// Close Browser
		     driver.close();
	 
			 
			 
			 
			  
			  
			  
			  
			  
			  }



	}


