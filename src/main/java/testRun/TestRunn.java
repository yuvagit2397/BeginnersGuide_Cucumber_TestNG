package testRun;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


/*@CucumberOptions(features="D:\\yuvasri_revision\\BeginnersGuide_Cucumber_TestNG"
		+ "\\src\\main\\java\\feautres\\HomePage.feature",glue="stepDefinitions"
				,dryRun=true
	
)*/
public class TestRunn{

public  void runEx() {
	System.setProperty("webdriver.chrome.driver", "D:\\javaSeleniumJars\\driver"
			+ "\\chrome87\\chromedriver.exe");
WebDriver driver=new ChromeDriver();

}
}
