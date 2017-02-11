package algo;

import java.util.Arrays;
import java.util.Scanner;

public class BalancedBrackets {

	 public static boolean isBalanced(String expression) {
		 boolean result=false;
		 char[] exp = expression.toCharArray();
		 int mid_size = exp.length/2;
		 int reverse_counter=0;
		 
		 char[] exp_first = Arrays.copyOfRange(exp, 0, mid_size);
		 char[] exp_second = Arrays.copyOfRange(exp, mid_size, exp.length);
		 
		 reverse_counter = exp_first.length-1;
		 
		 for ( int i=0; i < exp_first.length; i++){
			 
		
			 if ( exp_first[i] == '(' && exp_second[reverse_counter] == ')' ){
				 
				 result = true;
				 
			 } else if ( exp_first[i] == '{' && exp_second[reverse_counter] == '}' )
				 
				 result = true;
			 
			 else  if ( exp_first[i] == '[' && exp_second[reverse_counter] == ']' )
			
				 result = true;
			 
			 else 
			
				 result = false;
			 
			 reverse_counter += -1; 
		 
		 }
		return result;
		 
	 }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner in = new Scanner(System.in);
	        int t = in.nextInt();
	        for (int a0 = 0; a0 < t; a0++) {
	            String expression = in.next();
	            System.out.println( (isBalanced(expression)) ? "YES" : "NO" );
	        }

	}
}
