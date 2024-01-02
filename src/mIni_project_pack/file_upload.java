package mIni_project_pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class file_upload {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASUS\\Desktop\\Automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/fileupload");
        driver.manage().window().maximize();
       
        WebElement fileInput = driver.findElement(By.xpath("//*[@id=\"file-upload-field\"]"));
        fileInput.sendKeys("C:\\Users\\ASUS\\Pictures\\Screenshots\\Screenshot 2023-11-13 164851.png");
        
        try {
        	Thread.sleep(5000);
        }
        catch(InterruptedException e)
        {
        	e.printStackTrace();
        }
        WebElement reset = driver.findElement(By.xpath("/html/body/div/form/div/div/span[2]"));
        reset.click();
        
Thread.sleep(3000);
        
        driver.close();
	}

}
