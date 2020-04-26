import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class LargestPalindrome {
	
	public static void main(String args[]) {
		
		Scanner scn = new Scanner(System.in);
		List<String> list = new ArrayList();
		HashMap<String,String> set = new HashMap<>();
		int totalCases = scn.nextInt();
		while(totalCases>0){
			list.add(scn.next());
			totalCases--;
		}
		for(String str : list){
			set.clear();
			String chk = "";
			  if(str.length() == 1) 
	            {
	                System.out.println(str);
	                continue;
	            }    
			for(int i=0;i<str.length();i++){
				for(int j=i+1;j<str.length();j++){
					chk = str.substring(i,j+1);

					if(isPalindrome(chk)){
						if(set.containsKey("key")) {
							if(set.get("key").length() < chk.length())
								set.put("key", chk);
						}
						else
							set.put("key", chk);
							
					}else {
						if(!set.containsKey("key")) {
							set.put("key", str.substring(i,j));
						}
					}
				}
			}
			System.out.println(set.containsKey("key") ? set.get("key") :"");
		}
	}


	public static boolean isPalindrome(String str){
		StringBuffer buf = new StringBuffer(str);
		return str.equals(buf.reverse().toString());
	}
}
