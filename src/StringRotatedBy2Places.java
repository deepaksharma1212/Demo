import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class StringRotatedBy2Places {
	public static void main (String[] args) {
		Scanner scn = new Scanner(System.in);
		List<String> list = new ArrayList();
		
		int totalCases = scn.nextInt();
		totalCases *=2;
		while(totalCases>0){
			list.add(scn.next());
			totalCases--;
		}
		int i=0;
		if(list.size()%2 !=0)System.exit(0);
		while(i<list.size()) {
			checkForString(list.get(i), list.get(i+1));
			i+=2;
		}
		
		
	}
	
	public static void checkForString(String str1,String str2) {
		if(str1.length() == str2.length() && str1.length() >=2){
		    boolean flag =false;
		    
		    if((str1.substring(2,str1.length())+""+str1.substring(0,2)).equals(str2)) {
		    	
		    	flag = true;
		    }else if((str1.substring(str1.length()-2,str1.length())+""+str1.substring(0,str1.length()-2)).equals(str2)) {
		    	flag = true;
		    	System.out.println("Enter2");
		    }
		    	if(flag)
		    		System.out.println(1);
		    	else
		    		System.out.println(0);
		    	
		}
	}
}
