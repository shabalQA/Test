package utilities;

import org.openqa.selenium.JavascriptExecutor;

import net.serenitybdd.core.pages.PageObject;

public class ScriptSCroler extends PageObject {

	public void scroller() {
		JavascriptExecutor js = (JavascriptExecutor)getDriver();
		js.executeScript("window.scrollBy(0,500)");
		
	}

}
