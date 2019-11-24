package day1.assignments;

public class ArmstrongNumber {
	
	/*
	 * Goal: To find whether a number is an Armstrong number or not
	 * 
	 * inputs: 153
	 * output: (1*1*1)+(5*5*5)+(3*3*3) = 153
	 * 
	 * Shortcuts:
	 * 1) Print : type: syso, followed by: ctrl + space + enter
	 * 2) To create a While loop, type 'while' followed by: ctrl + space + down arrow + enter
	 * 3) To create an 'if' condition: type 'if', followed by ctrl + space +down arrow + enter
	 *   
	 * What are my learnings from this code?
	 * 1)
	 * 2)
	 * 3) 
	 * 
	 */
	
	public static void main(String[] args) {
		
		// Declare your input
int i = 154;
		int temp = i;
		// Declare 3 more int variables as calculated, remainder, original (Tip: Initialize calculated alone)
		
		
		int sum = 0;
		// Assign input into variable original
		for (int k = 0; k < 3; k++) {
			int j=i%10;
			i=i/10;
			sum=sum+j*j*j  ;

		
		
		// Use loop to calculate: which loop to use until the number greater than 0??
		
			// Within loop: get the remainder when done by 10 (Tip: Use Mod operator)
			
			// Within loop: get the quotient when done by 10 (Tip: Assign the result to input)
			
			// Within loop: Add calculated with the cube of remainder & assign it to calculated
			
			
		
		// Check whether calculated and original are same
		
			//When it matches print it as Armstrong number
			
		
		
		
		
		
		
		
		
		
		

	}
if (sum == temp) {
	System.out.println("It is amstromg");

} else {
	System.out.println("It is not amstromg");

}
		
}
}