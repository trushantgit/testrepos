package baseClass;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	
	protected static WebDriver drt;
	
	public static void set() {
		WebDriverManager.chromiumdriver().setup();
		drt = new ChromeDriver();
		drt.manage().window().maximize();
		drt.manage().timeouts().pageLoadTimeout(120, TimeUnit.SECONDS);
		drt.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		drt.navigate().to("http://tutorialsninja.com/demo/");
	}
	
	
	public static void screnShot() throws Exception {
		
		TakesScreenshot ts = (TakesScreenshot)drt;
		File Take = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(Take, new File("./ScreenShot/"+"picture"+".png"));
	}

}
