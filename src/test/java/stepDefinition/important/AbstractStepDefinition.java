package stepDefinition.important;

import org.openqa.selenium.WebDriver;


public class AbstractStepDefinition {
    protected static WebDriver driver;
    protected static String chromeDriver=PropretyLoader.loadProperty("chromeDriver");
    protected static String geckodriver=PropretyLoader.loadProperty("geckodriver");
    protected static String homePageUrl=PropretyLoader.loadProperty("homePageUrl");

    public RegisterPage registerPage = new RegisterPage(driver);
}
