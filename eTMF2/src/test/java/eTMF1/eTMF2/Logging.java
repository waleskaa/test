package eTMF1.eTMF2;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.testng.annotations.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait; 
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebElement;

public class Logging {

	public WebDriver driver;
	public WebDriverWait wait; 
	public WebElement Element; 
	
	@Test
	public void login() {
		//driver = new FirefoxDriver();
		//WebDriver driver = new RemoteWebDriver("http://localhost:9515", DesiredCapabilities.chrome());
		//driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\waleskaa\\Downloads\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://etmf-dev.roche.com/D2/#d2");
	
		
		wait = new WebDriverWait(driver, 10000);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='x-auto-46-input']"))).sendKeys("tmfbizadmin10");
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='x-auto-49-input']"))).sendKeys("tmfbizadmin10");
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@class=' x-form-checkbox']"))).click();
		new Actions(driver).sendKeys(Keys.RETURN).build().perform();
		

		//button.x-btn-text.
		// wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//html/body/div[2]/div/div[1]/div/div[2]/div[1]/div/div/div/div/div/div/div[1]/div[2]/div[1]/div/center[3]/small"))).click();
		//*[@id="x-auto-446"]/div[2]/div[1]
	
		//x-panel-bwrap
		//*[@id="x-auto-424"]/div[2]
		
		//WebElement myDynamicElement = driver.findElement(By.id("//div[@id='x-auto-453']"));
		//WebElement myDynamicElement = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='x-panel-body x-panel-body-noheader']")));
		//driver.switchTo().defaultContent();
		
		/*	try{
		Thread.sleep(9000);
	}catch (InterruptedException e){
		System.out.println("We gara problem");
	}*/
	//String text;
		
		
		//css=#x-auto-208__x-auto-208_x-auto-414 > img..x-tree3-node-joint
		
		
		/*
		text = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class=' x-component']/center/big"))).getText();
		if(text.equals("eTMF - Business Admin")){
			System.out.println("contains");
			
		}
		else {
			System.out.println("nie contains");
		}
		
		//css=img[title="Content management workspace for eTMF (Admin)"]
		//wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#x-auto-798 > center:nth-child(2) > div > table > tbody > tr > td > img"))).click();
	    */
	    
	    //driver.quit();
	} 
}
