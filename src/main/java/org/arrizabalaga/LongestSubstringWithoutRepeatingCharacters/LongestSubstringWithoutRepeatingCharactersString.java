package org.arrizabalaga.LongestSubstringWithoutRepeatingCharacters;

/**
 * @author <a href="mailto:ivan.arrizabalaga@gmail.com">Ivan Arrizabalaga</a>
 */
public class LongestSubstringWithoutRepeatingCharactersString implements ILongestSubtringWithoutRepeatingCharacters{
	public int lengthOfLongestSubstring(String s) {
		if(s==null || s.length()==0){
			return 0;
		}

		String best = "";
		String current = "";
		int totalLength = s.length();
		for(int i=0;i<totalLength;i++){
			Character currentChar = s.charAt(i);

			int idxRepetition = current.indexOf(currentChar);
			if(idxRepetition==-1){
				//new?-> add it to current solution
				current+=currentChar;
			}else{
				//new best solution -> write it down
				if(current.length()>best.length()){
					best = current;
				}
				//update current solution
				if(idxRepetition==current.length()-1){
					current=""+currentChar;
				}else{
					current = current.substring(idxRepetition+1)+currentChar;
				}
			}

			//break condition to speed up
			if(totalLength-i-1+current.length()<=best.length()){
				break;
			}
		}
		return current.length()>best.length()?current.length():best.length();
	}
}
