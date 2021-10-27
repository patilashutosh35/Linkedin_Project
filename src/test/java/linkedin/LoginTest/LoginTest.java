package linkedin.LoginTest;

import org.testng.annotations.Test;

import linkedin.basePage.BasePage;
import linkedin.pageUi.LoginObjectRepo;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class LoginTest extends BasePage {
	@Test
	public void TC_001_LoginTest_validcred() throws Exception {
		LoginObjectRepo lor=new LoginObjectRepo(driver);
		lor.setUsername(getData("Username"));
		lor.setPassword(getData("Password"));
		lor.clickSignin();
		lor.setSearch( "abhiyan kandel nhe");
		lor.clickPeople();
		lor.clickConnect();
		lor.clickAddNote();
	}

	@BeforeMethod
	public void beforeMethod() {
		openBrowser("chrome",
				"https://www.linkedin.com/login?fromSignIn=true&trk=guest_homepage-basic_nav-header-signin");
	}

	@AfterMethod
	public void afterMethod() {
		
	}

}
