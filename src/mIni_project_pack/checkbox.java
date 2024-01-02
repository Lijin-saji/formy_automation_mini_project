package mIni_project_pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkbox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASUS\\Desktop\\Automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/checkbox");
        driver.manage().window().maximize();
        
        WebElement checkbox1 = driver.findElement(By.id("checkbox-1"));
        checkbox1.click();
        
        WebElement checkbox2 = driver.findElement(By.id("checkbox-2"));
        checkbox2.click();
        
Thread.sleep(3000);
        
        driver.close();
	}

}
