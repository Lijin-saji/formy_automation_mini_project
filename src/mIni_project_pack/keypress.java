package mIni_project_pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class keypress {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASUS\\Desktop\\Automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/keypress");
        driver.manage().window().maximize();
        
        
        WebElement input = driver.findElement(By.xpath("//*[@id=\"name\"]"));
        input.sendKeys("lijin");
        
        WebElement button = driver.findElement(By.xpath("//*[@id=\"button\"]"));
        button.click();
        
Thread.sleep(3000);
        
        driver.close();
	}

}
