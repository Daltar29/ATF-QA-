package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import stepDefinition.important.AbstractStepDefinition;

import static driverManager.DriverManagerFactory.getDriver;
import static driverManager.DriverManagerFactory.quitDriver;
import static driverManager.DriverType.CHROME;

public class Hooks extends AbstractStepDefinition {
    @Before("@UI")
    public void beforeTest(){getDriver(CHROME);}
    @After("@UI")
    public void afterTest(){quitDriver();}
}
