package mIni_project_pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASUS\\Desktop\\Automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/dropdown");
        driver.manage().window().maximize();
        
        Select option = new Select(driver.findElement(By.xpath("//*[@id=\"dropdownMenuButton\"]")));
        option.selectByVisibleText("Buttons");
      //option.selectByIndex(1);
//        option.selectByValue("");

Thread.sleep(3000);
        
        driver.close();
	}

}
