package StepDefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class orderProductStep {
    @When("User click to check out")
    public void user_click_to_check_out() {
        System.out.println("User click to check out");
    }
    @Then("User can order successfully")
    public void user_can_order_successfully() {
        System.out.println("User can order successfully");
    }
}
