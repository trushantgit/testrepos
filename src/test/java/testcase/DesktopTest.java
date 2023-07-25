package testcase;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import baseClass.TestBase;
import testpage.DesktopPage;
import testpage.HomePage;

public class DesktopTest extends TestBase{
	
	DesktopPage pg;
	HomePage hm;
	
	public DesktopTest() {
		super();
	}
	
	
	@BeforeMethod
	public void Start() {
		set();
		pg = new DesktopPage();
		hm =new HomePage();
		pg.Desktop();	
	}
	 
	@Test(priority=1)
	public void ValidDesktopMac() {
		boolean dm=pg.Desktop_Module();
		Assert.assertTrue(dm);
	}
	@Test(enabled=false)
	public void Validsortbytext() {
		boolean so=pg.validatesortbytext();
		Assert.assertTrue(so);
	}
	
	@Test
	public void Validshowtext() {
		boolean sh=pg.Validateshowtext();
		Assert.assertTrue(sh);
	}
	
	@Test 
	public void ValidiMac() {
		boolean im=pg.ValidateiMac();
		Assert.assertTrue(im);
	}
	
	@Test
	public void Validprice() {
		boolean pr=pg.ValidateImacPrice();
		Assert.assertTrue(pr);
	}
	
	@Test
	public void Validsortby_DropDown() {
		String sort =pg.Validatesortby_DropDown();
		Assert.assertEquals(sort, "Price (Low > High)");
			
	}
	
	@Test
	public void Validshow_DropDown() {
		String show=pg.Validateshow_DropDown();
		Assert.assertEquals(show, "75");
	}
	
	@Test
	public void ValidSelectiMac() {
		boolean se=pg.SelectiMac();
		Assert.assertTrue(se);
	}
	
	
	@AfterMethod
	public void TearDown() {
		drt.quit();
	}


}
