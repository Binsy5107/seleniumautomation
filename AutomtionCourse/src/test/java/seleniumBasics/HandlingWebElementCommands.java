package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingWebElementCommands extends Base {
	public void verifywebelementcommands()
	{driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
	WebElement messagebox=driver.findElement(By.xpath("//input[@id='single-input-field']"));
		// to input a value sendkeys.
	messagebox.sendKeys("binsy");
	// to click the button element.
	WebElement showMessageButton=driver.findElement(By.xpath("//button[@id='button-one']"));
	System.out.println(showMessageButton.isDisplayed());
	System.out.println(showMessageButton.isEnabled());
	showMessageButton.click();
	//prints the retrieved text to the console.
	WebElement yourMessage=driver.findElement(By.xpath("//div[@id='message-one']"));
	System.out.println(yourMessage.getText());
	messagebox.clear();
	//prints the tag name to the console.
	WebElement valuea=driver.findElement(By.id("value-a"));
	System.out.println(valuea.getTagName());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HandlingWebElementCommands webelements= new HandlingWebElementCommands();
webelements.intializeBrowser();
webelements.verifywebelementcommands();
//webelements.browserClose();


	}

}
