package katas;

public class FizzBuzz {

	public static void main (String [] args){
		FizzBuzz fizzBuzz = new FizzBuzz();
		fizzBuzz.giveNumbersFromZeroToHundredAndFizzOrBuzzOrFizzBuzz();
	}
	
	public void giveNumbersFromZeroToHundredAndFizzOrBuzzOrFizzBuzz(){
		
		for(int i = 0; i<=100; i++){
			giveNumberFizzOrBuzzOrFizzBuzz(i);
			giveNumberFizzOrBuzzOrFizzBuzzVariation(Integer.toString(i));
		}
	}
	
	public String giveNumberFizzOrBuzzOrFizzBuzz(int i){
		
		String output = "";
		
			if(i%3 == 0 && i%5 == 0){
				output= "FizzBuzz";
			}
				
			else if(i%3 == 0 ){
				output= "Fizz";
			}
			
			else if(i%5 == 0){
				output= "Buzz";
			}
			
			
			else{
				output = Integer.toString(i);
			}

			return output;
			
		}
	
public String giveNumberFizzOrBuzzOrFizzBuzzVariation(String i){
		
		String output = "";
		
			if(i.contains("3") && i.contains("5")){
				output= "FizzBuzz";
			}
				
			else if(i.contains("3") ){
				output= "Fizz";
			}
			
			else if(i.contains("5")){
				output= "Buzz";
			}
			
			
			else{
				output = i;
			}

			return output;
			
		}
	
}
