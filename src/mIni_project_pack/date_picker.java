package mIni_project_pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class date_picker {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASUS\\Desktop\\Automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/datepicker");
        driver.manage().window().maximize();
        
        String month = "March 2002";
        String day = "13";
        
        WebElement datepicker = driver.findElement(By.xpath("//*[@id=\"datepicker\"]"));
        datepicker.click();
        
        Thread.sleep(2000);
        
        while(true)
        {
        String monthyear1 = driver.findElement(By.xpath("/html/body/div[2]/div[1]/table/thead/tr[2]/th[2]")).getText();
        
        if(monthyear1.equals(month))
        {
        break;	
        }
        else
        {
        	WebElement leftarrow = driver.findElement(By.xpath("/html/body/div[2]/div[1]/table/thead/tr[2]/th[1]"));
        	leftarrow.click();
        	}
        }
        WebElement day1 = driver.findElement(By.xpath("/html/body/div[2]/div[1]/table/tbody/tr[3]/td[4]"));
        day1.click();
        
Thread.sleep(2000);
        
        driver.close();
	}
}
