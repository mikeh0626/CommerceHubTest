package PageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;


public class SolutionsPage {
	private WebDriver driver;
	private String title = "Solutions for Retailers - CommerceHub";
	private By subNav = By.cssSelector("ul.sub-navigaiton li");
	private By brandSolutions = By.linkText("Solutions for Brands");
	private By orderStream = By.linkText("OrderStream");
	
	public SolutionsPage(WebDriver drive)
	{
		this.driver = drive;
	}
	
	
	public void verifySolutionsPage()
	{
		By sub = By.cssSelector("li");
		Assert.assertEquals(driver.getTitle().toString(), title);
	}
	
	public void verifySubNav()
	{
		List<WebElement>subNavOpt;
		System.out.println((driver.findElement(subNav).isDisplayed()));
		subNavOpt = driver.findElements(subNav);
		Assert.assertEquals(subNavOpt.size(), 4);
	}
	
	public BrandSolutionsPage clickSolutionsForBrands()
	{
		driver.findElement(brandSolutions).click();
		return new BrandSolutionsPage(driver);
	}
	
	
}
