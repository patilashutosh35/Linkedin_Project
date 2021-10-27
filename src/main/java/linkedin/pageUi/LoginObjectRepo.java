package linkedin.pageUi;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginObjectRepo {
	WebDriver driver;

	@FindBy(xpath = "//input[@id='username']")
	WebElement TextUsername;
	@FindBy(xpath = "//input[@id='password']")
	WebElement TextPassword;
	@FindBy(xpath = "//button[@type='submit']")
	WebElement btnSignin;
	@FindBy(xpath = "//button[@class='secondary-action']")
	WebElement btnSkip;
	@FindBy(xpath = "//input[starts-with(@class,'search-global-typeahead')]")
	WebElement TextSearch;
	@FindBy(xpath = "//div[@id='search-reusables__filters-bar']//ul//li//button")
	List<WebElement> btnPeople;
	@FindBy(xpath = "//div[@class='entity-result__actions entity-result__divider']//div//button")
	List<WebElement> btnConnect;
	@FindBy(xpath = "//button[@aria-label='Add a note']")
	WebElement btnAddNote;

	public LoginObjectRepo(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void setUsername(String uname) {
		TextUsername.sendKeys(uname);
	}

	public void setPassword(String pWord) {
		TextPassword.sendKeys(pWord);
	}

	public void clickSignin() {
		btnSignin.click();

	}

	public void clickSkip() {
		btnSkip.click();
	}

	public void setSearch(String srch) throws Exception {
		TextSearch.click();
		TextSearch.sendKeys(srch);
		TextSearch.sendKeys(Keys.ENTER);
	}

	public void clickPeople() throws Exception {
		Thread.sleep(6000);
		for (WebElement people : btnPeople) {
			if (people.getText().equalsIgnoreCase("people"))
				;
			people.click();
			break;
		}

	}

	public void clickConnect() throws Exception {
		Thread.sleep(3000);
		for (WebElement cnect : btnConnect) {
			cnect.click();
		}

	}

	public void clickAddNote() throws Exception {
		Thread.sleep(1000);
		btnAddNote.click();
	}

}
