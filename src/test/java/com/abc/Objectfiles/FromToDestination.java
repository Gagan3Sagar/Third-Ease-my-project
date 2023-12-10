package com.abc.Objectfiles;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class FromToDestination 
{


	ChromeDriver myDriver;
	
	public FromToDestination(ChromeDriver myDriver)
	{
		this.myDriver=myDriver;
	}
  private By FromClickingFrom=By.id("FromSector_show");
    
  private By FromTypinginFrom=By.id("a_FromSector_show");
	
  private By FromSelectingInFrom=By.xpath("/html/body/form/div[5]/div[3]/div/div[3]/div/div[1]/div[2]/div[2]/ul/li[7]/div/div[1]/p[1]/span");
	
  private By FromTypingTo=By.xpath("/html/body/form/div[5]/div[3]/div/div[3]/div/div[3]/div[2]/div[1]/input");
    
  private By FromSelectingTo=By.id("spnBangkok");
		
  private By SelectingandClickingddate=By.id("frth_3_24/01/2024");
	
  private By FromDropDown=By.id("iDownArr");
    
  private By FromChild=By.xpath("/html/body/form/div[5]/div[3]/div/div[3]/div/div[6]/div[2]/div/div[2]/div[2]/button[2]");
	
  private By FromChild1=By.xpath("/html/body/form/div[5]/div[3]/div/div[3]/div/div[6]/div[2]/div/div[2]/div[2]/button[2]");
	
  private By FromInfant=By.xpath("/html/body/form/div[5]/div[3]/div/div[3]/div/div[6]/div[2]/div/div[3]/div[2]/button[2]");
	
  private By FromDone=By.xpath("/html/body/form/div[5]/div[3]/div/div[3]/div/div[6]/div[2]/div/a");
	
  private By FromSearch=By.xpath("/html/body/form/div[5]/div[3]/div/div[3]/div/div[7]/button");
	
	public void FromClickingFrom()
	{
		myDriver.findElement(FromClickingFrom).click();
	}
	
	
	public void FromTypinginFrom()
	{
		myDriver.findElement(FromTypinginFrom).sendKeys("New York");
	
	}
	
	
	public void FromSelectingInFrom()
	{
		try
		{
		myDriver.findElement(FromSelectingInFrom).click();
		}
		catch(StaleElementReferenceException e)
		{
		myDriver.findElement(FromSelectingInFrom).click();
		}
	}
	
	public void FromTypingTo() 
	{
		myDriver.findElement(FromTypingTo).sendKeys("BANGKOK");	
		
	}
		
	public void FromSelectingTo()
	{
		myDriver.findElement(FromSelectingTo).click();
	}

	public void SelectingandClickingddate()
	{
		myDriver.findElement(SelectingandClickingddate).click();
		
	}
	
	public void FromDropDown()
	{
		myDriver.findElement(FromDropDown).click();
	
	}
	public void FromChild()
	{
		WebElement element = myDriver.findElement(By.xpath("/html/body/form/div[5]/div[3]/div/div[3]/div/div[6]/div[2]/div/div[2]/div[2]/button[2]"));
		JavascriptExecutor executor = (JavascriptExecutor) myDriver;
		executor.executeScript("arguments[0].click();", element);
		myDriver.findElement(FromChild).click();
	}
	public void FromChild1()
	{
		myDriver.findElement(FromChild1).click();
	}
	public void FromInfant()
	{
		myDriver.findElement(FromInfant).click();
	}
	
	public void FromDone()
	{
		myDriver.findElement(FromDone).click();
	}
	public void FromSearch()
	{
		myDriver.findElement(FromSearch).click();
	}	
	
	}