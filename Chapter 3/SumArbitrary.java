/*Code for checking the sum of an Arbitrary Number of Positive Integers*/
import java.util.Scanner;

public class SumArbitrary{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
		int num;
		
		System.out.println("Enter positive integers (enter -1 to end):");	
		
		while (true){
			 num = input.nextInt();
			 if (num == -1){
				 break;
			 } 
			 if (num > 0){
				 sum += num;
			 }
			 else{
		       System.out.println("Enter a Positive integer:");	
			 }
		}
	    System.out.println("Sum of entered postive integers: " + sum);	
		 
    }
}