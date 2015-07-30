package PageObjects;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.*;

public class Webpage {
	/*@BeforeSuite
	public void BeforeSuit(){
		System.out.println("<=========Starting test suite========>");
	}
	
	@AfterSuite
	public void AfterSuite(){
		System.out.println("<===========Finished test suit-------->");
	}*/
	
		

	
	private static WebDriver driver;
	private String title = "Keep Growing - CommerceHub";
	private By body = By.cssSelector("body");
	private By solutions = By.linkText("Solutions");
	private By signUp = By.linkText("Sign In");
	
	public Webpage(WebDriver drive){
		this.driver = drive;
		
	}
	
	//@AfterSuite
	public void closeBeowser(){
		driver.quit();
	}
	
	public void verifyHomePage()
	{
		Assert.assertEquals(this.driver.getTitle(), title);
		//System.out.println(driver.getTitle());
	}
	
	public void verifyPageIsDisplayed()
	{
		Assert.assertTrue(driver.findElement(body).isDisplayed(), "The page didnt load correctly");
	}
	
	public SolutionsPage clickOnSolutions(WebDriver drive)
	{
		driver.findElement(solutions).click();
		return new SolutionsPage(driver);
	}
	
	public void hoverSignIn(){
		System.out.println("in hover sign in");
		Actions moveTo = new Actions(driver);
		moveTo.moveToElement(driver.findElement(signUp));
		//moveTo.keyDown(Keys.ARROW_DOWN);
		moveTo.perform();
		//System.out.println(driver.findElement(signUp).getText());
	
	}
}
