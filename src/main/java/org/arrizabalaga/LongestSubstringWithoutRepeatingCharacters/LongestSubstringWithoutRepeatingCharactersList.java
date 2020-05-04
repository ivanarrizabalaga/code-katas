package org.arrizabalaga.LongestSubstringWithoutRepeatingCharacters;

import java.util.ArrayList;
import java.util.List;

/**
 * @author <a href="mailto:ivan.arrizabalaga@gmail.com">Ivan Arrizabalaga</a>
 */
public class LongestSubstringWithoutRepeatingCharactersList implements ILongestSubtringWithoutRepeatingCharacters{
	public int lengthOfLongestSubstring(String s) {
		if(s==null || s.length()==0){
			return 0;
		}

		List<Character> best = new ArrayList<>();
		List<Character> current = new ArrayList<>();
		int totalLength = s.length();
		for(int i=0;i<totalLength;i++){
			Character currentChar = s.charAt(i);

			int idxRepetition = current.indexOf(currentChar);
			if(idxRepetition==-1){
				//new?-> add it to current solution
				current.add(currentChar);
			}else{
				//new best solution -> write it down
				if(current.size()>best.size()){
					best = new ArrayList<>(current);
				}
				//update current solution
				if(idxRepetition==current.size()-1){
					current=new ArrayList<>();
					current.add(currentChar);
				}else{
					current = current.subList(idxRepetition+1, current.size());
					current.add(currentChar);
				}
			}

			//break condition to speed up
			if(totalLength-i-1+current.size()<=best.size()){
				break;
			}
		}
		return current.size()>best.size()?current.size():best.size();
	}
}
