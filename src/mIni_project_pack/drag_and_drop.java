package mIni_project_pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class drag_and_drop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASUS\\Desktop\\Automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/dragdrop");
        driver.manage().window().maximize();
        
		driver.switchTo().frame(0);
        WebElement source = driver.findElement(By.xpath("//*[@id=\"image\"]"));
        WebElement target = driver.findElement(By.xpath("//*[@id=\"box\"]"));
        
        Actions ac = new Actions(driver);
        ac.clickAndHold(source).moveToElement(target).release().build().perform();
        
Thread.sleep(3000);
        
        driver.close();
	}

}
