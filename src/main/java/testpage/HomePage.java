package testpage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import baseClass.TestBase;

public class HomePage extends TestBase{
	
	@FindBy(xpath = "//input[@placeholder='Search']")WebElement input;
	@FindBy(id="logo")WebElement Title;
	@FindBy(xpath="//*[text()='Desktops']")WebElement Desktop;
	@FindBy(xpath="//*[text()='Laptops & Notebooks']")WebElement Laptopnotebook;
	@FindBy(xpath="//*[text()='Components']")WebElement Components;
	@FindBy(xpath="//*[text()='Tablets']")WebElement Tablets;
	@FindBy(xpath="//*[text()='Software']")WebElement Software;
	@FindBy(xpath="//*[text()='Phones & PDAs']")WebElement Phonepad;
	@FindBy(xpath="//*[text()='Cameras']")WebElement Camera;
	@FindBy(xpath="//*[text()='MP3 Players']")WebElement mp3;
	@FindBy(xpath ="//*[text()='MacBook']")WebElement macbook;
	@FindBy(xpath="//*[text()='iPhone']")WebElement iphone;
	@FindBy(xpath="//*[text()='Apple Cinema 30\"']")WebElement Applecinema;
	@FindBy(xpath="//*[text()='Canon EOS 5D']")WebElement canon;
	
	public HomePage() {
		PageFactory.initElements(drt, this);
	}
	
	public String ValidatePageTitle(){
		return drt.getTitle();
	}
	
	public boolean Validatetitle(){
		return Title.isDisplayed();
	}
	
	public boolean ValidDesktopModule(){
		Desktop.isDisplayed();
		return Desktop.isEnabled();	
	}
	
	public boolean ValidLaptopnotebook() {
		Laptopnotebook.isEnabled();
		return Laptopnotebook.isDisplayed();
	}
	
	public boolean ValidComponents() {
		Components.isEnabled();
		return Components.isDisplayed();
	}
	
	public boolean ValidTablets() {
		Tablets.isEnabled();
		return Tablets.isDisplayed();
	}
	
	public boolean ValidSoftware() {
		Software.isEnabled();
		return Software.isDisplayed();
	}
	
	public boolean ValidPhonepad() {
		Phonepad.isEnabled();
		return Phonepad.isDisplayed();
	}
	
	public boolean ValidCamera() {
		Camera.isEnabled();
		return Camera.isDisplayed();
	}
	
	public boolean Validmp3() {
		mp3.isEnabled();
		return mp3.isDisplayed();
	}
	
	public DesktopPage ValidDesktopPage(){
		if(Desktop.isDisplayed()) {
			Desktop.click();
		}
		return new DesktopPage();
	}
	
	public boolean ValidMackbook() {
		return macbook.isDisplayed();
	}
	
	public boolean Validiphone() {
		return iphone.isEnabled();
	}
	
	public boolean ValidApplecinema() {
		return Applecinema.isDisplayed();
	}
	
	public boolean Validcanon() {
		return canon.isDisplayed();
	}
}
