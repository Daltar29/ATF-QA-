package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;

public class LoginSteps {
    static final String NAME="Ser28";
    WebDriver driver=null;
    @Given("User navigate to the website homepage")
    public void User_navigate_to_the_website_homepage() {
        System.out.println("User Navigates to ui");
        System.setProperty("webdriver.chrome.driver","C:\\Users\\step\\IdeaProjects\\TheBest24\\src\\webdriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.navigate().to("https://parabank.parasoft.com/ ");
        driver.manage().window().maximize();
    }

    @And("User navigates to Register Page")
    public void userNavigatesToRegisterPage(){
        String RegisterText = driver.findElement(By.partialLinkText("Regis")).getText();
        assertEquals(RegisterText, driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/p[2]/a")).getText());
        driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/p[2]/a")).click();
        String signingUpIsEasy=driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/h1")).getText();
        assertEquals(signingUpIsEasy,driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/h1")).getText());
    }

    @When("User give userName")
    public void user_give_userName() {
        driver.findElement(By.id("customer.firstName")).sendKeys("Sergiu");

    }
    @When("User give lastName")
    public void user_give_lastName(){
        driver.findElement(By.id("customer.lastName")).sendKeys("Schiopu");
    }

    @When("User give customer address city")
    public void user_give_cutomer_address_city(){
        driver.findElement(By.id("customer.address.city")).sendKeys("Chisinau" );

    }

    @When("User give customer address state")
    public void user_give_customer_address_state(){
        driver.findElement(By.id("customer.address.state")).sendKeys("Moldova");
    }

    @Then("User press register")
    public void user_press_register(){
        driver.findElement(By.xpath("//*[@id=\"customerForm\"]/table/tbody/tr[13]/td[2]/input")).click();

    }

    @Then("User have some error messages")
    public void user_have_some_error_messages(){
        String customerAddressErrors=driver.findElement(By.id("customer.address.street")).getText();
        String customerZipCodeErrors=driver.findElement(By.id("customer.address.zipCode")).getText();
        String customerPhoneErrors=driver.findElement(By.id("customer.phoneNumber")).getText();
        String customerSSNErrors=driver.findElement(By.id("customer.ssn")).getText();
        String customerUsernameErrors=driver.findElement(By.id("customer.username.errors")).getText();
        String customerPasswordErrors=driver.findElement(By.id("customer.password")).getText();
        String repeatedPasswordErrors=driver.findElement(By.id("repeatedPassword")).getText();
        assertEquals(customerAddressErrors,driver.findElement(By.id("customer.address.street")).getText());
        assertEquals(customerZipCodeErrors,driver.findElement(By.id("customer.address.zipCode")).getText());
        assertEquals(customerPhoneErrors,driver.findElement(By.id("customer.phoneNumber")).getText());
        assertEquals(customerSSNErrors,driver.findElement(By.id("customer.ssn")).getText());
        assertEquals(customerUsernameErrors,driver.findElement(By.id("customer.username.errors")).getText());
        assertEquals(customerPasswordErrors,driver.findElement(By.id("customer.password")).getText());
        assertEquals(repeatedPasswordErrors,driver.findElement(By.id("repeatedPassword")).getText());
    }

    @Then("User insert fields with valid data")
    public void user_insert_fields_with_valid_data(){

        driver.findElement(By.id("customer.address.street")).sendKeys("Studentilor 7");
        driver.findElement(By.id("customer.address.zipCode")).sendKeys("2004");
        driver.findElement(By.id("customer.phoneNumber")).sendKeys("68815774");
        driver.findElement(By.id("customer.ssn")).sendKeys("ssn");
        driver.findElement(By.id("customer.username")).sendKeys(NAME);
        driver.findElement(By.id("customer.password")).sendKeys("12345");
        driver.findElement(By.id("repeatedPassword")).sendKeys("12345");
    }

    @Then("User clicks on Register")
    public void userClickOnRegister(){
        driver.findElement(By.xpath("//*[@id=\"customerForm\"]/table/tbody/tr[13]/td[2]/input")).click();
    }
    @Then("User confirm name")
    public void userConfirmName(){
        assertEquals("Welcome "+NAME,driver.findElement(By.className("title")).getText());
    }
    @Then("User insert pass")
    public void User_insert_pass() throws InterruptedException {
        Thread.sleep(5000);
    }
}
