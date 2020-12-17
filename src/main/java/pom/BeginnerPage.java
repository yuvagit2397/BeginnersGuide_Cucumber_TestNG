package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BeginnerPage {
	public static WebDriver driver;
	@FindBy(xpath="//ul/li[1]")
	public static WebElement chapter1;

	public static WebElement getChapter1() {
		return chapter1;
	}
	
	
	@FindBy(xpath="//div[@class='mainbody']/p[1]")
	public static WebElement verifyTxt;

	public static WebElement getVerifyTxt() {
		return verifyTxt;
	}
	public BeginnerPage(WebDriver bdriver) {
		this.driver=bdriver;
		PageFactory.initElements(driver, this);
	}

}
