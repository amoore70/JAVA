HomePage.java
public class HomePage {

	private final WebDriver driver;

	private final static Logger logger = LoggerFactory
	.getLogger(HomePage.class);

	public HomePage(WebDriver driver) {
		super();
		this.driver = driver;

		Wait wait = new FluentWait(driver)
	       .withTimeout(30, SECONDS)
	       .pollingEvery(2, SECONDS);

	     wait.until(ExpectedConditions.titleIs("Your Contacts"));

	}

	public String getHomePageWelcomeMessage() throws Exception{

		return driver.findElement(By.xpath("/html/body/h1")).getText();

	}

}
