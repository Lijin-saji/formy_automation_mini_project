package mIni_project_pack;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class switch_window {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASUS\\Desktop\\Automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/switch-window");
        driver.manage().window().maximize();

//        WebElement switchw = driver.findElement(By.xpath("/html/body/div/div/li[13]/a"));
//        switchw.click();
        
        WebElement alert = driver.findElement(By.xpath("//*[@id=\"alert-button\"]"));
        alert.click();
        
        Alert alertbox = driver.switchTo().alert();
        driver.switchTo().alert().accept();
	}

}
