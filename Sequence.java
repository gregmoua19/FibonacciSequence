import java.util.Scanner;

/**
 * This class will allow the user to see the Fibonacci
 * Sequence to an nth number inputed by them
 * @author Greg
 *
 */
public class Sequence {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		run(input);

	}
	
	
	public static void run(Scanner input) {
		
		System.out.println("Welcome to the Fibonacci's Sequence Displayer!");
		System.out.println("Please input the amount of numbers you would like to see displayed");
		System.out.println("Eg. entering '7' will display '1,1,2,3,5,8,11' ");
		int size = input.nextInt();
		
		int [] array = new int [size];
		
		//the first two numbers of 
		//Fibonacci will always be 1
		array[0] = 1;
		array[1] = 1;
		
		//length-2 because we will be reaching with i+1
		for(int i = 1; i < array.length-1; i++) {
			
			//this is saying 'the next number' is equal to 
			//'the current number' added to 'the previous number'
			array[i+1] = array[i] + array[i-1];
		}
		
		System.out.print(array[0]);
		//printing array[0] to deal with fencepost problem
		for(int i = 1; i < array.length;i++) {
			System.out.print(", " + array[i]);
		}

	}
}
