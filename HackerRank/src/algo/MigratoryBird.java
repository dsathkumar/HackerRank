package algo;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MigratoryBird {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] types = new int[n];
        int[] counts = new int[5];
        int max=0,max_type=0,min_type=0;
        
        for(int types_i=0; types_i < n; types_i++){
            types[types_i] = in.nextInt();
            
            switch(types[types_i]){
            
            case 1: 
            	counts[0] += 1;
            	break;
            	
            case 2:
            	counts[1] += 1;
            	break;
            	
            case 3:
            	counts[2] += 1;
            	break;
            	
            case 4:
            	counts[3] += 1;
            	break;
            	
            case 5:
            	counts[4] += 1;
            	break;
            }
                        
        }
        
        for (int i=0; i < counts.length; i++){
        	
        	if ( max < counts[i] ){
        		
            	max = counts[i];
            	
        		max_type = i+1;
        	
        	} else if ( max == counts[i] ){
        		
        		if (i+1 < max_type )
        			
        			max_type = i+1;
        	}
        	
        }
        
        System.out.println(max_type);
    }
}
