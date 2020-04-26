import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class RemoveAdjacentWords {
	public static void main (String[] args) {
		Scanner scn = new Scanner(System.in);
		List<String> list = new ArrayList();
		HashMap<String,String> set = new HashMap<>();
		int totalCases = scn.nextInt();
		while(totalCases>0){
			list.add(scn.next());
			totalCases--;
		}
		ArrayList<String> list1 = new ArrayList<>();
		for(String str : list){
		list.clear();
		recursive(str,null,0,list1);
		System.out.println(list.get(0));
		}
	}
	
	public static int recursive(String str,String first,int index,ArrayList<String> list ){
	    
		if(index > str.length()-1) return 0;
		if(str.length() == 1) { list.add(str);return 0;}
	    String firstChar = String.valueOf(str.charAt(index));
	    int lastIndex = index;
	    if(first == null){
	        index++;
	        int last = recursive(str,firstChar,index,list);
	        if(lastIndex > last) return 0;
	        String strToReplace = str.substring(lastIndex,last);
	        if(strToReplace.length() == 1 )
	        	recursive(str,null,index++,list);
	        else {
	        	str = str.replace(strToReplace, "");
	        recursive(str,null,0,list);
	        }
	        if(list.isEmpty() ) list.add(str);
	        
	    } 
	    else{
	        if(first.equals(firstChar)){
	            index++;
	            return recursive(str,firstChar,index,list);
	        }else{
	            return lastIndex;
	        }   
	    }
	        
	        return -1;
	}
}
