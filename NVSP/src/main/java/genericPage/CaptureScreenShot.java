package genericPage;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;

public class CaptureScreenShot {

	public WebDriver driver;
	
	public void screenShotOnFailure(ITestResult result) throws Exception {
		
		if(ITestResult.FAILURE == result.getStatus()) {
			
			TakesScreenshot ts = (TakesScreenshot)driver;
			
			File source = ts.getScreenshotAs(OutputType.FILE);
			
			FileUtils.copyFile(source, new File("./src/test/resources/screenShots" + result.getName() + ".png"));
			
			System.out.println("screenshot captured");
		}
		
	}
	
	
}
