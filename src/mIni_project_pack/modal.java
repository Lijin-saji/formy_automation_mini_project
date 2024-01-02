package mIni_project_pack;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class modal {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASUS\\Desktop\\Automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/modal");
        driver.manage().window().maximize();
        
		
		WebElement modal = driver.findElement(By.id("modal-button"));
	    modal.click();
	    
	    WebElement close = driver.findElement(By.xpath("//*[@id=\"close-button\"]"));
	    close.click();
	        
//	        Alert alertbox = driver.switchTo().alert();
//	        driver.switchTo().alert().accept();
//        
//	        driver.switchTo().alert().dismiss();
//	        
//	        String alertmsg = driver.switchTo().alert().getText();
//	        System.out.println(alertmsg);
//	        driver.quit();
	}

}
