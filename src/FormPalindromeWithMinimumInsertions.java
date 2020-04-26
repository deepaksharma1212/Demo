import java.util.ArrayList;
import java.util.List;

public class FormPalindromeWithMinimumInsertions {
	public static void main(String args[]) {
		String str = "ABCAD";
		List<String> set = new ArrayList<String>();
		
		//Case 1 String is already Palindrome
		if(checkForReverse(str))
			System.out.println(0);
		else if(str.substring(0,1).equals(str.substring(str.length()-1,str.length()))){
			//Case 2 First and last characters are same
			str = str.substring(1,str.length()-1);
			System.out.println(checkForDuplicateCharacters(set, str));
		}else {
			System.out.println(checkForDuplicateCharacters(set, str));
		}
		
	}
	
	public static int checkForDuplicateCharacters(List<String> set,String str) {
		
		set.clear();
		if(str == null || str.trim().equals("")) return 0;
		
		
		int i =0;
		String str2 = str;
		
		while(i<str2.length()) {
			if(i<str2.length()-1 && str2.substring(i+1).indexOf(str2.charAt(i)) != -1) {
				String tempStr = "";
				if(str2.substring(i+1).indexOf(str2.charAt(i)) == 0)
					tempStr = String.valueOf(str2.charAt(i)) + str2.substring(i+1);
				else
				    tempStr = String.valueOf(str2.charAt(i)) + str2.substring(i+1).substring(0,str2.substring(i+1).indexOf(str2.charAt(i))+1);
				if(tempStr.length()>2 && checkForReverse(tempStr)) {
					str2 = str2.replace(tempStr, "");
				}
			}
			
			i++;
		}
		char c[] = str2.toCharArray();
		for (int j = 0; j < c.length; j++) {
			if(j!=0) {
				if(!(c[j-1]== c[j]))
					set.add(String.valueOf(c[j]));
			}else
				set.add(String.valueOf(c[j]));
				
		}
		
		return set.size() == 0 ? 0 : set.size()-1;
	}
	
	public static boolean checkForReverse(String str) {
		if(str != null && !str.trim().equals(""))
			return str.equals(new StringBuffer(str).reverse().toString());
		return false;
	}
	
}
