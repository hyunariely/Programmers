import java.util.*;

class Solution {
	
    public int solution(String s) {
    	
		int answer = 0;
        ArrayList<Integer> sList = new ArrayList<Integer>();
        
        for (int stepSize = 1; stepSize <= s.length(); stepSize++) {
        	
        	int maxIndex = s.length() / stepSize;
        	String remainder = "";
        	
        	if (s.length() % stepSize > 0) {
        		
        		remainder = s.substring(s.length() - (s.length() % stepSize));
        		
        	}
        	
        	int index = 0;
        	String newS = "";
        	
        	while (index < maxIndex) {
        		
        		String target = s.substring(index * stepSize, (index + 1) * stepSize);
        		int count = 1;
        		index += 1;
        		
        		while (index < maxIndex) {
        			
        			String compare = s.substring(index * stepSize, (index + 1) * stepSize);
        			
        			if (target.equals(compare)) {
        				
        				count++;
        				index++;
        				
					} else {
						
						break;
						
					}
        			
				}
        		
        		if (count == 1) {
        			
        			newS += target;
        			
				} else {
					
					newS += target + String.valueOf(count);
					
				}
			}
        	
        	newS += remainder;
        	
        	sList.add(newS.length());
        }
        
        answer = Collections.min(sList);
        
        return answer;
    }
    
}