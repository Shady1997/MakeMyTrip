package pages;

import java.awt.AWTException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage_Flight {

	WebDriver driver;

	public HomePage_Flight(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//li[@data-cy='account']")
	private WebElement loginButton;

	@FindBy(xpath = "//input[@data-cy='userName']")
	private WebElement email;

	@FindBy(xpath = "//button[@data-cy='continueBtn']")
	private WebElement continueButton;

	@FindBy(xpath = "//input[@data-cy='password']")
	private WebElement password;

	@FindBy(xpath = "//button[@data-cy='login']")
	private WebElement login;

	@FindBy(xpath = "//li[@data-cy='roundTrip']")
	private WebElement flightType;

	@FindBy(id = "toCity")
	private WebElement toCity;

	@FindBy(id = "fromCity")
	private WebElement fromCity;

	@FindBy(xpath = "//input[@placeholder='From']")
	private WebElement searchFieldFrom;

	@FindBy(xpath = "//input[@placeholder='To']")
	private WebElement searchFieldTo;

	@FindBy(xpath = "(//li[@class='font12 blackText latoBold wrapFilter  '])[3]")
	private WebElement fairType;

	public void loginToApplication() throws InterruptedException {
		loginButton.click();
		Thread.sleep(2000);
		email.sendKeys(PageBase.getExcelData(1, 0, "Sheet1"));
		Thread.sleep(1000);
		continueButton.click();
		Thread.sleep(90000);
		password.sendKeys(PageBase.getExcelData(1, 1, "Sheet1"));
		Thread.sleep(1000);
		login.click();
		Thread.sleep(2000);
	}

	public void searchFlight() throws InterruptedException, AWTException {
		flightType.click();

		fromCity.click();
		Thread.sleep(2000);
		searchFieldFrom.sendKeys("Egypt");
		Thread.sleep(2000);
		searchFieldFrom.sendKeys(Keys.ARROW_DOWN, Keys.ENTER);
		Thread.sleep(2000);

		toCity.click();
		Thread.sleep(5000);
		searchFieldTo.sendKeys("India");
		Thread.sleep(2000);
		searchFieldTo.sendKeys(Keys.ARROW_DOWN, Keys.ENTER);
		Thread.sleep(9000);
	}

}
