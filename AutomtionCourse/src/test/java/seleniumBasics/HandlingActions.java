package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HandlingActions extends Base {
	public void verifyrightClick()
	{
		WebElement rightclick=driver.findElement(By.xpath("//a[text()='Home']"));
		Actions actions=new Actions(driver);
		actions.contextClick(rightclick).build().perform();
	}
	public void verifyMouseOver()
	{
		WebElement mouseOver=driver.findElement(By.id("others"));
		Actions actions=new Actions(driver);
		actions.moveToElement(mouseOver).build().perform();
	}
	public void verifyDragAndDrop() 
	{
		driver.navigate().to("https://demoqa.com/droppable");
		WebElement drag=driver.findElement(By.id("draggable"));
		WebElement drop=driver.findElement(By.id("droppable"));
		Actions actions=new Actions(driver);
		actions.dragAndDrop(drag, drop).build().perform();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HandlingActions action=new HandlingActions();
action.intializeBrowser();
//action.verifyrightClick();
//action.verifyMouseOver();
action.verifyDragAndDrop();
	}

}
