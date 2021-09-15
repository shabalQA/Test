package StepDefinition;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;


public class StepDef extends PageObject {
	
	@FindBy(name = "q")
	WebElementFacade Googleinput;
	
	
	
	public void launchGoogle(String item) throws InterruptedException {
		
		getDriver().get("https://google.com");
		Googleinput.typeAndEnter(item);
		Thread.sleep(2000);
		WebElement firstLink = getDriver().findElement(By.partialLinkText(item));
		firstLink.click();
		Thread.sleep(3000);
		
		
		
	}
	

}
