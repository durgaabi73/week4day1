package week4day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFrame {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
	 driver.manage().window().maximize();
      driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
       
        driver.switchTo().frame("iframeResult");
       
        driver.findElement(By.xpath("//button[text()='Try it']")).click();
        
        Alert prompt = driver.switchTo().alert();
        
       System.out.println(prompt.getText());
       
        prompt.accept();
      
       
       String text2 = driver.findElement(By.id("demo")).getText();
       
    System.out.println(text2);
        
        {
            
        
    }
        
	}
	
}
		
		
		
	


