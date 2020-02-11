package cucumberp;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class stepgen {
	
		
		@Given(" I enter 50 in the calculator")
		public void I_enter_50_in_the_calculator() {
			System.out.println("I enter 50 in the calculator");
		}
		@And("I press add")
		public void I_press_add() {
			System.out.println("I press add");
		}
		

}

