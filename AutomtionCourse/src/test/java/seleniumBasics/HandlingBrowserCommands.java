package seleniumBasics;

public class HandlingBrowserCommands extends Base{
	public void verifybrowsercommand()
	{
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getPageSource());
		System.out.println(driver.getWindowHandle());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HandlingBrowserCommands browser= new HandlingBrowserCommands();
browser.intializeBrowser();
browser.verifybrowsercommand();
//browser.browserClose();
	}

}
