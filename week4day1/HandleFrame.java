package week4day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFrame {

	public static void main(String[] args) {
		
		ChromeDriver driver= new ChromeDriver();
		  
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		  
		  driver.get("https://www.leafground.com/frame.xhtml");
		  //frame
		  driver.switchTo().frame(0);
		  
		  driver.findElement(By.id("Click")).click();
		  
		  //default
		  
		  driver.switchTo().defaultContent();
		  
		 //nested
		  
		  driver.switchTo().frame(2);
		  
		 driver.switchTo().frame("frame2");
		 
		driver.findElement(By.xpath("//button[text()='Click Me']")).click();
		  
		  
		 
		  
		  
		

	}

}
