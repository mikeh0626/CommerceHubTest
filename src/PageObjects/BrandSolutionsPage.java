package PageObjects;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class BrandSolutionsPage {
	
	private WebDriver driver;
	private String title = "Solutions for Brands - CommerceHub";
	public BrandSolutionsPage(WebDriver drive)
	{
		this.driver = drive;
	}
	
	
	public void verifyBrandPage(){
		Assert.assertEquals(driver.getTitle(), title);
	}
	
	public String getTitle()
	{
		return driver.getTitle().toString();
	}
	
	/*public SolutionsPage BrandPageGoBack()
	{
		this.driver.navigate().back();
		return new SolutionsPage(this.driver);
	}*/

}
