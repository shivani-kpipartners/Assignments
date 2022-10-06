package ques7;

import java.util.HashSet;
import java.util.Set;

public class Sets {
	public static Set<Integer> numbers(){   
        // creating LinkedHashSet using the Set  
		Set<Integer> Set = new HashSet<Integer>();   
    
		Set.add(1); Set.add(2); Set.add(3); Set.add(4);Set.add(5); Set.add(6);Set.add(7); Set.add(8);
		Set.add(9); Set.add(10);Set.add(1); Set.add(2);Set.add(3); Set.add(4);Set.add(5); Set.add(6);
		Set.add(7); Set.add(8); Set.add(9); Set.add(10);

		return Set;   
    }
        public static void main1(String[] args) {
    		
    		
    		System.out.println("Last Item: " + numbers().stream().toList().get(numbers().size() - 1));
    		
    	}
    }   

