package testcase;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import baseClass.TestBase;
import testpage.HomePage;

public class HomePageTest extends TestBase{
	
	HomePage tst;
	
	public HomePageTest() {
		super();
	}
	
	@BeforeMethod
	public void setup() {
		set();
		tst= new HomePage();
	}
	
	@Test
	public void ValidatePageTitle(){
		String title =tst.ValidatePageTitle();
		Assert.assertEquals(title, "Yours Store");
	}
	
	@Test
	public void ValidateTitleDisplay() {
		boolean flg = tst.Validatetitle();
		Assert.assertTrue(flg);
	}
	
	@Test
	public void ValidateDesktopModule() {
		boolean flt=tst.ValidDesktopModule();
		Assert.assertTrue(flt);
	}
	
//	@Test
	public void ValidateDesktoppage() {
		tst.ValidDesktopPage();
	}
	
//	@Test
	public void ValidateLaptopnotebook() {
		boolean ft= tst.ValidLaptopnotebook();
		Assert.assertTrue(ft);
	}
	
//	@Test
	public void ValidateComponents() {
		boolean co=tst.ValidComponents();
		Assert.assertTrue(co);
	}
	
//	@Test
	public void ValidateTablets() {
		boolean tb=tst.ValidTablets();
		Assert.assertTrue(tb);
		
	}
	
//	@Test
	public void ValidatSoftware() {
		boolean so= tst.ValidSoftware();
		Assert.assertTrue(so);
	}
	
//	@Test
	public void ValidatePhonepad() {
		boolean ph=tst.ValidPhonepad();
		Assert.assertTrue(ph);
	}
	
//	@Test
	public void ValidateApplecinema() {
		boolean ap=tst.ValidApplecinema();
		Assert.assertTrue(ap);
	}
	
//	@Test
	public void Validcanon() {
		boolean ca=tst.Validcanon();
		Assert.assertTrue(ca);
	}
	

	@AfterMethod
	public void close() {
		drt.close();
	}
		


}


