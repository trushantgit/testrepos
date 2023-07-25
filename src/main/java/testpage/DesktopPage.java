package testpage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import baseClass.TestBase;

public class DesktopPage extends TestBase{
	
	@FindBy(xpath="//*[text()='Desktops']")WebElement desktop;
	@FindBy(xpath="//*[text()='Mac (1)']")WebElement mac1;
	@FindBy(xpath="//h2[text()='Mac']")WebElement Mac;
	@FindBy(id="input-sort")WebElement sortby;
	@FindBy(xpath="//*[@for='input-sort']")WebElement sortbytext;
	@FindBy(id="input-limit")WebElement show;
	@FindBy(xpath="//*[@for='input-limit']")WebElement showtext;
	@FindBy(xpath="//*[text()='iMac']")WebElement iMac;
	@FindBy(xpath="//*[@class=\"price-tax\"]")WebElement price;
	@FindBy(xpath="//h1[text()='iMac']")WebElement ImacSelect;
	
	public DesktopPage() {
		PageFactory.initElements(drt, this);
	}
	
	public void Desktop() {
		desktop.click();
		mac1.click();
	}
	
	public boolean Desktop_Module() {
		desktop.click();
		mac1.click();
		return Mac.isDisplayed();
	}
	
	public boolean validatesortbytext() {
		return sortbytext.isDisplayed();
	}
	
	public boolean Validateshowtext() {
		return showtext.isDisplayed();
	}
	
	public String Validatesortby_DropDown() {
		Select sc= new Select(sortby);
		sc.selectByVisibleText("Price (Low > High)");
		return sc.getFirstSelectedOption().getText();
	}
	
	public String Validateshow_DropDown() {
		Select sh= new Select(show);
		sh.selectByVisibleText("75");
		return sh.getFirstSelectedOption().getText();	
	}
	
	public boolean ValidateiMac() {
		return iMac.isDisplayed();
	}
	
	public boolean ValidateImacPrice() {
		return price.isDisplayed();
	}
	
	public boolean SelectiMac() {
		String cost ="Ex Tax: $100.00";
		if(price.getText().equalsIgnoreCase(cost)) {
			iMac.click();
		}
		return ImacSelect.isDisplayed();
	}
	
		

}
