package mIni_project_pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class radiobutton {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASUS\\Desktop\\Automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/radiobutton");
        driver.manage().window().maximize();
        
		
		WebElement rb = driver.findElement(By.xpath("/html/body/div/div[2]/input"));
	    rb.click();
        
	    Thread.sleep(3000);
        
        driver.close();
	}

}
