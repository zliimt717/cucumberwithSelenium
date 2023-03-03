package StepDefinition;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Steps {
    WebDriver driver;
    @Given("^Open the Firefox and launch the application$")
    public void open_the_Firefox_and_launch_the_application() throws Throwable{
        //System.out.println("This step open the Firefox and launch the application.");
        System.setProperty("webdriver.gecko.driver",
                "C:\\Users\\xin.gu\\SpringPractices\\cucumberwithSelenium\\src\\test\\Drivers\\geckodriver.exe");
        driver=new FirefoxDriver();
        driver.get("https://demo.guru99.com/v1/index.php");
    }
    @When("^Enter the Username \"(.*)\" and Password \"(.*)\"$")
    public void enter_the_Username_and_Password (String username, String password) throws Throwable{
        driver.findElement(By.name("uid")).sendKeys(username);
        driver.findElement(By.name("password")).sendKeys(password);
    }
    @Then("^Reset the credential$")
    public void Reset_the_credential() throws Throwable{
        driver.findElement(By.name("btnReset")).click();
    }

}
