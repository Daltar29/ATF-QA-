package pages;

import org.openqa.selenium.WebDriver;



public class PageObjects {
    protected static WebDriver driver;

    public PageObjects(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
}