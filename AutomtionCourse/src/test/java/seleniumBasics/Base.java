package seleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {
	public static  WebDriver driver;
public void intializeBrowser ()
{
	driver=new ChromeDriver();
	driver.get("https://selenium.qabible.in/");
	driver.manage().window().maximize();
	
}
public void browserClose()
{
	driver.quit();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Base base=new Base();
base.intializeBrowser();
base.browserClose();
	}

}
