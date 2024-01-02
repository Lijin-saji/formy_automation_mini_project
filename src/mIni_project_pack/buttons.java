package mIni_project_pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class buttons {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASUS\\Desktop\\Automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/buttons");
        driver.manage().window().maximize();
        
        WebElement primary = driver.findElement(By.xpath("/html/body/div/form/div[1]/div/div/button[1]"));
        primary.click();
        
        WebElement drop = driver.findElement(By.xpath("//*[@id=\"btnGroupDrop1\"]"));
        drop.click();
        
Thread.sleep(3000);
        
        driver.close();
	}

}
