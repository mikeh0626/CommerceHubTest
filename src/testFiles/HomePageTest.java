package testFiles;
import java.io.InputStream;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObjects.BrandSolutionsPage;
import PageObjects.SolutionsPage;
import PageObjects.Webpage;


public class HomePageTest{
	
	private WebDriver driver;
	Webpage webPage;
	SolutionsPage solutionPage;
	BrandSolutionsPage brandPage;
	
	@BeforeTest
	public void setUp()
	{
		driver = new FirefoxDriver();
		System.out.println("getting webpage");
		driver.get("http://commercehub.com");
	}
	
	
	@Test
	public void getHomePage(){
		webPage = new Webpage(driver);
		webPage.verifyPageIsDisplayed();
		webPage.verifyHomePage();
		System.out.println("perform hover");
		webPage.hoverSignIn();
	}
	
	/**
	 * Test to navigate to solutions page
	 * verify that the subnavigation menu is visible and
	 * size is 4 
	 */
	
	@Test
	public void testSolutionsPage()
	{
		solutionPage=webPage.clickOnSolutions(driver);
		solutionPage.verifySolutionsPage();
		solutionPage.verifySubNav();
		solutionPage.clickSolutionsForBrands();
	}
	
	
	
	/*
	 * uses solutionpage object to click on brand for solutions 
	 * link and verifies some page elements
	 */
	
	
	/*@Test
	public void SignIn()
	{
		solutionPage=webPage.clickOnSolutions(driver);
		//solutionPage.hoverSignIn();
	}*/
}