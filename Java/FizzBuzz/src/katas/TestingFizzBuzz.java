package testingKatas;

import static org.junit.Assert.*;

import katas.FizzBuzz;
import org.junit.Test;



public class TestingFizzBuzz {
	
    

	@Test
	public void whenNumberIsThree_ThenOutputShouldBeFizz(){
		FizzBuzz tester = new FizzBuzz();
		assertEquals("Fizz", tester.giveNumberFizzOrBuzzOrFizzBuzz(3));
	}
	
	@Test
	public void whenNumberIsFive_ThenOutputShouldBeBuzz(){
		FizzBuzz tester = new FizzBuzz();
		assertEquals("Buzz", tester.giveNumberFizzOrBuzzOrFizzBuzz(5));
	}
	
	@Test
	public void whenNumberIsFivteen_ThenOutputShouldBeFizzBuzz(){
		FizzBuzz tester = new FizzBuzz();
		assertEquals("FizzBuzz", tester.giveNumberFizzOrBuzzOrFizzBuzz(15));
	}
	
	@Test
	public void whenNumberIsOne_ThenOutputShouldBe1(){
		FizzBuzz tester = new FizzBuzz();
		assertEquals("1", tester.giveNumberFizzOrBuzzOrFizzBuzz(1));
	}
	
	@Test
	public void whenNumberContainsFive_ThenOutputShouldBeBuzz(){
		FizzBuzz tester = new FizzBuzz();
		assertEquals("Buzz", tester.giveNumberFizzOrBuzzOrFizzBuzzVariation("57"));
	}
	
	@Test
	public void whenNumberContainsThree_ThenOutputShouldBeBuzz(){
		FizzBuzz tester = new FizzBuzz();
		assertEquals("Fizz", tester.giveNumberFizzOrBuzzOrFizzBuzzVariation("32"));
	}
	
	@Test
	public void whenNumberContainsThreeAndFive_ThenOutputShouldBeBuzz(){
		FizzBuzz tester = new FizzBuzz();
		assertEquals("FizzBuzz", tester.giveNumberFizzOrBuzzOrFizzBuzzVariation("53"));
	}
	
	@Test
	public void whenNumberDoesNotContainThreeOrFive_ThenOutputShouldBeNumber(){
		FizzBuzz tester = new FizzBuzz();
		assertEquals("66", tester.giveNumberFizzOrBuzzOrFizzBuzzVariation("66"));
	}
	
	
}
