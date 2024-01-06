package stepdefs;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepDefs {

	WebDriver driver = BaseClass.driver;
	
	@Given("I have launched the application")
	public void i_have_launched_the_application() throws InterruptedException {
		driver.get("https://pizzahut.co.in");
	}

	@When("I enter location as {string}")
	public void i_enter_location_as(String location) {
		WebElement location_field = driver.findElement(By.xpath("//input[@placeholder='Enter your location for delivery']"));
		location_field.sendKeys(location);	
	}

	@When("I select first suggestion from list")
	public void i_select_first_suggestion_from_list() {
		WebElement first_suggestion = driver.findElement(By.xpath("//*[contains(text(),'Pune Railway Station')]"));
		first_suggestion.click();
		
	}

	@Then("I should land on deals page")
	public void i_should_land_on_deals_page() throws InterruptedException {
		Thread.sleep(4000);
		System.out.println(driver.getCurrentUrl());
		Assert.assertTrue(driver.getCurrentUrl().endsWith("/order/deals/"));
	}

	@Then("I select the tab as {string}")
	public void i_select_the_tab_as(String tab) throws InterruptedException {
		Thread.sleep(5000);
		WebElement menuTab = driver.findElement(By.xpath("//div[contains(@class,'side-menu')]//a[@href='/order/pizzas/']//span"));
		menuTab.click();
	}

	@Then("I select the pizza as {string}")
	public void i_select_the_pizza_as(String pizza) throws InterruptedException {
		Thread.sleep(2000);
		WebElement selectPizza = driver.findElement(By.xpath("//div[contains(text(),'" + pizza + "')]//ancestor::a[contains(@class,'list-item')]//button//span"));
		selectPizza.click();
		Thread.sleep(2000);
		WebElement selectSize = driver.findElement(By.xpath("//div[contains(text(),'Original Pan crust')]"));
		selectSize.click();
		Thread.sleep(2000);
		WebElement addToBasket = driver.findElement(By.xpath("//div[@id='product']//button[contains(@class,'button--green')]//span//span[contains(text(),'Add to my basket')]"));
		addToBasket.click();
	}

	@Then("I should see {string} pizza added to cart")
	public void i_should_see_pizza_added_to_cart(String pizza) throws InterruptedException {
		Thread.sleep(3000);
		WebElement cartItem = driver.findElement(By.xpath("//div[contains(@class,'basket-item-product')]//div[contains(text(),'" + pizza + "')]"));
		Assert.assertEquals(cartItem.isDisplayed(), true);
	}

	@Then("I click on checkout button")
	public void i_click_on_checkout_button() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Then("I should land on checkout page")
	public void i_should_land_on_checkout_page() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Then("I enter personal details")
	public void i_enter_personal_details(io.cucumber.datatable.DataTable dataTable) {
		// Write code here that turns the phrase above into concrete actions
		// For automatic transformation, change DataTable to one of
		// E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
		// Map<K, List<V>>. E,K,V must be a String, Integer, Float,
		// Double, Byte, Short, Long, BigInteger or BigDecimal.
		//
		// For other transformations you can register a DataTableType.
		throw new io.cucumber.java.PendingException();
	}

	@Then("I enter address details")
	public void i_enter_address_details(io.cucumber.datatable.DataTable dataTable) {
		// Write code here that turns the phrase above into concrete actions
		// For automatic transformation, change DataTable to one of
		// E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
		// Map<K, List<V>>. E,K,V must be a String, Integer, Float,
		// Double, Byte, Short, Long, BigInteger or BigDecimal.
		//
		// For other transformations you can register a DataTableType.
		throw new io.cucumber.java.PendingException();
	}

	@Then("I should see three payment options")
	public void i_should_see_three_payment_options(io.cucumber.datatable.DataTable dataTable) {
		// Write code here that turns the phrase above into concrete actions
		// For automatic transformation, change DataTable to one of
		// E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
		// Map<K, List<V>>. E,K,V must be a String, Integer, Float,
		// Double, Byte, Short, Long, BigInteger or BigDecimal.
		//
		// For other transformations you can register a DataTableType.
		throw new io.cucumber.java.PendingException();
	}

	@Then("I select the payment option as {string}")
	public void i_select_the_payment_option_as(String string) {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

}
