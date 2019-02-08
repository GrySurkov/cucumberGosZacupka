package stepdefs;

import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;


public class Test2 {
    private WebDriver driver;


    @When("^i am on \"([^\"]*)\" page$")
    public void i_am_on_page(String url) {
        System.setProperty("webdriver.chrome.driver", "D:\\JavaProject\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(url);
    }

    @Then("^i see \"([^\"]*)\" and click them$")
    public void i_see_and_click_them(String btn) {
        driver.findElement(By.linkText(btn)).click();
    }

    @Then("^i found element by xpath \"([^\"]*)\" and enter \"([^\"]*)\"$")
    public void i_found_element_by_xpath_and_entering(String xpath, String data) {
        driver.findElement(By.xpath(xpath)).sendKeys(data);
    }

    @Then("^i found element by id \"([^\"]*)\" and enter \"([^\"]*)\"$")
    public void i_found_element_by_id_and_entering(String id, String data) {
        driver.findElement(By.id(id)).sendKeys(data);
    }

    @Then("^i found element by cssSelector \"([^\"]*)\" and enter \"([^\"]*)\"$")
    public void i_found_element_by_cssSelector_and_entering(String cssSelector, String data) {
        driver.findElement(By.cssSelector(cssSelector)).sendKeys(data);
    }

    @Then("^i found element by id \"([^\"]*)\" and click them$")
    public void i_found_element_by_id_and_click_them(String id) {
        driver.findElement(By.id(id)).click();
    }

    @Then("^i found element by cssSelector \"([^\"]*)\" and click them$")
    public void i_found_element_by_cssSelector_and_click_them(String cssSelector) {
        driver.findElement(By.cssSelector(cssSelector)).click();
    }

    @Then("^i get list of elements by class name\"([^\"]*)\" and choose element \"([^\"]*)\"$")
    public void i_get_list_of_elements_by_class_name_and_choose_element(String className, String element) {
        WebElement ul = driver.findElement(By.className(className));
        List<WebElement> li = ul.findElements(By.xpath(".//li"));
        for (int i = 0; i < li.size(); i++) {
            String str = li.get(i).getText();
            if (str.toLowerCase().contains(element.toLowerCase())) {
                li.get(i).findElement(By.xpath("./span")).click();
                return;
            }
        }
    }

    @Then("^i get list of elements by cssSelector \"([^\"]*)\" and choose elements \"([^\"]*)\"$")
    public void i_get_list_of_elements_by_cssSelector_and_choose_elements(String cssSelector, String element) {
        WebElement ul = driver.findElement(By.cssSelector(cssSelector));
        List<WebElement> li = ul.findElements(By.xpath(".//li"));
        for (int i = 0; i < li.size(); i++) {
            String str = li.get(i).getText();
            if (str.toLowerCase().contains(element.toLowerCase())) {
                if (!(li.get(i).findElement(By.xpath("./input")).isSelected())) {
                    li.get(i).findElement(By.xpath("./label")).click();
                }
            } else {
                if (li.get(i).findElement(By.xpath("./input")).isSelected()) {
                    li.get(i).findElement(By.xpath("./label")).click();
                }
            }
        }
    }
}
