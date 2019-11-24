package day1.classroom;

public class SwitchOperator {

	/*
	 * Goal: Perform calculation based on the user input operations
	 * 
	 * inputs: 2,3 and "add"
	 * output: added value: 5
	 * 
	 * Shortcuts:
	 * 1) Print : type: syso, followed by: ctrl + space + enter
	 * 2) To create a Switch case: type 'switch', followed by: ctrl + space + down arrow + enter
	 *   
	 * What are my learnings from this code?
	 * 1)
	 * 2)
	 * 3) 
	 * 
	 */	

	public static void main(String[] args) {

		// Declare 2 integer numbers
		int a = 1;
		int b = 2;

		// Declare a String variable with input as operations (Tip:
		String operation = "add";
		int add = a+b;
		int sub = a-b;
		int mul = a*b;
		int div = a/b;


		// Initiate switch case for operations

		switch (operation) {
		case "add":
			System.out.println("Print the value" + add);
			break;
		case "sub":
			System.out.println("Print the value" + sub);
			break;
		case "mul":
			System.out.println("Print the value" + mul);
			break;
		case "div":
			System.out.println("Print the value" + div);
			break;
		default:
			System.out.println("System unable to print");
			break;
		}
		// Within switch, include as case for add operation


		// Within switch, include as case for sub operation


		// Within switch, include as case for mul operation


		// Within switch, include as case for div operation


		// Within switch, include 'default' to handle other operations


		//end of switch case

	}

}
