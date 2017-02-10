package algo;

import java.util.Scanner;

public class ArrayLeftRotation {
	 
	public static int[] arrayLeftRotation(int[] a, int n, int k) {
		
		int new_k = k%n;
		int op[] = new int[n];
		int op_start=0;
		int op_end=n-new_k;
		for (int i=new_k; i < n; i++ ) {
			
			op[op_start] = a[i];
		
			op_start++;
			
		}
		
		for (int j=0; j < new_k; j++) {
			
			op[op_end] = a[j]; 
			op_end++;
		}
		
		
		
		
		return op;
		 
		 
	 }
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
      
        int[] output = new int[n];
        output = arrayLeftRotation(a, n, k);
        for(int i = 0; i < n; i++)
            System.out.print(output[i] + " ");
      
        System.out.println();
      

	}

}
