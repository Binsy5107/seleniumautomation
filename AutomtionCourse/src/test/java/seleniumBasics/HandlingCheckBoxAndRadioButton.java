package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class HandlingCheckBoxAndRadioButton extends Base {
	public void verifyCheckBox()
	{
		driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement checkBox=driver.findElement(By.xpath("//input[@value='option-2']"));
		checkBox.click();
	}
	public void verifyRadioButton()
	{
		driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement radioButton=driver.findElement(By.cssSelector("input[value='yellow']"));
		System.out.println(radioButton.isSelected());
		radioButton.click();
		//System.out.println(radioButton.isSelected());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HandlingCheckBoxAndRadioButton button=new HandlingCheckBoxAndRadioButton();
button.intializeBrowser();
//button.verifyCheckBox();
button.verifyRadioButton();
	}

}
