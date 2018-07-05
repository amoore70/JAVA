public class LoginTest {

	private final static Logger logger = LoggerFactory.getLogger(LoginTest.class);
	private final static WebDriver driver = new FirefoxDriver();
	private final static String hostAndPortAndContext = "http://localhost:8081/spring-security-samples-contacts-3.0.8.CI-20110909.121734-1";
	private final static String securedURI = "/secure/index.htm";
	private final static String logoutURI = "/j_spring_security_logout";

	 @AfterClass public static void afterAllIsSaidAndDone() {
		 driver.quit();
	 }

	@After
	public void after() {
		driver.get(hostAndPortAndContext+logoutURI);
		driver.manage().deleteAllCookies();
	}

	@Before
	public void before() {
		driver.get(hostAndPortAndContext+securedURI);
	}

	@Test
	public void testLogin() throws Exception {

		LoginPage loginPage = new LoginPage(driver);
		HomePage homePage = loginPage.loginAs("rod", "koala");
		assertEquals("rod's Contacts",homePage.getHomePageWelcomeMessage());

	}

	@Test
	public void testFailedLogin() throws Exception {

		LoginPage loginPage = new LoginPage(driver);
		loginPage.failLoginAs("nobody", "WRONG");
		assertTrue(loginPage.getErrorMessage().contains("Reason: Bad credentials."));
	}

}