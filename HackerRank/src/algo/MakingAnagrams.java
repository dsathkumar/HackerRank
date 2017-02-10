package algo;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MakingAnagrams {

	
    public static int numberNeeded(String first, String second) {
		
    	Map<Integer,String> hashmap = new HashMap<>();
    	int code=0;
    	int collition=0;
    	int length=0;
    	
    	for ( char c1 : first.toCharArray()) {
    		length+=1;
    		String c2 = Character.toString(c1);
    		code = c2.hashCode();
    		
    		hashmap.put(code,c2);
    	}
    	
    	for (char c2 : second.toCharArray()) {
    		
    		if(hashmap.containsKey(Character.toString(c2).hashCode())) {
    			++collition; 
    		}
    		
    	}
//    	Hashmap hm = new HashMap
    	
    	
    	return (length*2-collition*2);
        
    }

    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        System.out.println(numberNeeded(a, b));
	}

}
