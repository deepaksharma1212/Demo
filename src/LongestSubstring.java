import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class LongestSubstring {
	
	static HashSet<String> set = new HashSet<String>();
	public static void main (String[] args) {
		Scanner scn = new Scanner(System.in);
		List<String> list = new ArrayList();
		
		int totalCases = scn.nextInt();
		
		while(totalCases>0){
			list.add(scn.next());
			totalCases--;
		}
		for(String str : list) {
			System.out.println(str.length());
			System.out.println(findMaximumLengthString(str,str.length()-1));	
		}
		
	}

	public static int findMaximumLengthString(String str,int k){
		
		int l =0; 
		int h = str.length()-1;
		if(k==0) return str.length()-1;

		/*while(l<str.length()-1 && l+k+1 <=str.length()-1){
			if(checkForAllDistinctCharacters(str.substring(l,l+k+1)))
				return set.size();      
			l++;     
		}*/
		

		while(h>0 && h-k>=0  ){

			if(checkForAllDistinctCharacters(str.substring(h-k,h+1)))
				return set.size();     
						h--;
		}


		return findMaximumLengthString(str,k-1);
	}

	public static boolean checkForAllDistinctCharacters(String str){
		
		set.clear();
		char ch[] = str.toCharArray();
		for(int i=0;i<ch.length;i++){
			set.add(String.valueOf(ch[i]));
		}
		return str.length() == set.size();

	}
	}
