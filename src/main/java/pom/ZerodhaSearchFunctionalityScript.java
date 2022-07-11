package pom;

import java.time.Duration;
import java.time.temporal.TemporalAmount;
import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ZerodhaSearchFunctionalityScript {
	WebDriver driver;

	
	
	@FindBy (xpath ="//input[@icon='search']") private WebElement searchTab;
	@FindBy (xpath ="//span[@class='nice-name']") private List<WebElement> shares;
	@FindBy (xpath ="//button[@title='Buy']") private WebElement watchlistBuy;
	
	
	
	public ZerodhaSearchFunctionalityScript(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	public void enterStocktoSearch(String StockName) {
		searchTab.sendKeys(StockName);
	}
	
	public void selectShareFromWatchListAndBuy(String shareName,WebDriver driver) {
		WebDriverWait wait =new WebDriverWait(driver,Duration.ofMillis(3000));
		wait.until(ExpectedConditions.visibilityOf(searchTab));
		
		System.out.println(shares.size());
		for(int i=0;i<shares.size();i++)
		{
			WebElement stock=shares.get(i);
			
			String stockName =stock.getText();
			
			if(stockName.equals(shareName))
			{
				Actions act=new Actions(driver);
				act.moveToElement(stock);
				act.perform();
				watchlistBuy.click();
				
			}
			
		}
		}
}
