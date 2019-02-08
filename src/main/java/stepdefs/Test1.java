package stepdefs;

import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

import static junit.framework.TestCase.fail;

public class Test1 {

        WebDriver driver;

        @When("^I am on x page$")
        public void i_am_on_x_page() throws Throwable {
            System.setProperty("webdriver.chrome.driver", "D:\\JavaProject\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            System.out.println("I am on x page");
            driver.get("https://gossluzhba.gov.ru");
        }
        @Then("^I see that element$")
        public void i_see_that_element() throws Throwable {
            System.out.println("I see that element");
            driver.findElement(By.linkText("Вакансии")).click();
        }
    }

