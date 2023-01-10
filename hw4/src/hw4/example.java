package hw4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class example {
	
	public static void table(ArrayList<Integer> myLst) {
		
		HashMap<Integer, Integer> frequency = new HashMap<>();
		
		
		
		for(int i=0 ; i<myLst.size() ; i++) {
			
			if(!frequency.containsKey(myLst.get(i))) {
				frequency.put(myLst.get(i), 1);
				
			} else {
				frequency.put(myLst.get(i), frequency.get(myLst.get(i))+1);
			}
		}
		
		
		
		
		
		Map<Object, Object> sortedMap = frequency.entrySet().stream()
		        .sorted(Comparator.comparingInt(e -> e.getValue()))
		        .collect(Collectors.toMap(
		        		
		        		
		                Map.Entry::getKey,
		                Map.Entry::getValue,
		                (a, b) -> { throw new AssertionError(); },
		                LinkedHashMap::new
		        ));
		
		
		for(Object key : sortedMap.keySet()) {
			System.out.println(key +"\t:\t"+ sortedMap.get(key));
		}
	}
	
	
	
	
	
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> numbers= new ArrayList<Integer>();
		
		
		numbers.add(100);
		numbers.add(56);
		numbers.add(33);
		numbers.add(12);
		numbers.add(8);
		numbers.add(8);
		
		
		table(numbers);

	}

}
