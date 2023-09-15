package testpage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseClass.TestBase;

public class ComponantPage extends TestBase{
	
	
	@FindBy(xpath="//a[text()='Components']")WebElement componant;

	public ComponantPage() {
	PageFactory.initElements(drt, this);
	}
}
