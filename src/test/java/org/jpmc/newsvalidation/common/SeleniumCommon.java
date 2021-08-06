package org.jpmc.newsvalidation.common;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumCommon {

	Logger log = Logger.getLogger(SeleniumCommon.class);

	public void waitForElementToBeClickable(WebElement objelem, int seconds) throws Exception {

		WebDriverWait wait = new WebDriverWait(Driver.getDriverInstance(), seconds);
		wait.until(ExpectedConditions.elementToBeClickable(objelem));

	}

	// returns element visibility
	public WebElement getElementOnceAvailable(WebElement elem, int seconds) throws Exception {

		WebDriverWait wait = new WebDriverWait(Driver.getDriverInstance(), seconds);
		return wait.until(ExpectedConditions.visibilityOf(elem));

	}

	public void JsClick(WebElement elem) throws Exception {

		JavascriptExecutor js = (JavascriptExecutor) Driver.getDriverInstance();
		js.executeScript("arguments[0].click();", elem);

	}

	// switch to iframe
	public void switchToIframe(String nameorid) throws Exception {

		Driver.getDriverInstance().manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		Driver.getDriverInstance().switchTo().frame(nameorid);
		log.info("Frame switched successfully");

	}

	public void getAllElementLinks(String searchnews) throws Exception {
		try{
		List<WebElement> elemlinks = Driver.getDriverInstance().findElements(By.tagName("a"));

		for (WebElement alllinks : elemlinks) {
			System.out.println(alllinks.getText() + "--- " + alllinks.getAttribute("href"));
			if (alllinks.getText().contains(searchnews)) {
				Assert.assertTrue(alllinks.getText().contains(searchnews));
			}
		}
		}catch(Exception e){
			e.getMessage();
		}
	}

	// Using Selenium Methods Search elements in page
	public void searchElementsInPage(String strsearchnews, String strtosplit) throws Exception {
		String[] strarr = strsearchnews.split(strtosplit);
		log.info("split until : ##" + strarr[0]);
		List<WebElement> newsTextList = Driver.getDriverInstance()
				.findElements(By.xpath("//*[contains(text(),'" + strarr[0] + "')]"));
		for (WebElement we : newsTextList) {

			log.info("split until : ##" + we.getText());

		}
	}

	// returns Element text
	public String getElementText(WebElement we) {
		return we.getText();
	}

	public void readPageSource(String strsearchnews) throws Exception {
		if (Driver.getDriverInstance().getPageSource().contains(strsearchnews)) {
			log.info("News Present :");
		} else {
			log.info("News NOT Present :");

		}
	}

	public void closeDriver() throws Exception {
		System.out.println("quitting driver");
		if (Driver.getDriverInstance() != null) {
			Driver.getDriverInstance().close();

		}
	}

}
