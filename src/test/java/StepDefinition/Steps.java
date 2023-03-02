package StepDefinition;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Steps {
    WebDriver driver;
    @Given("^Open the Firefox and launch the application$")
    public void open_the_Firefox_and_launch_the_application() throws Throwable{
        //System.out.println("This step open the Firefox and launch the application.");
        System.setProperty("webdriver.gecko.driver",
                "C:\\Users\\xin.gu\\SpringPractices\\cucumberwithSelenium\\src\\test\\resources\\geckodriver.exe");
        driver=new FirefoxDriver();
        driver.get("http://demo.guru99.com/v4");
    }
    @When("^Enter the Username and password$")
    public void enter_the_username_and_password () throws Throwable{
        System.out.println("This step enter the Username and Password on the login page.");
    }
    @Then("^Reset the credential$")
    public void Reset_the_credential() throws Throwable{
        System.out.println("This step click on the Rest button.");
    }

}
