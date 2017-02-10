package algo;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RansomNote {
	
	Map<String, Integer> magazineMap;
    Map<String, Integer> noteMap;
    String[] arraylist_mag;
    String[] arraylist_note;
    
    public RansomNote(String magazine, String note) {
//        int count_note = 0;
        
    	int mag_length = magazine.split(" ").length;
    	int note_length = note.split(" ").length;
    	
    	arraylist_mag = magazine.split(" ");
    	arraylist_note = note.split(" ");
    	
    	magazineMap = new HashMap<>();
    	noteMap = new HashMap<>();
    	
    	for (int i=0; i< arraylist_mag.length; i++){
    		
    		int count_mag = 1;
            	
    		if (!magazineMap.containsKey(arraylist_mag[i]))
    		
    			magazineMap.put(arraylist_mag[i], count_mag);
    		
    		else {
    			
    			count_mag = magazineMap.get(arraylist_mag[i]);
    			
    			magazineMap.put(arraylist_mag[i], count_mag+1);
    			
    		}
    		
    	}
    	
    	for (int j=0; j < arraylist_note.length; j++){
    		
    		int count_note = 1;
    		
    		if (!noteMap.containsKey(arraylist_note[j]))
    		
    			noteMap.put(arraylist_note[j], count_note);
    		else {
    			
    			count_note = noteMap.get(arraylist_note[j]);
    			
    			noteMap.put(arraylist_note[j], count_note+1);
    			
    		}
    	}
    }
    
    public boolean solve() {
        boolean result;
    	
    	for (Map.Entry<String, Integer> entry : noteMap.entrySet()) {
    		
    		if ( magazineMap.containsKey(entry.getKey()) && magazineMap.get(entry.getKey()) >= entry.getValue() ){
    			
    			result = true;
    			
    		}
    		else {
    			
    			return result=false;
    		
    		}
    		
    	}
		return true;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        
        // Eat whitespace to beginning of next line
        scanner.nextLine();
        
        RansomNote s = new RansomNote(scanner.nextLine(), scanner.nextLine());
        scanner.close();
        
        boolean answer = s.solve();
        if(answer)
            System.out.println("Yes");
        else System.out.println("No");
		
	}

}
